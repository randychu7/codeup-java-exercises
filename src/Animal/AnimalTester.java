package Animal;

public class AnimalTester {

    public static void displayAnimalDetails(Animal a){
        System.out.println(a.getAnimalInfo());
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal(4, "sunny");
        Animal animal2 = new Dog(4, "sunny", "Golden Retriever");
        Animal animal3 = new Fish(0, "water", true);
        Animal animal4 = new Cat(4, "water", 9);

        System.out.println(animal1.getAnimalInfo());
        displayAnimalDetails(animal2);
        System.out.println(animal3.getAnimalInfo());
        System.out.println(animal4.getAnimalInfo());



    }
}
