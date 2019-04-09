package main.designPattern.structure.adapterPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String name) {
        System.out.println("play vlc:" + name);
    }

    @Override
    public void playMp4(String name) {
//nothing to do
    }
}
