package cn.liguohao.demo.dp.combination;


/**
 * @Description
 * @Author liguohao
 * @Date 2020/10/2 3:06
 */
public class Client {
    public static void main(String[] args) {

        /** 原神结构图：
         * 提瓦特大陆
         *      未解封人物
         *      蒙德
         *          巴巴托斯
         *          西风骑士团
         *              安柏
         *              琴
         */
        Composlte 提瓦特大陆 = new Composlte("提瓦特大陆");
        提瓦特大陆.add(new Leaf("未解封人物"));

        Composlte 蒙德 = new Composlte("蒙德");
        蒙德.add(new Leaf("巴巴托斯..."));

        Composlte 西风骑士团 = new Composlte("西风骑士团");

        西风骑士团.add(new Leaf("安柏"));
        西风骑士团.add(new Leaf("琴"));

        蒙德.add(西风骑士团);

        提瓦特大陆.add(蒙德);

        print(提瓦特大陆);

    }


    /**
     * 递归打印，打印所有信息
     * @param component
     */
    private static void print(Component component) {
        if(component.getChild() != null){ // is Composlte
            Composlte composlte = (Composlte)component;
            System.out.println(composlte);
            Component[] child = composlte.getChild();
            for(int i=0;i< composlte.size;i++){
                print(child[i]);
            }
        }else { // is Leaf
            Leaf leaf = (Leaf) component;
            System.out.println(leaf);
        }
    }

}
