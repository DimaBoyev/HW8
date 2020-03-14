package infrastructure.logger;

public final class StdLogger extends Logger {
    private static StdLogger instance = null;

    private StdLogger() {

    }

    public static StdLogger getInstance() {
        if (instance == null) {
            instance = new StdLogger();
        }
        return instance;
    }

    private static void toConsole(String msg) {
        log(msg);
    }

}
