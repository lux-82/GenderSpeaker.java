import java.util.logging.*;

public class LoggingApp {

    private static Logger logger = Logger.getLogger(LoggingApp.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        try {
            logger.info("try");
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            logger.severe("catch");
        } finally {
            logger.finest("finally");
        }
    }
}