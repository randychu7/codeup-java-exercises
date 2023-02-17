package arrays;

import java.util.Arrays;

public class Person {

    private  String name;
    private  int age;

    public static void progressOneYear(Person[] people) {
        for (Person person : people) {
            person.setAge(person.getAge() + 1);
        }
    }

    public static void printOutAgesOfPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person.getAge());
        }
    }

    public static void printAll (Person[] person){
//        System.out.println(person[0].name);
        for(Person people : person){
            System.out.println(people.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person dude) {
        //Creating a copy of Array +1
        Person[] people1 = Arrays.copyOf(people, people.length + 1);

        //People.length is now 5 so assigning dude to the 4th slot
        people1[people.length] = dude;
        //The main array is now replaced by new Array
        people = people1;
        return people;

    }

//    public static Person[] addPersonInFront(Person[] people, Person dude) {
//        //Creating a copy of Array +1
//        Person[] people1 = Arrays.copyOf(people, people.length + 1);
//        //People.length is now 5 so assigning dude to the 4th slot
//        for (int i = 0; i<people1.length; i+=1){
//            Person currentPerson = people1[i];
//        }
//        people1[people.length] = dude;
//        //The main array is now replaced by new Array
//        people = people1;
//        return people;
//    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}