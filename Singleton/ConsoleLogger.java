package aifanshahran.lab2.singleton;

class ConsoleLogger implements Logger
{
  //ConsoleLogger() {}
  @Override
  public void log(String message)
  {
    System.out.println(message);
  }
}
