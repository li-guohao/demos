package cn.liguohao.demo.dp.duck;

import cn.liguohao.demo.dp.duck.behavior.impl.FlyRocketPowered;

/**
 * @Description duck test
 * @Author liguohao
 * @Date 2020/9/17 15:53
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("------------------------");

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly(); // befor change fly behavior
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // after change fly behavior

        System.out.println("------------------------");



    }
}
