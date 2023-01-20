package cn.liguohao.demo.dp.recombination.fourth;

/**
 * @Description  鸭子模拟器
 * @Author liguohao
 * @Date 2020/10/5 12:29
 */
public class DuckSimulator{
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
//        duckSimulator.simulator();
//        duckSimulator.simulatorCount();
        duckSimulator.simulator(new QuackableFactory());
        duckSimulator.simulator(new QuackCountFactory());

    }

    /**
     * 普通未被装饰
     */
    void simulator(){
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        Quackable goose = new GooseAdapter(new Goose()); //看起来像个鸭子一样，其实是只鹅在叫

        QuackableFactory quackableFactory = new QuackableFactory();
        Quackable mallardDuck = quackableFactory.createQuackable(MallardDuck.class);
        Quackable redheadDuck = quackableFactory.createQuackable(RedheadDuck.class);
        Quackable duckCall = quackableFactory.createQuackable(DuckCall.class);
        Quackable rubberDuck = quackableFactory.createQuackable(RubberDuck.class);
        Quackable goose = quackableFactory.createQuackableAdapter(GooseAdapter.class,new Goose());

        System.out.println("\nDuck Simulator");

        mallardDuck.quack();
        redheadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();
        goose.quack();

    }

    /**
     * 已经被装饰
     */
    void simulatorCount(){

//        Quackable mallardDuck = new QuackCount(new MallardDuck());
//        Quackable redheadDuck = new QuackCount(new RedheadDuck());
//        Quackable duckCall = new QuackCount(new DuckCall());
//        Quackable rubberDuck = new QuackCount(new RubberDuck());
//        Quackable goose = new QuackCount(new GooseAdapter(new Goose()));

        QuackCountFactory quackCountFactory = new QuackCountFactory();
        Quackable mallardDuck = quackCountFactory.createQuackable(MallardDuck.class);
        Quackable redheadDuck = quackCountFactory.createQuackable(RedheadDuck.class);
        Quackable duckCall = quackCountFactory.createQuackable(DuckCall.class);
        Quackable rubberDuck = quackCountFactory.createQuackable(RubberDuck.class);
        Quackable goose = quackCountFactory.createQuackableAdapter(GooseAdapter.class,new Goose());


        System.out.println("\nDuck Simulator Count");

        mallardDuck.quack();
        redheadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();
        goose.quack();

        System.out.println("All Quack count: "+ QuackCount.getQuackCount());

    }

    void simulator(QuackableAbstractFactory factory){
        boolean isQuackCountFactory = false;
        String hint = "\nDuck Simulator";
        if(factory instanceof QuackCountFactory){
            hint += " Count";
            isQuackCountFactory = true;
        }

        Quackable mallardDuck = factory.createQuackable(MallardDuck.class);
        Quackable redheadDuck = factory.createQuackable(RedheadDuck.class);
        Quackable duckCall = factory.createQuackable(DuckCall.class);
        Quackable rubberDuck = factory.createQuackable(RubberDuck.class);
        Quackable gooseAdapter = factory.createQuackableAdapter(GooseAdapter.class,new Goose());

       System.out.println(hint);

        mallardDuck.quack();
        redheadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();
        gooseAdapter.quack();

        if(isQuackCountFactory)   System.out.println("All Quack count: "+ QuackCount.getQuackCount());

    }

}
