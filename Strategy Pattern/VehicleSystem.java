package aifanshahran.designpattern.lab1;

import java.util.Scanner;

public class VehicleSystem {

    public static void main(String[] args) {
        vehicle vArray[] = new vehicle[3];
        vArray[0] = new StreetRacer();
        vArray[1] = new FormulaOne();
        vArray[2] = new AirCraft();
        
        Scanner choose = new Scanner (System.in);
        int option, optionDriveOrFly;
        
        while(true){
            System.out.println("Please choose your vehicle");
            System.out.println("1. StreetRacer \n2. FormulaOne \n3. AirCraft \n4. Exit");
            if (choose.hasNextInt()){
                option = choose.nextInt(); 
                    if(option > 0 && option < 4){
                        display(vArray[option-1]);
                        
                        while(true){
                            System.out.println("Choose my moving behaviour");
                            System.out.println("1. Drive \n2. Fly \n3. Exit from choosing");
                                if (choose.hasNextInt()){
                                    optionDriveOrFly = choose.nextInt();
                                        if (optionDriveOrFly==1){
                                            vArray[option-1].setMoveBehaviour(new driving());
                                            display(vArray[option-1]);
                                        }else if(optionDriveOrFly==2){
                                            vArray[option-1].setMoveBehaviour(new flying());
                                            display(vArray[option-1]);
                                        }else if(optionDriveOrFly==3){
                                            break;
                                        }else{
                                            System.out.println("Invalid choice. Please try again. Ensure you enter an integer");
                                        }
                                }
                        }
                    }else if(option==4){
                        break;
                    }else{
                        System.out.println("Invalid choice. Please try again. Ensure you enter an integer");
                    }
            }
        }
        
    }
    
    static void display (vehicle v){
        System.out.print("I am a " + v.getClass().getSimpleName() + ". ");
        v.performMove();
    }
    
}


