package infrastructure.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {
    private static int counter = 1;

    public static void log(String message) {
        final String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        DateFormat dateFormat = new SimpleDateFormat("HH:MM:ss:SSS");
        Date date = new Date();
        String dateNow = dateFormat.format(date);
        System.out.printf("%d) %s [%s]: %s", counter++, dateNow, methodName, message);
    }
}
