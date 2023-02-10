import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

       {
//            double pi = 3.14159;
////        System.out.format("The value of pi is %.2f",pi);
//            System.out.printf("The value of pi is approximately %.2f ",pi);
            Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a Number");
////
////        int newInt = sc.nextInt();
////
////        System.out.println(newInt);
//
//        System.out.println("Enter Three words");
//
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

            System.out.println("Enter a sentence!");

            String sentence = sc.nextLine();

            System.out.println(sentence);

           System.out.println("What is the length and the width of the room?");
           int length = sc.nextInt();
           int parseLength = Integer.parseInt(String.valueOf(length));
           System.out.println(length);
           int height = sc.nextInt();
           int parseHeight = Integer.parseInt(String.valueOf(height));
           int perimeter = parseLength * parseHeight;

           System.out.println("The perimeter of the classroom is: %f" + perimeter);
   }







    }





}
