package aifanshahran.lab3.abstractfactory;

import java.util.Scanner;

public class UIToolkitTest {
    public static void main(String[] args) {
        int option;
        Scanner choose = new Scanner (System.in);
        while(true){
            System.out.print("Type 1 for Motif, 2 for Presentation Manager, 3 to exit: ");
            if(choose.hasNextInt()){
                option = choose.nextInt();
                if(option>0 && option<3){
                    if(option==1){
                        AbstractWidgetFactory factory = new MotifWidgetFactory();
                        ScrollBar motifScrollBar=factory.createScrollBar();
                        Window motifWindow = factory.createWindow();
                        motifWindow.setTitle("New Window");
                        motifScrollBar.setDirection();
                    }else{
                        AbstractWidgetFactory factory = new PMWidgetFactory();
                        ScrollBar pmScrollBar = factory.createScrollBar();
                        Window pmWindow = factory.createWindow();
                        pmWindow.setTitle("New Window");
                        pmScrollBar.setDirection();
                    }
                }else if(option==3){
                    break;
                }else{
                    System.out.println("Invalid choice. Try again");
                }
            }else{
                System.out.println("Invalid choice. Try again");
            }
        }
    }
}
