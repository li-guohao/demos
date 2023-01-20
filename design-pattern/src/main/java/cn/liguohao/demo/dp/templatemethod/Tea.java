package cn.liguohao.demo.dp.templatemethod;

/**
 * @Description TODO 模板方法模式 - 茶
 * @Author liguohao
 * @Date 2020/10/2 0:05
 */
public class Tea extends CaffelneBeverage{

    @Override
    protected void brew() {
        System.out.println("准备茶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加柠檬...");
    }
}
