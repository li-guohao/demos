package cn.liguohao.demo.dp.recombination.fourth;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/5 13:01
 */
public abstract class QuackableAbstractFactory {
    /** 创建一个可以叫(鸭子)对象
     * @return
     */
    abstract Quackable createQuackable(Class clazz);

    /** 创建一个适配 o 的 对象
     * @param clazz 需要创建的对象
     * @param o 被适配的对象
     * @return
     */
    abstract Quackable createQuackableAdapter(Class clazz,Object o);
}
