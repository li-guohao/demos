package cn.liguohao.demo.dp.coffee.decorator;

import cn.liguohao.demo.dp.coffee.origin.Beverage;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/9/21 3:44
 */
public class Mocha extends CondimentDecorator {
    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
