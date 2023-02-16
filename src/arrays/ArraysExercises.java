package arrays;

import java.util.Arrays;

public class ArraysExercises {


//    public static void addPerson(Person[] people, Person dude){
//        Person[] people1 = new Person[people.length + 1];
//        people1[people.length-1] = dude;
//        people = people1;
//        System.out.println(Arrays.toString(people));
//
//        }


public static Person[] addPerson(Person[] people, Person dude) {
    //Creating a copy of Array +1
    Person[] people1 = Arrays.copyOf(people, people.length + 1);
    //People.length is now 5 so assigning dude to the 4th slot
    people1[people.length] = dude;
    //The main array is now replaced by new Array
    people = people1;
    return people;
}


    public static void main(String[] args) {

         Person[] people = {
                 new Person("Randy",28),
                 new Person("Said",28),
                 new Person("Lonnie",19),
         };

         Person dude = new Person("oh",23);
         System.out.println(Arrays.toString(addPerson(people, dude)));









    }
}
