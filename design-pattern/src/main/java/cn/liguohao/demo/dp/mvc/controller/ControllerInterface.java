package cn.liguohao.demo.dp.mvc.controller;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/6 13:53
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
