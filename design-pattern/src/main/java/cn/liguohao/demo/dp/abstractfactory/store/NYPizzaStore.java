package cn.liguohao.demo.dp.abstractfactory.store;

import cn.liguohao.demo.dp.abstractfactory.factory.NYPizzaIngredientFactory;
import cn.liguohao.demo.dp.abstractfactory.factory.PizzaIngredientAbstractFactory;
import cn.liguohao.demo.dp.abstractfactory.pizza.CheesePizza;
import cn.liguohao.demo.dp.abstractfactory.pizza.PepperoniPizza;
import cn.liguohao.demo.dp.abstractfactory.pizza.Pizza;
import cn.liguohao.demo.dp.abstractfactory.pizza.VeggiePizza;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 16:17
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientAbstractFactory factory = new NYPizzaIngredientFactory();

        switch (type){
            case "cheese":
                pizza = new CheesePizza(factory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(factory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(factory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            default:
                throw new RuntimeException("sorry, no this type pizza");
        }
        return pizza;
    }
}
