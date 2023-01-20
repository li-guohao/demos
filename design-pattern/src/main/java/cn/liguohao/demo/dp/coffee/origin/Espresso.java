package cn.liguohao.demo.dp.coffee.origin;

/**
 * @Description  a esspress(beverage)
 * @Author liguohao
 * @Date 2020/9/20 22:36
 */
public class Espresso extends Beverage {

    public Espresso() {
        // init description 0n create instance
        description = "Espresso";
    }

    @Override
    public double cost() {
        // espresso cost $1.99
        return 1.99;
    }
}
