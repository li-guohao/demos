package cn.liguohao.demo.dp.recombination.third;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/10/5 12:21
 */
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName()+": Quack");
    }
}
