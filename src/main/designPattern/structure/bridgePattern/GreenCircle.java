package main.designPattern.structure.bridgePattern;

/**
 * Created by wong on 2019/4/8.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void draw(int x, int y, int r) {
        System.out.println("draw green circle x:" + x + ",y:" + y  + ",r:" + r);
    }
}
