package cn.liguohao.demo.dp.recombination.first;

/**
 * @Description
 * @Author liguohao
 * @Date 2020/10/5 12:20
 */
public class MallardDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName()+": Quack");
    }
}
