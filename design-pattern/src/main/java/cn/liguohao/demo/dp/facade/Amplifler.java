package cn.liguohao.demo.dp.facade;

/**
 * @Description  播放程序
 * @Author liguohao
 * @Date 2020/9/30 13:58
 */
public abstract class Amplifler {

    public abstract void on();  //打开电源

    public abstract void off(); //关闭电源

    public abstract void eject(); //弹出，比如DVDPlayer就弹出DVD

    public abstract void pause(); //暂停

    public abstract void play(); //开始播放

    public abstract void stop(); //停止播放


}
