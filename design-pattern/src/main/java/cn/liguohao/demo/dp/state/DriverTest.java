package cn.liguohao.demo.dp.state;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/10/3 17:03
 */
public class DriverTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.getStates().put(ConcreteStateA.class.getName(),new ConcreteStateA(context));
        context.getStates().put(ConcreteStateB.class.getName(),new ConcreteStateB(context));

        System.out.println(context); // ConcreteStateDefault
        context.request();
        System.out.println(context); // ConcreteStateA
        context.request();
        System.out.println(context); // ConcreteStateB
        context.request();
        System.out.println(context); // ConcreteStateDefault
    }
}
