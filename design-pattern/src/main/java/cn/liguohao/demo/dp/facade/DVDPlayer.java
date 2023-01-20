package cn.liguohao.demo.dp.facade;

/**
 * @Description  DVD播放程序
 * @Author liguohao
 * @Date 2020/9/30 13:56
 */
public class DVDPlayer extends Amplifler {

    /**
     * 音量
     */
    private boolean surroundAudio = false;

    /**
     * 双声道
     */
    private boolean twoChannelAudio = true;

    @Override
    public void on() {
        System.out.println("打开DVD电源...");
    }

    @Override
    public void off() {
        System.out.println("关闭DVD电源...");
    }

    @Override
    public void eject() {
        System.out.println("弹出DVD卡带...");
    }

    @Override
    public void pause() {
        System.out.println("暂停DVD播放...");
    }

    @Override
    public void play() {
        System.out.println("开始播放DVD...");
    }

    @Override
    public void stop() {
        System.out.println("停止播放DVD...");
    }

    public void setSurroundAudio(boolean surroundAudio) {
        System.out.println("设置DVD环绕音为："+surroundAudio);
        this.surroundAudio = surroundAudio;
    }

    public void setTwoChannelAudio(boolean twoChannelAudio) {
        System.out.println("设置DVD是否双声道: "+twoChannelAudio);
        this.twoChannelAudio = twoChannelAudio;
    }
}
