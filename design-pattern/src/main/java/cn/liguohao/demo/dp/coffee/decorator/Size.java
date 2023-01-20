package cn.liguohao.demo.dp.coffee.decorator;

import cn.liguohao.demo.dp.coffee.origin.Beverage;
import cn.liguohao.demo.dp.coffee.origin.BeverageSize;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/9/21 4:18
 */
public class Size extends CondimentDecorator {
    protected Beverage beverage;


    public Size(Beverage beverage, BeverageSize size) {
        this.beverage = beverage;
        this.size = size;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Size";
    }

    @Override
    public double cost() {
        double increase = 0;
        double cost = beverage.cost();
        Enum size = this.size;
        if(BeverageSize.TALL==(size)){
            increase = .10;
        }else if(BeverageSize.GRANDE==(size)){
            increase = .15;
        }else if(BeverageSize.VENTI==size) {increase = .20;}
        else throw new RuntimeException("please input size");
        return cost + increase;
    }
}
