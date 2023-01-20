package cn.liguohao.demo.dp.recombination.sixth;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/10/5 12:21
 */
public class RedheadDuck implements Quackable,QuackObservable {

    ArrayList<QuackObserver> quackObservers = new ArrayList<QuackObserver>();

    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName()+": Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver quackObserver) {
        quackObservers.add(quackObserver);
    }


    @Override
    public void notifyObservers() {
        Iterator<QuackObserver> iterator = quackObservers.iterator();
        while (iterator.hasNext()){
            QuackObserver quackObserver = iterator.next();
            quackObserver.update(this);
        }
    }
}
