package cn.liguohao.demo.dp.abstractfactory.store;

import cn.liguohao.demo.dp.abstractfactory.pizza.Pizza;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 13:54
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
