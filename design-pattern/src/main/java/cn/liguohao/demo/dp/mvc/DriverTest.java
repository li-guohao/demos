package cn.liguohao.demo.dp.mvc;

import cn.liguohao.demo.dp.mvc.controller.BeatController;
import cn.liguohao.demo.dp.mvc.model.BeatModel;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/5 15:47
 */
public class DriverTest {
    public static void main(String[] args) {
        BeatModel beatModel = new BeatModel();
        BeatController beatController = new BeatController(beatModel);
    }
}
