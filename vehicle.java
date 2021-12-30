package pkg17207145.lab1;

abstract class vehicle {
   moveStyle moveBev;

    public final void setMoveBehaviour(moveStyle ma){
        moveBev = ma;
    }
    
    public void performMove(){
        moveBev.move();
    }
}

class StreetRacer extends vehicle{
    public StreetRacer(){
        setMoveBehaviour(new driving());
    }
}

class FormulaOne extends vehicle{
    public FormulaOne(){
        setMoveBehaviour(new driving());
    }
}

class AirCraft extends vehicle{
    public AirCraft(){
        setMoveBehaviour(new flying());
    }
}
    