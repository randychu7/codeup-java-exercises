package Animal;
//# Inheritance and Polymorphism Bonus
//
//        Create a class of Animal
//
//- add the following fields:
//        - ```private int numberOfLegs```
//        - ```private String preferredClimate```
//        - ```public String getAnimalInfo()```: a method that returns a message with number of legs and preferred climate info
//        - add getters and setters
//        - add a constructor that sets all properties
//
//        Create a class of Dog, Fish, Cat that extends Animal
//
//- add additional private properties that are unique to each specific animal type and getters and setters for these properties
//        - overload the getAnimalInfo() to invoke the parent getAnimalInfo() method and return extra info on all the additional properties for the specific animal type
//        - add a constructor that invokes the parent constructor and sets new properties
//
//        Create a class AnimalTester with a method ```public static void displayAnimalDetails(Animal a)``` that prints what is returned from calling the getAnimalInfo() method for a given animal object
//
//        - this method should take in any Animal object but test it in the main method
//        with instantiated Dog, Fish, Cat objects of type Animal.

public class Animal {

    private int numberOfLegs;
    private String preferredClimate;


    //Getter
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    //Setters
    public void setNumberOfLegs(int legs){
        this.numberOfLegs = legs;
    }

    public void setPreferredClimate(String climate){
        this.preferredClimate = climate;
    }


    public String getAnimalInfo(){
        return String.format("This animal has %d legs and its preferred climate is %s" ,numberOfLegs, preferredClimate);
    }


    // Constructer
    public Animal(int legs, String climate){
        this.numberOfLegs = legs;
        this.preferredClimate = climate;

    }

}



