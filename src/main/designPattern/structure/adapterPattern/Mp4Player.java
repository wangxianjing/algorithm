package main.designPattern.structure.adapterPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String name) {
        //nothing to do
    }

    @Override
    public void playMp4(String name) {
        System.out.println("play mp4:" + name);
    }
}
