package cn.liguohao.demo.dp.factorymethod;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 13:55
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("START ..........................................");
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(Object topping: toppings){
            System.out.println("    "+topping);
        }
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350 ... ");
    }
    void cut(){
        System.out.println("Cutting ... ");
    }
    void box(){
        System.out.println("Boxxing ... ");
    }

    public String getName() {
        return name;
    }
}
