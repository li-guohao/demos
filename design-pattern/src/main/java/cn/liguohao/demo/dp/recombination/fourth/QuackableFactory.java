package cn.liguohao.demo.dp.recombination.fourth;

/**
 * @Description TODO 普通的可叫的(鸭子)工厂
 * @Author liguohao
 * @Date 2020/10/5 13:03
 */
public class QuackableFactory extends QuackableAbstractFactory {
    @Override
    Quackable  createQuackable(Class clazz) {
        if(clazz.equals(DuckCall.class)){
            return  new DuckCall();
        } else if(clazz.equals(MallardDuck.class)){
            return new MallardDuck();
        }else if(clazz.equals(RedheadDuck.class)){
            return new RedheadDuck();
        }else if(clazz.equals(RubberDuck.class)){
            return new RubberDuck();
        }else {
            throw new UnsupportedOperationException("工厂不支持此Class创建对象："+clazz.getName());
        }
    }

    @Override
    Quackable createQuackableAdapter(Class clazz, Object o) {
        if(clazz.equals(GooseAdapter.class)){
            if(o instanceof Goose){
                Goose goose = (Goose) o;
                return new GooseAdapter(goose);
            }else {
                throw new UnsupportedOperationException("无法适配对象："+o.getClass().getName());
            }
        }else {
            throw new UnsupportedOperationException("工厂不支持此Class创建对象："+clazz.getName());
        }
    }
}
