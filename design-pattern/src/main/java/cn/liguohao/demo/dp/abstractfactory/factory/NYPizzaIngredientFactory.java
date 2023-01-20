package cn.liguohao.demo.dp.abstractfactory.factory;

import cn.liguohao.demo.dp.abstractfactory.cheese.Cheese;
import cn.liguohao.demo.dp.abstractfactory.cheese.ReggianoCheese;
import cn.liguohao.demo.dp.abstractfactory.clams.Clams;
import cn.liguohao.demo.dp.abstractfactory.clams.FreshClams;
import cn.liguohao.demo.dp.abstractfactory.dough.Dough;
import cn.liguohao.demo.dp.abstractfactory.dough.ThinCrustDough;
import cn.liguohao.demo.dp.abstractfactory.pepperoni.Pepperoni;
import cn.liguohao.demo.dp.abstractfactory.pepperoni.SlicedPepperoni;
import cn.liguohao.demo.dp.abstractfactory.sauce.MarinaraSauce;
import cn.liguohao.demo.dp.abstractfactory.sauce.Sauce;
import cn.liguohao.demo.dp.abstractfactory.veggies.*;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/9/21 15:27
 */
public class NYPizzaIngredientFactory implements PizzaIngredientAbstractFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
                new Garlic(),
                new Onion(),
                new RedPepper(),
                new Mushroom()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
