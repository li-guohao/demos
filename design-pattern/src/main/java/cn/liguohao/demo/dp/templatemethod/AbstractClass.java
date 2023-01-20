package cn.liguohao.demo.dp.templatemethod;

/**
 * @Description  模板方法-抽象类
 * @Author liguohao
 * @Date 2020/10/2 0:53
 */
public abstract class AbstractClass {


    void templateMethod() {
        first();
        abstractStepMethod();
        if(needHook()){
            hook();
        }
        end();
     }

    protected boolean needHook(){
        return false;
    };

    protected  void hook(){
        System.out.println("这是模板方法中的钩子，如果具体类需要钩子，重载needHook方法，并返回true。重载hook方法实现业务逻辑。");
    };


    protected abstract void abstractStepMethod();

    protected void first(){
        System.out.println("这里是模板方法中的第一步。");
    }

    protected void end(){
        System.out.println("这里是模板方法中的最后一步。");
    }

}
