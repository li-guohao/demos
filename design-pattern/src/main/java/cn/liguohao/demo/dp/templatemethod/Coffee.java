package cn.liguohao.demo.dp.templatemethod;

/**
 * @Description  模板方法模式 -咖啡
 * @Author liguohao
 * @Date 2020/10/2 0:05
 */
public class Coffee extends CaffelneBeverage {


    @Override
    protected void brew() {
        System.out.println("磨咖啡...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加糖和牛奶 ...");
    }


}
