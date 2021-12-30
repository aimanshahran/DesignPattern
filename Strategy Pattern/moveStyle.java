package aifanshahran.designpattern.lab1;

interface moveStyle {
    public void move();
}

class driving implements moveStyle{
    @Override
    public void move(){
        System.out.println("I am driving. Horray!");
    }
}

class flying implements moveStyle{
    @Override
    public void move(){
        System.out.println("I am flying. I believe I can fly.");
    }
}
