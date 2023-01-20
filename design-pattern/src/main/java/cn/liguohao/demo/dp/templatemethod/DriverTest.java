package cn.liguohao.demo.dp.templatemethod;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/2 0:50
 */
public class DriverTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }
}
