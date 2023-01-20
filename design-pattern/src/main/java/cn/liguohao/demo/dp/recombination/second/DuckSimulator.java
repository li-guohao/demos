package cn.liguohao.demo.dp.recombination.second;

/**
 * @Description TODO 鸭子模拟器
 * @Author liguohao
 * @Date 2020/10/5 12:29
 */
public class DuckSimulator{
    public static void main(String[] args) {
        new DuckSimulator().simulator();
    }

    void simulator(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose()); //看起来像个鸭子一样，其实是只鹅在叫

        System.out.println("\nDuck Simulator");

        simulator(mallardDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
        simulator(goose);

    }

    void simulator(Quackable quackable){
        quackable.quack();
    }
}
