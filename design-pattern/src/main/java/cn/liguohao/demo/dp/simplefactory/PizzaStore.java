package cn.liguohao.demo.dp.simplefactory;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/9/21 13:54
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type){
        Pizza pizza = null;

        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
