package cn.liguohao.demo.dp.abstractfactory.factory;

import cn.liguohao.demo.dp.abstractfactory.cheese.Cheese;
import cn.liguohao.demo.dp.abstractfactory.cheese.Mozzarella;
import cn.liguohao.demo.dp.abstractfactory.clams.Clams;
import cn.liguohao.demo.dp.abstractfactory.clams.FrozenClams;
import cn.liguohao.demo.dp.abstractfactory.dough.Dough;
import cn.liguohao.demo.dp.abstractfactory.dough.ThickCrustDough;
import cn.liguohao.demo.dp.abstractfactory.pepperoni.Pepperoni;
import cn.liguohao.demo.dp.abstractfactory.pepperoni.SlicedPepperoni;
import cn.liguohao.demo.dp.abstractfactory.sauce.PlumTomatoSauce;
import cn.liguohao.demo.dp.abstractfactory.sauce.Sauce;
import cn.liguohao.demo.dp.abstractfactory.veggies.BlackOlives;
import cn.liguohao.demo.dp.abstractfactory.veggies.EggPlant;
import cn.liguohao.demo.dp.abstractfactory.veggies.Spinach;
import cn.liguohao.demo.dp.abstractfactory.veggies.Veggies;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/21 15:38
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientAbstractFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies ={
                new BlackOlives(),
                new EggPlant(),
                new Spinach()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
