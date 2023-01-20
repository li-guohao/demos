package cn.liguohao.demo.dp.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description 通过java.util内置API实现观察者模式
 * @Author liguohao
 * @Date 2020/9/17 18:40
 */
public class BaseObserverDisplay implements Observer, DisplayElement{
    private float temperature;  // 温度
    private float humidity;     // 湿度
    private float pressure;     // 气压
    private float heatindex;    // 酷热指数
    private WeatherObserver weatherObserverSubject; // 天气主题

    public BaseObserverDisplay(WeatherObserver weatherObserverSubject) {
        this.weatherObserverSubject = weatherObserverSubject;
        weatherObserverSubject.addObserver(this);
    }
    // 展示数据
    @Override
    public void display() {
        System.out.println("基础布告板：\n"
                            +"温度："+this.temperature + "\t"
                            +"湿度："+this.humidity + "\t"
                            +"气压："+this.pressure + "\t"
                            +"酷热指数："+this.heatindex);
    }

    // 计算酷热指数 网址：https://www.wickedlysmart.com/head-first-design-patterns/
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    // 主题更新时调用的方法
    @Override
    public void update(Observable observable, Object object) {
        WeatherObserver observer = (WeatherObserver) observable;
        this.temperature = observer.getTemperature();
        this.humidity = observer.getHumidity();
        this.pressure = observer.getPressure();
        this.heatindex = computeHeatIndex(observer.getTemperature(),observer.getHumidity());
        display();
    }
}
