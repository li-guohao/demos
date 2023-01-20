package cn.liguohao.demo.dp.duck;

import cn.liguohao.demo.dp.duck.behavior.FlyBehavior;
import cn.liguohao.demo.dp.duck.behavior.QuackBehavior;

/**
 * @Description  duck
 * @Author liguohao
 * @Date 2020/9/17 15:39
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    };

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    // set
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
