package cn.liguohao.demo.dp.observer;

/**
 * @Description 基础布告板 布告板的通用功能
 * @Author liguohao
 * @Date 2020/9/17 18:40
 */
public class BaseDisplay implements Observer, DisplayElement{
    private float temperature;  // 温度
    private float humidity;     // 湿度
    private float pressure;     // 气压
    private float heatindex;    // 酷热指数
    private Subject weatherDataSubject; // 天气主题

    public BaseDisplay(Subject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        weatherDataSubject.registerObserver(this);
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
    // 更新数据
    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature = temp;
       this.humidity = humidity;
       this.pressure = pressure;
       this.heatindex = computeHeatIndex(temp,humidity);
       display();
    }

    /**
     * 计算酷热指数
     * 网址：<a href="https://www.wickedlysmart.com/head-first-design-patterns/">https://www.wickedlysmart.com/head-first-design-patterns/</a>
     * @param t time
     * @param rh don't know
     * @return 酷热指数
     */
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
}
