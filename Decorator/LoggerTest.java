package aifanshahran.lab2.decorator;

import java.sql.Timestamp;

public class LoggerTest {
    public static void main(String[] args){
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        EncryptLogger eLogger = new EncryptLogger(logger);
        //eLogger.log(timestamp + ": hello, how are you?");
        HTMLLogger hLogger = new HTMLLogger(logger);
        //hLogger.log(timestamp + ": hello, how are you?");
        hLogger.log(eLogger.encrypt("Good Bye"));
    }
}
