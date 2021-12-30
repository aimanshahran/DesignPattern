package aifanshahran.lab2.simplefactory;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    public Logger getLogger() {
    Logger logger = null;
    
    Properties p = new Properties();
    try {
          p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
          String fileLoggingValue = p.getProperty("FileLogging");
          if (fileLoggingValue.equalsIgnoreCase("ON") == true)
            logger = new FileLogger();
          else
            logger = new ConsoleLogger();
         } 
        catch (IOException e) 
        {
          logger = new ConsoleLogger();
        }
        return logger;
    }
}
