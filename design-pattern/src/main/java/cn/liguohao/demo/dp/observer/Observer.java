package cn.liguohao.demo.dp.observer;

/**
 * @Description 观察者 | 订阅者
 * @Author liguohao
 * @Date 2020/9/17 18:24
 */
public interface Observer {
    // 观察者更新
    public void update(float temp, float humidity, float pressure);
}
