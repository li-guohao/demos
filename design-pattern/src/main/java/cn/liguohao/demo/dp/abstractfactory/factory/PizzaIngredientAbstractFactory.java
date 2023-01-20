package cn.liguohao.demo.dp.abstractfactory.factory;

import cn.liguohao.demo.dp.abstractfactory.cheese.Cheese;
import cn.liguohao.demo.dp.abstractfactory.clams.Clams;
import cn.liguohao.demo.dp.abstractfactory.dough.Dough;
import cn.liguohao.demo.dp.abstractfactory.pepperoni.Pepperoni;
import cn.liguohao.demo.dp.abstractfactory.sauce.Sauce;
import cn.liguohao.demo.dp.abstractfactory.veggies.Veggies;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 15:20
 */
public interface PizzaIngredientAbstractFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
