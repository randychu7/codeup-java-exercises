package arrays;

import java.util.Arrays;



public class ArraysExercises {


    public static void main(String[] args) {

         Person[] people = {
                 new Person("Randy",28),
                 new Person("Said",28),
                 new Person("Lonnie",19),
         };

//         Person dude = new Person("oh",23);

        // Can work with any array of people
        people = Person.addPerson(people, new Person("oh", 25));

         Person.printAll(people);

//         System.out.println(Arrays.toString(addPerson(people, dude)));












    }
}
