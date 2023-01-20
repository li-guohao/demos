package cn.liguohao.demo.jdk.jvm.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**java四种引用学习
 * @Author liguohao
 * @Date 2020/11/3 11:38
 */
public class ReferenceStudy {

    /**
     * 强引用
     * 把一个对象赋给一个引用变量，这个引用变量就是一个强引
     * 用。当一个对象被强引用变量引用时，它处于可达状态，它是不可能被垃圾回收机制回收的，即
     * 使该对象以后永远都不会被用到 JVM 也不会回收。因此强引用是造成 Java 内存泄漏的主要原因之一
     */
    public void strongReference(){
        UserRef hayashi = new UserRef("小林");
        //System.out.println(hayashi);
        //System.gc();
        ramUtil.drainMemory(1000); // 当内存不足时，JVM会调用GC进行垃圾回收
        // 总结
        //即使内存不足，JVM也不会回收强引用的对象(无论你的对象是否用到过)
    }

    /**
     * 软引用
     * 软引用需要用 SoftReference 类来实现，对于只有软引用的对象来说，当系统内存足够时它
     * 不会被回收，当系统内存空间不足时它会被回收。软引用通常用在对内存敏感的程序中。如缓存等
     */
    public void softReference(){
        SoftReference<UserRef> kana = new SoftReference<>(new UserRef("康娜"));//Finalizer--->cn.liguohao.jvm.reference.UserRef--->User{username='康娜'} 被 GC 回收了。
        ramUtil.drainMemory(695680);//java.lang.OutOfMemoryError: Java heap space
        //总结
        //内存不足，回收对象
    }

    /**
     * 弱引用
     * 弱引用需要用 WeakReference 类来实现，它比软引用的生存期更短，对于只有弱引用的对象
     * 来说，只要垃圾回收机制一运行，不管 JVM 的内存空间是否足够，总会回收该对象占用的内存。
     */
    public void weakReference(){
        WeakReference<UserRef> yui = new WeakReference<>(new UserRef("惟"));
        System.gc();
        // GC一运行就回收
    }

    /**
     * 虚引用
     * 虚引用需要 PhantomReference 类来实现，它不能单独使用，必须和引用队列联合使用。虚
     * 引用的主要作用是跟踪对象被垃圾回收的状态。
     */
    public void phantomReference(){
        ReferenceQueue<UserRef> queue = new ReferenceQueue<UserRef>();
        PhantomReference<UserRef> pr = new PhantomReference<UserRef>(new UserRef("忧"), queue);
        System.out.println(pr.get());
        ramUtil.drainMemory(1000);
    }

}


//重写了finalize方法的用户类
class UserRef extends User{

    public UserRef(String username) {
        super(username);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(Thread.currentThread().getName() + "--->" + this.getClass().getName() +"--->"+this +" 被 GC 回收了。");
    }
}
//内存工具类
class ramUtil {
    //消耗大量内存
    public static void drainMemory(Integer size){
        String[] array = new String[1024 * size];
        for(int i = 0; i < 1024 * 10; i++) {
            for(int j = 'a'; j <= 'z'; j++) {
                array[i] += (char)j;
            }
        }
    }
}