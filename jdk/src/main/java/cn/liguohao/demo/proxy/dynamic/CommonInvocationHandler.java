package cn.liguohao.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 通用动态代理
 * @Author liguohao
 * @Date 2020/12/9
 */
public class CommonInvocationHandler<T> implements InvocationHandler {

    /**
     * 被代理的目标对象
     */
    private T target;


    /**
     * 绑定被代理对象
     * @return 代理后的对象
     */
    public T bind(T target){
        this.target = target;
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this::invoke);
    }

    /**
     * 执行方法
     * @see InvocationHandler#invoke(Object, Method, Object[]) 
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    /**
     * 方法执行之前的操作
     */
    private void before(){
        System.out.println("方法执行前的操作");
    }

    /**
     * 方法执行后的操作
     */
    private void after(){
        System.out.println("方法执行后的操作");
    }
}
