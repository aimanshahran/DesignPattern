package aifanshahran.lab2.decorator;

public class LoggerDecorator implements Logger { 
    Logger logger;
    public LoggerDecorator(Logger inp_logger) {
        logger = inp_logger; 
    }
    public void log(String DataLine) { 
        logger.log(DataLine); 
    }
}

