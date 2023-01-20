package cn.liguohao.demo.dp.singleton;

/**原始巧克力锅炉
 * @Author liguohao
 * @Date 2020/9/24 19:32
 */
public class ChocolateBoilerOriginal {
    private boolean empty; // 是否为空
    private boolean boiled;// 是否沸腾

    // 默认构造，锅炉为空，不沸腾
    public ChocolateBoilerOriginal() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty(){return empty;}

    public boolean isBoiled(){return boiled;}

    //在锅炉内填满巧克力和牛奶的混合物
    public void fill(){
        if(isEmpty()){ // 锅炉为空
            empty = false;
            boiled = false;
            System.out.println("在锅炉内填满巧克力和牛奶的混合物");
        }
    }

    // 排出煮沸的巧克力和牛奶
    public void drain(){
        if(!isEmpty() && isBoiled()) { //锅炉不为空，并且沸腾了
            empty = true;
        }
    }

    // 将炉内物煮沸
    public void boil(){
        if(!isEmpty() && !isBoiled()){ //锅炉不为空，没有沸腾
            boiled = true;
        }
    }


}
