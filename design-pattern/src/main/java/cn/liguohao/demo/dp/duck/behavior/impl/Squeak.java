package cn.liguohao.demo.dp.duck.behavior.impl;

import cn.liguohao.demo.dp.duck.behavior.QuackBehavior;

/**
 * @Description squeak
 * @Author liguohao
 * @Date 2020/9/17 15:51
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
