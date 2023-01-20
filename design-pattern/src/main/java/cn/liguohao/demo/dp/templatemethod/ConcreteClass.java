package cn.liguohao.demo.dp.templatemethod;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/10/2 0:59
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void abstractStepMethod() {
        System.out.println("这里是模板方法中 抽象步骤方法 的具体实现方法");
    }

    //如需要钩子，重载needHook方法，并返回true。重载hook方法实现业务逻辑。
    @Override
    protected boolean needHook() {
        return true;
    }

    @Override
    protected void hook() {
        super.hook();
        System.out.println("实现了钩子。");
    }
}
