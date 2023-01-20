package cn.liguohao.demo.dp.adaptor;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/30 9:11
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble~~~ gobble~~~");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance...");
    }
}
