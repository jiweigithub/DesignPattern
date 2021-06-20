package com.jiwei.headfirst.behavioral.section2_observer.before;

public class WeatherData {

    float temperature;

    float humidity;

    float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        //调用get方法，获取最近的测量值
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

//        调用每个布告板更新显示，传入最新的测量数据
//        currentConditionsDisplay.update(temp,humidity,pressure);
//        statisitcsDisplay.update(temp,humidity,pressure);
//        forecastDisplay.update(temp,humidity,pressure);

        /**
         * 存在问题：
         * 1、针对具体的实现编程，导致后期增加或删除布告板时必须修改measurementsChanged方法；
         * 2、未将改变的部分进行封装，至少update方法看起来像是一个统一的接口，方法名，参数都一致；
         */
    }


}
