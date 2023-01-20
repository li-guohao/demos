package cn.liguohao.demo.dp.coffee.origin;

/**
 * @Description TODO house blend coffee
 * @Author liguohao
 * @Date 2020/9/20 22:39
 */
public class HouseBlend  extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        // blend coffee cost $0.89
        return 0.89;
    }
}
