package cn.liguohao.demo.dp.recombination.third;

/**
 * @Description  鸭鸣器
 * @Author liguohao
 * @Date 2020/10/5 12:27
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName() + ": Kwak");
    }
}
