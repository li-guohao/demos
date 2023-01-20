package cn.liguohao.demo.dp.simplefactory;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 13:54
 */
public class SimplePizzaFactory {

    Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                throw new RuntimeException("no this type pizze");
        }
        return pizza;
    }
}
