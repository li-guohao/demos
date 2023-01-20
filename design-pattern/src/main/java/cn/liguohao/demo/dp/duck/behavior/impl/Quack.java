package cn.liguohao.demo.dp.duck.behavior.impl;

import cn.liguohao.demo.dp.duck.behavior.QuackBehavior;

/**
 * @Description quack
 * @Author liguohao
 * @Date 2020/9/17 15:50
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack !! ");
    }
}
