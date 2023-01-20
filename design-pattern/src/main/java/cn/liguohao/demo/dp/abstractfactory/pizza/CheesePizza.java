package cn.liguohao.demo.dp.abstractfactory.pizza;

import cn.liguohao.demo.dp.abstractfactory.factory.PizzaIngredientAbstractFactory;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/9/21 16:04
 */
public class CheesePizza extends Pizza {
    PizzaIngredientAbstractFactory factory;

    public CheesePizza(PizzaIngredientAbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clam = factory.createClam();
    }
}
