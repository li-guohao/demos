package cn.liguohao.demo.dp.duck.behavior.impl;

import cn.liguohao.demo.dp.duck.behavior.QuackBehavior;

/**
 * @Description mute quack
 * @Author liguohao
 * @Date 2020/9/17 15:50
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
