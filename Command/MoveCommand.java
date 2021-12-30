package aifanshahran.lab6.command;

class MoveCommand implements CommandInterface{
    Item item;
    Category cat, ncat;
    
    public MoveCommand(Item i, Category c, Category nc) {
        item = i;
        cat = c;
        ncat = nc;
    }

    public void execute() {
        item.move(cat, ncat);
        cat.delete(item);
        ncat.add(item);
    }
}
