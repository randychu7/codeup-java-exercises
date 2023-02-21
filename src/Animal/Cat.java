package Animal;

import Animal.Animal;

public class Cat extends Animal {
    private int numberOfLives;

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public Cat(int legs, String climate, int lives) {
        super(legs, climate);
        this.numberOfLives = lives;
    }
}
