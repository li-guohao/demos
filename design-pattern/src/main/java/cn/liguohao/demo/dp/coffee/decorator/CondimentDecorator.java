package cn.liguohao.demo.dp.coffee.decorator;

import cn.liguohao.demo.dp.coffee.origin.Beverage;

/**
 * @Description TODO condiment, a decorator for beverage.
 * @Author liguohao
 * @Date 2020/9/20 22:31
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * this method is same as Class Beverage getDesctiption method
     * @return 描述用字符串
     */
    @Override
    public abstract String getDescription();

}
