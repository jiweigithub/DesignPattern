package com.jiwei.headfirst.create.singleton;

/**
 * 饿汉模式(线程安全)
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                HungrySingleton instance = HungrySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "\t" + instance.hashCode());
            }).start();
        }
    }

}
