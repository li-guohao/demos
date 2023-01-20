package cn.liguohao.demo.dp.simplefactory;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/9/21 14:37
 */
public class FactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getDescription());
        Pizza greek = pizzaStore.orderPizza("greek");
        System.out.println(greek.getDescription());
    }
}
