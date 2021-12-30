package aifanshahran.lab2.decorator;

public class EncryptLogger extends LoggerDecorator { 
    public EncryptLogger(Logger inp_logger) {
        super(inp_logger);
    }
    
    public void log(String DataLine) { 
    DataLine = encrypt(DataLine); 
    logger.log(DataLine); 
    }
    
    public String encrypt(String DataLine) { 
    DataLine = DataLine.substring(DataLine.length() - 1) + DataLine.substring(0, DataLine.length() - 1);
    return DataLine; 
    }
    
}

