package Shapes;

public class Fish extends Animal{
    private boolean hasFin;
    public Fish(int legs, String climate, boolean fin) {
        super(legs, climate);
        this.hasFin = fin;
    }
}
