package cn.liguohao.demo.dp.singleton;

/**经典单例模式 急切实例化
 * @author liguohao
 * @since 2020/9/24 19:24
 */
public class SingletonUrgentLoading {

    /**
     * 单例模式的内置管理的唯一对象
     */
    private final static SingletonUrgentLoading UNIQUE_INSTANCE = new SingletonUrgentLoading();

    /**
     * 构造私有化，不允许通过 new 新建实例
     */
    private SingletonUrgentLoading() {
    }

    /**
     * 提供类级别的方法，返回需要用到的实例对象
     * @return 急切实例
     */
    public static SingletonUrgentLoading getInstance(){
        return UNIQUE_INSTANCE;
    }

    // 其它方法
    // ...

}
