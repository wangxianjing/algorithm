package main.designPattern.structure.adapterPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class AuditorPlay implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String auditorType, String name) {
        if ("mp3".equals(auditorType)) {
            System.out.println("play mp3:" + name);
        } else if ("mp4".equals(auditorType) || "vlc".equals(auditorType)) {
            mediaAdapter = new MediaAdapter(auditorType);
            mediaAdapter.play(auditorType, name);
        } else {
            System.out.println("不支持的文件格式！");
        }
    }
}
