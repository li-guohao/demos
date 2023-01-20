package cn.liguohao.demo.dp.command.entity;

/**
 * @Description TODO 灯
 * @Author liguohao
 * @Date 2020/9/24 23:00
 */
public class Light {
    private boolean on;

    public Light() {
        this.on = false;
    }

    public void turnOn(){
        on = true;
        System.out.println("灯已经打开！！！");
    }

    public void trunOff(){
        on = false;
        System.out.println("灯已经关闭！！！");
    }

}
