package main.design.structure.responsibilityChain;

/**
 * Created by wong on 2019/4/9.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("file log:" + message);
    }
}
