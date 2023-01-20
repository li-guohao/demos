package cn.liguohao.demo.dp.observer;

/**气象站测试
 * @Author liguohao
 * @Date 2020/9/17 18:46
 */
public class WeatherStation {
    public static void main(String[] args) {
        // 创建主题
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 模拟数据变化
        weatherData.setMeasurements(80,66,30.4f);
        System.out.println("-------------------------------------");
        weatherData.setMeasurements(56,63,33.4f);
        System.out.println("-------------------------------------");
        weatherData.setMeasurements(70,46,28.4f);


        System.out.println("-------------使用java.util内置API实现观察者模式------------------------");
        // 使用java.util内置API实现观察者模式
        WeatherObserver weatherObserver = new WeatherObserver();

        BaseObserverDisplay baseObserverDisplay = new BaseObserverDisplay(weatherObserver);
        weatherObserver.setMeasurements(70,46,28.4f);


    }
}
