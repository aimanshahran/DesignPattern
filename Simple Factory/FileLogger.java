package aifanshahran.lab2.simplefactory;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileLogger implements Logger
{
  @Override
  public void log(String message)
  {
    try
    {
      File file =new File("log.txt");
 
      //create file if doesn't exist 
      if(!file.exists())
      {
        file.createNewFile();
      }
 
      //true = append file
      FileWriter fileWritter = new FileWriter(file.getName(),true);
      BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
      bufferWritter.write(message + "\n");
      bufferWritter.close();
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    System.out.println("Message logged in file");
  }
}
