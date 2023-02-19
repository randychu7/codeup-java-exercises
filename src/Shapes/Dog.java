package Shapes;

public class Dog extends Animal{

    private boolean hasTail;


    public Dog(int legs, String climate, boolean tail) {
        super(legs, climate);
        this.hasTail = tail;
    }


}
