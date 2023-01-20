package cn.liguohao.demo.dp.adaptor;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/30 9:08
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack~~~");
    }

    @Override
    public void fly() {
        System.out.println("I am flying...");
    }
}
