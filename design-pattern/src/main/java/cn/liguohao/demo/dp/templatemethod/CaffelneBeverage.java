package cn.liguohao.demo.dp.templatemethod;

/**
 * @Description TODO 模板方法模式 - 饮料
 * @Author liguohao
 * @Date 2020/10/2 0:16
 */
public abstract class CaffelneBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater(){
        System.out.println("烧水中 ...");
    };
    void pourInCup(){
        System.out.println("放进杯子 ...");
    };


}
