package com.jiwei.headfirst.create.singleton;

/**
 * 静态内部类实现单例 但不能防止反射破坏
 */
public class HolderSingleton {

    private HolderSingleton() {
    }

    private static class InnerHolder {
        private static final HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return InnerHolder.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                HolderSingleton instance = HolderSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "\t" + instance.hashCode());
            }).start();
        }
    }

}
