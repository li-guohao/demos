package cn.liguohao.demo.dp.recombination.third;

/**
 * @Description  鸭子模拟器
 * @Author liguohao
 * @Date 2020/10/5 12:29
 */
public class DuckSimulator{
    public static void main(String[] args) {
        new DuckSimulator().simulator();
    }

    void simulator(){
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        Quackable goose = new GooseAdapter(new Goose()); //看起来像个鸭子一样，其实是只鹅在叫

        Quackable mallardDuck = new QuackCount(new MallardDuck());
        Quackable redheadDuck = new QuackCount(new RedheadDuck());
        Quackable duckCall = new QuackCount(new DuckCall());
        Quackable rubberDuck = new QuackCount(new RubberDuck());
        Quackable goose = new QuackCount(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator");

        simulator(mallardDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
        simulator(goose);

        System.out.println("All Quack count: "+QuackCount.getQuackCount());

    }

    void simulator(Quackable quackable){
        quackable.quack();
    }
}
