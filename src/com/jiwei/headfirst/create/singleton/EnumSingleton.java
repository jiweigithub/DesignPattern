package com.jiwei.headfirst.create.singleton;

/**
 * 使用枚举实现单例模式
 */
public enum  EnumSingleton {
    INSTANCE;

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                EnumSingleton instance = EnumSingleton.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
