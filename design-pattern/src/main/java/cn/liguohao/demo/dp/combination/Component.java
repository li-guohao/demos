package cn.liguohao.demo.dp.combination;

/**
 * @Description  组合模式 - 组件
 * @Author liguohao
 * @Date 2020/10/2 2:50
 */
public interface Component {

    void operetion();

    void add(Component component);

    void remove(Component component);

    Component[] getChild();


}
