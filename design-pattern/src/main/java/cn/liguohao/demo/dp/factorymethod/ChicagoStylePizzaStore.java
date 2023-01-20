package cn.liguohao.demo.dp.factorymethod;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 14:28
 */
public class ChicagoStylePizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoGreekPizza();
                break;
            default:
                throw new RuntimeException("no this type pizze");
        }
        return pizza;
    }
}
