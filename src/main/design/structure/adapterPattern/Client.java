package main.design.structure.adapterPattern;

/**
 * 要点：给音乐播放器添加播放视频和vlc格式文件功能。在音乐播放器里加入适配器类，适配器来决定使用哪种新的播放器播放。
 * Created by wong on 2019/4/8.
 */
public class Client {
    public static void main(String[] args) {
        AuditorPlay auditorPlay = new AuditorPlay();
        auditorPlay.play("mp3", "出山.mp3");
        auditorPlay.play("mp4", "喜剧之王.mp4");
        auditorPlay.play("vlc", "xxx.vlc");
        auditorPlay.play("avi", "yyy.avi");
    }
}
