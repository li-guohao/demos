package cn.liguohao.demo.dp.adaptor;

/**
 * @Description  适配器模式-适配器
 * @Author liguohao
 * @Date 2020/9/30 9:31
 */
public class Adaptor implements Target{
    private Adapters adapters;

    public Adaptor(Adapters adapters) {
        this.adapters = adapters;
    }

    @Override
    public void request() {
        before();
        adapters.specificRequest();
        after();
    }

    private void before() {
        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}
