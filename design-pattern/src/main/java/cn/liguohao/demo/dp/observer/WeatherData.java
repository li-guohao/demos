package cn.liguohao.demo.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**天气数据
 * @Author liguohao
 * @Date 2020/9/17 18:29
 */
public class WeatherData implements Subject{
    private List<Observer> observers;   // 观察者列表
    private float temperature;          // 温度
    private float humidity;             // 湿度
    private float pressure;             // 气压

    // 对象实例化构造
    public WeatherData() {
        this.observers = new ArrayList(); // 实例化观察者列表
    }
    // 注册观察者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    // 移除观察者
    @Override
    public void removeObserver(Observer observer) {
        if(observers.indexOf(observer) > 0) observers.remove(observer);
    }
    // 通知观察者
    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }
    // 数据更新触发函数
    public void measurementsChanged(){
        notifyObserver();
    }
    // 模拟数据更新
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
