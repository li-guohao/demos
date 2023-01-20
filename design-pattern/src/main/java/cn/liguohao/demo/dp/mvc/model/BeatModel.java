package cn.liguohao.demo.dp.mvc.model;

import cn.liguohao.demo.dp.mvc.observer.Observer;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/10/6 12:48
 */
public class BeatModel implements BeatModelInterface, MetaEventListener{
    Sequencer sequencer;
    int bpm = 90;

    ArrayList beatObservers  = new ArrayList();
    ArrayList bpmObersvers = new ArrayList();

    Sequence sequence;
    Track track;


    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(40);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyObserverList(bpmObersvers);
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerBeatObserver(Observer observer) {
        beatObservers.add(observer);
    }

    @Override
    public void registerBPMObserver(Observer observer){
        bpmObersvers.add(observer);
    }

    @Override
    public void removeBeatObserver(Observer observer) {
        int index = beatObservers.indexOf(observer);
        if(index > 0) beatObservers.remove(index);
    }

    @Override
    public  void removeBPMObserver(Observer observer){
        int index = bpmObersvers.indexOf(observer);
        if(index > 0) bpmObersvers.remove(index);
    }


    @Override
    public void meta(MetaMessage meta) {
        if(meta.getType() == 47){
            notifyObserverList(beatObservers);
            sequencer.start();
            setBPM(getBPM());
        }
    }


    private void notifyObserverList(ArrayList list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update();
        }
    }


    public void setUpMidi(){
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart(){
        int[] trackArray = {35, 0, 46, 0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();


    }

    public void makeTracks(int[] array){
        for(int i=0; i<array.length;i++){
            int key = array[i];

            if(key !=0){
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(128,9,key,100,i+1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  event;
    }

}
