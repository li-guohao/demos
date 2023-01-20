package cn.liguohao.demo.dp.coffee.origin;

/**
 * @Description TODO dark roast coffee
 * @Author liguohao
 * @Date 2020/9/20 22:41
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dart Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
