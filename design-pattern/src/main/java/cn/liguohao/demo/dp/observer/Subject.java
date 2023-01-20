package cn.liguohao.demo.dp.observer;

/**主题
 * @Author liguohao
 * @Date 2020/9/17 18:01
 */
public interface Subject {
    // 注册观察者
    public void registerObserver(Observer observer);
    // 移除观察者
    public void removeObserver(Observer observer);
    // 通知观察者
    public void notifyObserver();
}
