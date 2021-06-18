package com.jiwei.headfirst.create.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println(Thread.currentThread().getName() + "\t进入构造");
    }

    /**
     * （线程不安全）
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 方法级加锁(效率较低) 线程安全 但不能防止反射破坏
     *
     * @return
     */
    public static synchronized LazySingleton getInstanceSync() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 双重检锁机制 线程安全 但不能防止反射破坏
     *
     * @return
     */
    public static LazySingleton getInstanceDCL() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    //不是一个原子性操作
                    //需要将private static LazySingleton instance = null;
                    //改为private volatile static LazySingleton instance = null;
                    instance = new LazySingleton();
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     */
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstanceDCL();
                System.out.println(Thread.currentThread().getName() + "\t" + instance.hashCode());
            }).start();
        }
    }

}
