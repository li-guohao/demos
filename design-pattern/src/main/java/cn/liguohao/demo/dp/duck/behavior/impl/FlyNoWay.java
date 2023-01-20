package cn.liguohao.demo.dp.duck.behavior.impl;

import cn.liguohao.demo.dp.duck.behavior.FlyBehavior;

/**
 * @Description can not fly
 * @Author liguohao
 * @Date 2020/9/17 15:48
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can not fly...");
    }
}
