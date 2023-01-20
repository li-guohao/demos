package cn.liguohao.demo.dp.recombination.sixth;

/**
 * @Description TODO 被观察者
 * @Author liguohao
 * @Date 2020/10/5 14:24
 */
public interface QuackObservable {
    public void registerObserver(QuackObserver quackObserver);
    public void notifyObservers();
}
