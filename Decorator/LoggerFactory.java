package aifanshahran.lab2.decorator;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    
    public boolean isFileLoggingEnabled(){
        Properties p = new Properties();
        try {
          p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
          String fileLoggingValue = p.getProperty("FileLogging");
          return fileLoggingValue.equalsIgnoreCase("ON") == true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public Logger getLogger() {
    Logger logger = null;
    
        if (isFileLoggingEnabled()){
          logger = FileLoggerSingleton.getInstance();
        } else {
          logger = new ConsoleLogger();
        }
        return logger;
}
}
