package aifanshahran.lab2.decorator;

public class HTMLLogger extends LoggerDecorator { 
    public HTMLLogger(Logger inp_logger) {
        super(inp_logger);
      }
    public void log(String DataLine) { 
        DataLine = makeHTML(DataLine); // Added functionality
        logger.log(DataLine); // Forward the encrypted text to the FileLogger for storage
    }
    public String makeHTML(String DataLine) { 
        DataLine = "<HTML><BODY>" + "<b>" + DataLine + "</b>" + "</BODY></HTML>";
        return DataLine; 
    }
}
