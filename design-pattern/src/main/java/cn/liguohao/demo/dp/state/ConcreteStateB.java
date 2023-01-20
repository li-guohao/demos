package cn.liguohao.demo.dp.state;

/**
 * @Description  状态B
 * @Author liguohao
 * @Date 2020/10/3 16:35
 */
public class ConcreteStateB implements State {

    Context context;

    public ConcreteStateB(Context context) {
        this.context = context;
    }


    /**
     * B State To Default State
     */
    @Override
    public void handle() {
        context.setCurrentState(context.getStates().get(ConcreteStateDefaut.class.getName()));
    }
}
