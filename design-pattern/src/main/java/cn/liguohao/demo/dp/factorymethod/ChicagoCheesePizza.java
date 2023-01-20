package cn.liguohao.demo.dp.factorymethod;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 14:08
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        this.name = "Chicago Style CheesePizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        super.cut();
        System.out.println("Cutting the pizza into square slices");
    }
}
