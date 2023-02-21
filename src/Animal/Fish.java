package Animal;

import Animal.Animal;

public class Fish extends Animal {
    private boolean hasFin;

    public boolean isHasFin() {
        return hasFin;
    }

    public Fish(int legs, String climate, boolean fin) {
        super(legs, climate);
        this.hasFin = fin;
    }
}
