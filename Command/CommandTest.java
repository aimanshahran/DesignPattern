package aifanshahran.lab6.command;

public class CommandTest {

    public static void main(String[] args) {
        
        Item Duet = new Item("Duet");
        Category cat = new Category("CD");
        CommandInterface command = new AddCommand(Duet, cat);   //create the command object
        ItemManager manager = new ItemManager();                //create the invoker
        manager.setCommand(command);                            //configure the invoker
        manager.process();                                      //with the command object
        Duet.printDetails();


        //Delete an item from the New Releases category
        command = new DeleteCommand(Duet, cat);
        manager.setCommand(command);
        manager.process();
        Duet.printDetails();

        //Move Items
        System.out.println("Move the item from the CD category to Book category");
        Category ncatCD = new Category("Book");
        command = new MoveCommand(Duet, cat, ncatCD);
        manager.setCommand(command);
        manager.process();  
        Duet.printDetails();
    }
}
