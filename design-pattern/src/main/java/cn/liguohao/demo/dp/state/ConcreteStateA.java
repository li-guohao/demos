package cn.liguohao.demo.dp.state;

/**
 * @Description  状态A
 * @Author liguohao
 * @Date 2020/10/3 16:35
 */
public class ConcreteStateA implements State {

    Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    /**
     * A State To B State
     */
    @Override
    public void handle() {
        context.setCurrentState(context.getStates().get(ConcreteStateB.class.getName()));
    }
}
