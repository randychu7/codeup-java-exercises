package Shapes;

public class Cat extends Animal{
    private int numberOfLives;
    public Cat(int legs, String climate, int lives) {
        super(legs, climate);
        this.numberOfLives = lives;
    }
}
