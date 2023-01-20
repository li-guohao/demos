package cn.liguohao.demo.dp.duck;

import cn.liguohao.demo.dp.duck.behavior.impl.FlyNoWay;
import cn.liguohao.demo.dp.duck.behavior.impl.Quack;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/9/17 15:59
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();   // at first, model duck can not fly
        quackBehavior = new Quack();    // model duck can quack
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
