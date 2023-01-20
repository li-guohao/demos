package cn.liguohao.demo.dp.recombination.sixth;

/**
 * @Description TODO 呱呱加学家
 * @Author liguohao
 * @Date 2020/10/5 14:41
 */
public class Quackologist implements QuackObserver{
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println( this.getClass().getSimpleName()+" find " + quackObservable.getClass().getSimpleName() + ": "+ "quack");
    }
}
