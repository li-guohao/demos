package cn.liguohao.demo.dp.facade;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/30 14:11
 */
public class CDPlayer extends Amplifler {
    @Override
    public void on() {
        System.out.println("打开CD电源...");
    }

    @Override
    public void off() {
        System.out.println("关闭CD电源...");
    }

    @Override
    public void eject() {
        System.out.println("弹出CD光盘...");
    }

    @Override
    public void pause() {
        System.out.println("暂停CD播放...");
    }

    @Override
    public void play() {
        System.out.println("开始CD播放...");
    }

    @Override
    public void stop() {
        System.out.println("停止CD播放...");
    }


}
