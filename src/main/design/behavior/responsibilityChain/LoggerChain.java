package main.design.behavior.responsibilityChain;

/**
 * Created by wong on 2019/4/9.
 */
public class LoggerChain {
    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger infoLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);
        return errorLogger;
    }
}
