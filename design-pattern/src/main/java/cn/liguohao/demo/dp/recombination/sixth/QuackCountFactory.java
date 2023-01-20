package cn.liguohao.demo.dp.recombination.sixth;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/10/5 13:00
 */
public class QuackCountFactory extends QuackableAbstractFactory {
    @Override
    Quackable createQuackable(Class clazz) {
        if(clazz.equals(DuckCall.class)){
            return  new QuackCount(new DuckCall());
        } else if(clazz.equals(MallardDuck.class)){
            return new QuackCount(new MallardDuck());
        }else if(clazz.equals(RedheadDuck.class)){
            return new QuackCount(new RedheadDuck());
        }else if(clazz.equals(RubberDuck.class)){
            return new QuackCount(new RubberDuck());
        }else {
            throw new UnsupportedOperationException("工厂不支持此Class创建对象："+clazz.getName());
        }
    }

    @Override
    Quackable createQuackableAdapter(Class clazz, Object o) {
        if(clazz.equals(GooseAdapter.class)){
            if(o instanceof Goose){
                Goose goose = (Goose) o;
                return new QuackCount(new GooseAdapter(goose));
            }else {
                throw new UnsupportedOperationException("无法适配对象："+o.getClass().getName());
            }
        }else {
            throw new UnsupportedOperationException("工厂不支持此Class创建对象："+clazz.getName());
        }
    }

    @Override
    Quackable createQuackableCollection(Class clazz) {
        if(clazz.equals(Flock.class)){
            return new QuackCount(new Flock());
        }else {
            throw new UnsupportedOperationException("工厂不支持此集合类型Class创建对象："+clazz.getName());
        }
    }
}
