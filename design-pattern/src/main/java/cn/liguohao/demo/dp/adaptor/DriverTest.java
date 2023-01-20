package cn.liguohao.demo.dp.adaptor;

/**
 * @Description 运行测试
 * @Author liguohao
 * @Date 2020/9/30 9:23
 */
public class DriverTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdaptorDuck = new TurkeyAdaptorDuck(wildTurkey);

        System.out.println("Duck say :");
        mallardDuck.quack();//Quack~~~
        mallardDuck.fly();  //I am flying...
        System.out.println("------------");

        System.out.println("Turkey say :");
        wildTurkey.gobble();//Gobble~~~ gobble~~~
        wildTurkey.fly();   //I am flying a short distance...
        System.out.println("------------");

        System.out.println("TurkeyAdaptor say :");
        turkeyAdaptorDuck.quack();  //Gobble~~~ gobble~~~
        turkeyAdaptorDuck.fly();    //I am flying a short distance... X5


    }
}
