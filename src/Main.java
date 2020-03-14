import infrastructure.ConfigurationManager;
import infrastructure.OS;
import infrastructure.logger.Logger;
import infrastructure.logger.StdLogger;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.println(OS.current());
        Logger.log("Ty petuh livernyi");
        ConfigurationManager config = ConfigurationManager.getInstance();
        StdLogger record = StdLogger.getInstance();
        System.out.println(config.toString());
        System.out.println(record.toString());

    }
}
