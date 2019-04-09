package main.designPattern.behavior.responsibilityChain;

/**
 * Created by wong on 2019/4/9.
 */
public abstract class AbstractLogger {
    protected static int DEBUG = 1;
    protected static int INFO = 2;
    protected static int ERROR = 3;

    protected int level;

    private AbstractLogger nextLogger;

    protected void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
