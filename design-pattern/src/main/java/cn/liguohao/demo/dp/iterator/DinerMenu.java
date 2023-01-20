package cn.liguohao.demo.dp.iterator;

import java.util.Arrays;

/**
 * @Description  迭代器模式 - 餐厅菜单
 * @Author liguohao
 * @Date 2020/10/2 2:16
 */
public class DinerMenu {

    private static final int DEFAUL_ITEMS = 6;

    int capacity;
    int size = 0;
    MenuItem [] items;

    public DinerMenu() {
        items = new MenuItem[DEFAUL_ITEMS];
    }

    public DinerMenu(int capacity) {
        items = new MenuItem[capacity];
    }

    public MenuItemItrator createIterator(){
        return  new MenuItemItrator(items);
    }

    public void add(MenuItem menuItem){
        if(null == menuItem) throw new NullPointerException("不支持空对象的添加。");
        ensureCapacityEnough(size+1);
        items[size++] = menuItem;
    }

    /**
     * 确保容量足够, 不够则两倍扩容
     */
    private void ensureCapacityEnough(int index) {
           if(index > items.length){ // 扩容
               capacity = items.length * 2;
               items = Arrays.copyOf(items, capacity);
           }
    }

}
