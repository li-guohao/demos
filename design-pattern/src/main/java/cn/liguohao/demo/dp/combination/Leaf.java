package cn.liguohao.demo.dp.combination;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/2 2:52
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void operetion() {
        System.out.println("operetion method of leaf component  is executing ...");
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("leaf component unsupported this method");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("leaf component unsupported this method");
    }

    @Override
    public Component[] getChild() {
        return null;
    }
}
