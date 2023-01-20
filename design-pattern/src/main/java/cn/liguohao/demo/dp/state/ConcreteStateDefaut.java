package cn.liguohao.demo.dp.state;

/**
 * @Description TODO 默认状态
 * @Author liguohao
 * @Date 2020/10/3 16:35
 */
public class ConcreteStateDefaut implements State {

    Context context;

    public ConcreteStateDefaut(Context context) {
        this.context = context;
    }

    /**
     * Default State To A State
     */
    @Override
    public void handle() {
        context.setCurrentState(context.getStates().get(ConcreteStateA.class.getName()));
    }
}
