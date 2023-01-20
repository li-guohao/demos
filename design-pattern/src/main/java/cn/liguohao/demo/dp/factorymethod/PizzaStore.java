package cn.liguohao.demo.dp.factorymethod;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 13:54
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
