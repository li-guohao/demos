package cn.liguohao.demo.dp.singleton;

/**单例模式 双重锁保障线程安全 双重锁相较直接在方法上加 synchronized 关键字，性能有一定的提升。
 * @Author liguohao
 * @Date 2020/9/24 19:24
 */
public class SingletonDobLock {

    // 单例模式的内置管理的唯一对象 , volatile将变量标记为 存储于主内存中
    private volatile static SingletonDobLock uniqueInstance;

    // 构造私有化，不允许通过 new 新建实例
    private SingletonDobLock() {
    }

    // 提供类级别的方法，返回需要用到的实例对象 , 使用双重锁保障线程安全
    public static SingletonDobLock getInstance(){
        if(uniqueInstance == null) { // 当前线程缓存区域检查
            synchronized (SingletonDobLock.class){ //主内存同步代码块检查
                if(uniqueInstance==null) uniqueInstance = new SingletonDobLock();
            }
        }
        return uniqueInstance;
    }

    // 其它方法
    // ...

}
