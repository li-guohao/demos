package cn.liguohao.demo.proxy.dynamic;

/**用户接口实现类
 * @Author liguohao
 * @Date 2020/12/9
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void login() {
        System.out.println("用户登录...QAQ...");
    }

    @Override
    public void regist() {
        System.out.println("用户注册...QAQ...");
    }
}
