package cn.liguohao.demo.dp.combination;



import java.util.Arrays;

/**
 * @Description  组合模式 - 非叶子节点
 * @Author liguohao
 * @Date 2020/10/2 2:58
 */
public class Composlte implements Component{

    Component[] leafs;
    private String name;


    private static final int DEFAUL_LEAFS = 2;

    int capacity;
    int size = 0;

    public Composlte(String name) {
        this.name = name;
        capacity = DEFAUL_LEAFS;
        leafs = new Component[capacity];
    }

    @Override
    public String toString() {
        return "Composlte{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void operetion() {
        System.out.println("operetion method of Composlte Component is executing ...");
    }



    @Override
    public void remove(Component component) {
    }

    @Override
    public Component[] getChild() {
        return leafs;
    }
    @Override
    public void add(Component Component){
        if(null == Component) throw new NullPointerException("unsupported add null object ...");
        ensureCapacityEnough(size+1);
        leafs[size++] = Component;
    }

    /**
     * 确保容量足够, 不够则两倍扩容
     */
    private void ensureCapacityEnough(int index) {
        if(index > leafs.length){ // 扩容
            capacity = leafs.length * 2;
            leafs = Arrays.copyOf(leafs, capacity);
        }
    }
}
