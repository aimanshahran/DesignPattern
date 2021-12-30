package aifanshahran.lab3.abstractfactory;

public class PMScrollBar implements ScrollBar{
    @Override
    public void setDirection(){
        System.out.println("Presentation Manager ScrollBar direction is horizontal");
    }
}
