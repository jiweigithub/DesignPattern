package com.jiwei.headfirst.behavioral.section2_observer.after;

/**
 * 主题接口
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
