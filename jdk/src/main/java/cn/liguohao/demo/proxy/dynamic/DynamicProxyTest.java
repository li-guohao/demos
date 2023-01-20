package cn.liguohao.demo.proxy.dynamic;


/**动态代理测试
 * @Author liguohao
 * @Date 2020/12/9
 */
public class DynamicProxyTest {

    /**
     * 正常调用
     */
    public void normal(){
        UserDao userDao = new UserDaoImpl();
        userDao.regist();
        userDao.login();
    }

    /**
     * 动态代理调用
     */
    public void dynaimcProxy(){
        CommonInvocationHandler<UserDao> userDaoCommonInvocationHandler = new CommonInvocationHandler<UserDao>();

        UserDao userDao = userDaoCommonInvocationHandler.bind(new UserDaoImpl());
        userDao.regist();
        userDao.login();


    }
}
