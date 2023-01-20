package cn.liguohao.demo.dp.observer;

import java.util.Observable;

/**
 * @Description 使用java.util包内置的观察者API实现
 * @Author liguohao
 * @Date 2020/9/17 19:23
 */
public class WeatherObserver extends Observable {

    private float temperature;          // 温度
    private float humidity;             // 湿度
    private float pressure;             // 气压

    // 模拟数据更新
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
