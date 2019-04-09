package main.designPattern.behavior.responsibilityChain;

/**
 * 要点：每个有权责的都要经过他的手处理一遍，这里例子不合适，层层审批的例子更合适
 * Created by wong on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = LoggerChain.getChainOfLoggers();
        chainOfLoggers.logMessage(AbstractLogger.ERROR, "error log.....");
        chainOfLoggers.logMessage(AbstractLogger.INFO, "info log.....");
        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "debug log.....");
    }
}
