package cn.liguohao.demo.dp.recombination.first;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/10/5 12:28
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName() + ": Squack");
    }
}
