package cn.liguohao.demo.dp.singleton;

/**经典单例模式
 * @Author liguohao
 * @Date 2020/9/24 19:24
 */
public class SingletonLazyLoading {

    // 单例模式的内置管理的唯一对象
    private static SingletonLazyLoading uniqueInstance;

    // 构造私有化，不允许通过 new 新建实例
    private SingletonLazyLoading() {
    }

    // 提供类级别的方法，返回需要用到的实例对象
    public synchronized static SingletonLazyLoading getInstance(){
        if(uniqueInstance == null) uniqueInstance = new SingletonLazyLoading();
        return uniqueInstance;
    }

    // 其它方法
    // ...

}
