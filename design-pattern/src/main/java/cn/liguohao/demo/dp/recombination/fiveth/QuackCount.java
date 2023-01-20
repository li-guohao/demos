package cn.liguohao.demo.dp.recombination.fiveth;

/**
 * @Description  装设者 -装饰Quackable
 * @Author liguohao
 * @Date 2020/10/5 12:50
 */
public class QuackCount implements Quackable {

    private Quackable quackable;
    private static Integer quackCount = 0;

    public QuackCount(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        quackCount++;
    }

    public static Integer getQuackCount() {
        return quackCount;
    }
}
