package cn.liguohao.demo.dp.mvc.controller;

import cn.liguohao.demo.dp.mvc.model.BeatModelInterface;
import cn.liguohao.demo.dp.mvc.view.DJView;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/6 14:05
 */
public class BeatController implements ControllerInterface{
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this,model);
        view.createView();
        view.createControls ();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.on();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(++bpm);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(--bpm);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);

    }
}
