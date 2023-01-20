package cn.liguohao.demo.dp.state;

/**
 * @Description  定义状态
 * @Author liguohao
 * @Date 2020/10/3 16:34
 */
public interface State {
    /**
     * State A to State B
     */
    void handle();
}
