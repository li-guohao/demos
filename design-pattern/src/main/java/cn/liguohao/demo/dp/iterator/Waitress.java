package cn.liguohao.demo.dp.iterator;

/**
 * @Description  迭代器模式 - 女招待
 * @Author liguohao
 * @Date 2020/10/2 2:19
 */
public class Waitress {

    DinerMenu dinerItem;

    public Waitress(DinerMenu dinerItem) {
        this.dinerItem = dinerItem;
    }

    void printItems(){
        MenuItemItrator iterator = dinerItem.createIterator();
        while (iterator.hasNext()){
            MenuItem next = iterator.next();
            System.out.println(next.getName() +"\t"+ next.getPrice() +"\t"+ next.getDescription());
        }
    }
}
