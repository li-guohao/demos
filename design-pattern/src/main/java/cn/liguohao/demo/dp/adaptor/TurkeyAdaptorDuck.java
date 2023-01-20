package cn.liguohao.demo.dp.adaptor;

/**
 * @Description TODO 火鸡适配器, 适配鸭子
 * @Author liguohao
 * @Date 2020/9/30 9:21
 */
public class TurkeyAdaptorDuck implements Duck{
    private Turkey turkey;

    public TurkeyAdaptorDuck(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++) turkey.fly();
    }
}
