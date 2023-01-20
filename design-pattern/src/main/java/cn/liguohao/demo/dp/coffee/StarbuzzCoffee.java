package cn.liguohao.demo.dp.coffee;

import cn.liguohao.demo.dp.coffee.decorator.Mocha;
import cn.liguohao.demo.dp.coffee.decorator.Size;
import cn.liguohao.demo.dp.coffee.decorator.Soy;
import cn.liguohao.demo.dp.coffee.decorator.Whip;
import cn.liguohao.demo.dp.coffee.origin.*;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/9/21 3:54
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        System.out.println(beverage.getDescription() +"---"+beverage.cost());

        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getClass().getName());
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getClass().getName());
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + "---" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + "---" + houseBlend.cost());

        Beverage tallHouseBlend = new HouseBlend();
        System.out.println(tallHouseBlend.getDescription() + "---" + tallHouseBlend.cost() +"---"+tallHouseBlend.getSize());
        tallHouseBlend = new Size(tallHouseBlend, BeverageSize.VENTI);
        System.out.println(tallHouseBlend.getDescription() + "---" + tallHouseBlend.cost() +"---"+tallHouseBlend.getSize());
        tallHouseBlend = new Mocha(tallHouseBlend);
        System.out.println(tallHouseBlend.getDescription() + "---" + tallHouseBlend.cost() +"---"+tallHouseBlend.getSize());
    }
}
