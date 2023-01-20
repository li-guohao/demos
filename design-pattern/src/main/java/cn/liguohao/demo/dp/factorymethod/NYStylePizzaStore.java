package cn.liguohao.demo.dp.factorymethod;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/9/21 14:28
 */
public class NYStylePizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "greek":
                pizza = new NYGreekPizza();
                break;
            default:
                throw new RuntimeException("no this type pizze");
        }
        return pizza;
    }
}
