package cn.liguohao.demo.dp.observer;

/**
 * @Description 当前天气布告板
 * @Author liguohao
 * @Date 2020/9/17 18:40
 */
public class CurrentConditionDisplay extends BaseDisplay{

    public CurrentConditionDisplay(Subject weatherDataSubject) {
        super(weatherDataSubject);
    }
}
