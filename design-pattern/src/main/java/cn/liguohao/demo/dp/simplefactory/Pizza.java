package cn.liguohao.demo.dp.simplefactory;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 13:55
 */
public abstract class Pizza {
   String description = "Defaule Pizza";

    void prepare(){
        System.out.println("prepare ... ");
    }
    void bake(){
        System.out.println("bake ... ");
    }
    void cut(){
        System.out.println("cut ... ");
    }
    void box(){
        System.out.println("box ... ");
    }

    public String getDescription() {
        return description;
    }
}
