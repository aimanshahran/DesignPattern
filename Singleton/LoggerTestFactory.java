package aifanshahran.lab2.singleton;

import java.sql.Timestamp;

public class LoggerTestFactory {
    public static void main(String[] args){
        //FileLogger logger = new FileLogger();
        LoggerFactory f = new LoggerFactory();
        Logger msgLog = f.getLogger();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        msgLog.log(timestamp + ": hello, how are you?");
    }
}
