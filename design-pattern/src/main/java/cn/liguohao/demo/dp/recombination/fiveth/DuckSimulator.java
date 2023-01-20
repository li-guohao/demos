package cn.liguohao.demo.dp.recombination.fiveth;

/**
 * @Description  鸭子模拟器
 * @Author liguohao
 * @Date 2020/10/5 12:29
 */
public class DuckSimulator{
    public static void main(String[] args) {

        QuackableAbstractFactory quackableFactory = new QuackableFactory();

        Quackable quackableCollection = quackableFactory.createQuackableCollection(Flock.class);
        Quackable quackableCollection2 = quackableFactory.createQuackableCollection(Flock.class);
        if(!(quackableCollection instanceof Flock)) throw new UnsupportedOperationException("不支持集合类："+Flock.class.getName());
        Flock flock = (Flock) quackableCollection;
        flock.add(quackableFactory.createQuackable(DuckCall.class));
        flock.add(quackableFactory.createQuackable(MallardDuck.class));


        Flock childFlock = (Flock) quackableCollection2;

        childFlock.add(quackableFactory.createQuackable(RedheadDuck.class));
        childFlock.add(quackableFactory.createQuackable(RubberDuck.class));

        flock.add(childFlock);

        flock.add(quackableFactory.createQuackableAdapter(GooseAdapter.class,new Goose()));

        flock.quack();

    }


}
