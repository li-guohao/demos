package cn.liguohao.demo.dp.iterator;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/2 2:25
 */
public class DriverTest {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.add(new MenuItem("爆炒火史莱姆","璃月大厨-香菱新菜式",false,232));
        dinerMenu.add(new MenuItem("红烧胡萝卜煎肉","蒙德特色菜",false,231));

        Waitress waitress = new Waitress(dinerMenu);
        waitress.printItems();

    }
}
