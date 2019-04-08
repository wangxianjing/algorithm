package main.design.structure.adapterPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String auditorType) {
        if ("vlc".equals(auditorType)) {
            advanceMediaPlayer = new VlcPlayer();
        } else if ("mp4".equals(auditorType)) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String auditorType, String name) {
        if ("vlc".equals(auditorType)) {
            advanceMediaPlayer = new VlcPlayer();
            advanceMediaPlayer.playVlc(name);
        } else {
            advanceMediaPlayer = new Mp4Player();
            advanceMediaPlayer.playMp4(name);
        }
    }
}
