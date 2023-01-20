# 设计模式案例
这个是几年前学习设计模式时的demos,
虽然暂时无法编译运行，但是很久之前已经验证过了。

无法编译运行的问题后面有空再解决。

> 参考《Head First Java 设计模式》

- `cn.liguohao.demo.dp.duck`: 面向接口编程
- `cn.liguohao.demo.dp.observer`: 观察者模式 发布订阅
- `cn.liguohao.demo.dp.coffee`: 装饰者模式 包装原对象，拓展行为，解除耦合。
- `cn.liguohao.demo.dp.simplefactory`: 简单工厂 隐藏新生(隐藏对象的实例化过程。)
- `cn.liguohao.demo.dp.factorymethod`: 工厂方法 下放实现(方法级别的权力下放，让子类去实现方法)
- `cn.liguohao.demo.dp.abstractfactory`: 抽象工厂 下方新生(类级别的权力下放，让子类去实例化对象。)
- `cn.liguohao.demo.dp.singleton`: 单例模式 唯一对象
- `cn.liguohao.demo.dp.command`: 命令模式(策略模式) 封装请求(调用)、组合算法
- `cn.liguohao.demo.dp.adaptor`: 适配器模式 转化接口
- `cn.liguohao.demo.dp.facade`: 外观模式 简化接口(代码不全，懒QAQ)
- `cn.liguohao.demo.dp.templatemethod`: 模板方法模式 封装算法中变化的部分
- `cn.liguohao.demo.dp.iterator`: 迭代器模式 封装集合遍历
- `cn.liguohao.demo.dp.combination`: 组合模式  通过对象组合用一个类描述树形结构
- `cn.liguohao.demo.dp.state`: 状态模式 基于封装变化、开闭原则。通过对象组合管理事物的状态。

- `cn.liguohao.demo.dp.proxy`: 代理模式(代码有问题)  实现同一接口，包装原对象，控制访问，解除耦合。
- `cn.liguohao.demo.dp.recombination`:  复合模式
    - `first`:  面向接口    还是鸭子案例
    - `second`: 适配器模式  适配鹅
    - `third`:  装饰者模式  统计鸭子叫的次数
    - `fourth`: 抽象工厂模式 将创建和装饰部分包装起来
    - `fiveth`: 组合模式和迭代器模式    管理一群鸭子
    - `sixth`: 观察者模式 观察个别鸭子的行为
- `cn.liguohao.demo.dp.mvc`:  MVC模式
    - `Model`:      模型 观察者模式
    - `View`:       视图 组合模式
    - `Controler`:  控制 解耦合，提复用