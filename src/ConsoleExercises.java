import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

       {
           Scanner sc = new Scanner(System.in);
//             double pi = 3.14159;
//             String message = String.valueOf(System.out.format("The value of pi is approximately %.2f ",pi));
////        System.out.format("The value of pi is %.2f",pi);
//          System.out.printf("The value of pi is approximately %.2f ",pi);
//            System.out.printf(message);

//            System.out.println("Enter a Number");
//
//            int newInt = sc.nextInt();
//
//            System.out.println(newInt);
//
//        System.out.println("Enter Three words");
//
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
////
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
//
//
//            System.out.println("Enter a sentence!");
//
//            String sentence = sc.nextLine();
//
//            System.out.println(sentence);
//
           System.out.println("What is the length of the room?");
           double length = Double.parseDouble(sc.nextLine());
           System.out.printf("What is the width of the room?");
           double height = Double.parseDouble(sc.nextLine());
//
//
//           int height = sc.nextInt();
              double perimeter = length * height;
              double area = (length + height) * 2;

           System.out.printf("The perimeter of the classroom is: %d", perimeter);


   }







    }





}
