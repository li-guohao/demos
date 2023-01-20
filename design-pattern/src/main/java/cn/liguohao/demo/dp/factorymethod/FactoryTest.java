package cn.liguohao.demo.dp.factorymethod;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/9/21 14:37
 */
public class FactoryTest {
    public static void main(String[] args) {
        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        System.out.println(nyStylePizzaStore.orderPizza("cheese").getName());
        System.out.println(nyStylePizzaStore.orderPizza("greek").getName());

        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        System.out.println(chicagoStylePizzaStore.orderPizza("cheese").getName());
        System.out.println(chicagoStylePizzaStore.orderPizza("greek").getName());

    }
}
