package cn.liguohao.demo.dp.coffee.decorator;

import cn.liguohao.demo.dp.coffee.origin.Beverage;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 3:49
 */
public class Soy extends CondimentDecorator{

    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        // Soy cost &0.15
        return beverage.cost() + 0.15;
    }
}
