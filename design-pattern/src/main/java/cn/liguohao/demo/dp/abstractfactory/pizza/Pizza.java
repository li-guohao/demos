package cn.liguohao.demo.dp.abstractfactory.pizza;

import cn.liguohao.demo.dp.abstractfactory.cheese.Cheese;
import cn.liguohao.demo.dp.abstractfactory.clams.Clams;
import cn.liguohao.demo.dp.abstractfactory.dough.Dough;
import cn.liguohao.demo.dp.abstractfactory.pepperoni.Pepperoni;
import cn.liguohao.demo.dp.abstractfactory.sauce.Sauce;
import cn.liguohao.demo.dp.abstractfactory.veggies.Veggies;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 13:55
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in officaial PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
