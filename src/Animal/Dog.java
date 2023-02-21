package Animal;

import Animal.Animal;

public class Dog extends Animal {

    private String breed;

    public String isHasTail() {
        return breed;
    }

    public String getAnimalInfo(){
        return String.format("This dogs breed is: %s",breed);
    }

    public Dog(int legs, String climate, String breeds) {
        super(legs, climate);
        this.breed = breeds;
    }


}
