package cn.liguohao.demo.dp.recombination.fiveth;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description TODO 这是可叫的(鸭子)集合
 * @Author liguohao
 * @Date 2020/10/5 13:44
 */
public class Flock implements Quackable{

    private ArrayList<Quackable> quackables = new ArrayList<Quackable>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    /**
     * 用迭代器模式，遍历集合，执行动作
     */
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }
}
