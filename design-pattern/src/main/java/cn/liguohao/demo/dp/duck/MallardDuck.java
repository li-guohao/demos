package cn.liguohao.demo.dp.duck;

import cn.liguohao.demo.dp.duck.behavior.impl.FlyWithWings;
import cn.liguohao.demo.dp.duck.behavior.impl.Quack;

/**
 * @Description mallard duck
 * @Author liguohao
 * @Date 2020/9/17 15:53
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();        // mallard duck can quack
        flyBehavior = new FlyWithWings();   // mallard duck can fly
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck...");
    }
}
