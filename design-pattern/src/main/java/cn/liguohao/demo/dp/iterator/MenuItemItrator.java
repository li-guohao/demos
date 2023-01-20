package cn.liguohao.demo.dp.iterator;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/2 2:08
 */
public class MenuItemItrator implements MyIterator<MenuItem>{

    MenuItem[] items;
    int position = 0; //当前遍历的位置


    public MenuItemItrator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        return items[position++]; // 这里取出元素 后 +1
    }

    @Override
    public boolean hasNext() {
        if(position>items.length || items[position] == null) return false;
        return true;
    }
}
