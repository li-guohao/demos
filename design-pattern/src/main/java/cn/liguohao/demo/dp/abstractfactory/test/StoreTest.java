package cn.liguohao.demo.dp.abstractfactory.test;

import cn.liguohao.demo.dp.abstractfactory.pizza.Pizza;
import cn.liguohao.demo.dp.abstractfactory.store.NYPizzaStore;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/9/21 16:27
 */
public class StoreTest {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
