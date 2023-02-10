import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        int x = 0;
//
//        while ( i <= 15 ){
//            System.out.print(i++ + " ");
//        }
//
//        do {
//            System.out.println(x+=2);
//        } while ( x < 100);

//        do {
//            System.out.println(x-=5);
//        } while (x > 0);
//
//        long y = 2;
//        do {
////
//            System.out.println(y);
//            y *= y;
//        } while (y < 1000000);
////

//        for (int i = 2; i <= 100; i+=2){
//            System.out.println(i);
//        }
//        for (int i = 100; i > 0; i-=5){
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }
////
        //FizzBuzz
//        for (int i = 0; i <= 100; i++){
//            if(i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if(i % 3 == 0) {
//                System.out.println("fizz");
//                continue;
//            }else if(i % 5 == 0) {
//                System.out.println("buzz");
//                continue;
//            }
//                System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("Would you like to continue?");
//        System.out.println("[y/n]");
//        String continueInput = sc.next();
//
//        boolean willContinue = false;
//        do{
//        System.out.println("What is you Int?");
//        double userInput = sc.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------ | -----");
//        for (int i = 1; i <= userInput; i++){
//            System.out.println(i + "      |  " + i*i + "     | " + (int) Math.pow(i,3));
//        }
//            System.out.println("Do you want to Enter another Number? Y/N?");
//            String response = sc.next();
//            if (response.equalsIgnoreCase("y")) {
//                willContinue = true;
//            }else {
//                willContinue = false;
//            }
//        }while( willContinue);
//

//
//        System.out.println("Would you like to continue?");
//        System.out.println("[y/n]");
//
//        String userInput2 = sc.next();

        boolean gradeContinue = false;

        do {
            System.out.println("What Grade did you recieve?");
            int grade = sc.nextInt();

                    if (grade >= 88 && grade <= 100) {
                        System.out.println("You got an A");
                    } else if (grade >= 80 && grade <= 87) {
                        System.out.println("You got an B");
                    } else if (grade >= 67 && grade <= 79) {
                        System.out.println("You got an C");
                    } else if (grade >= 60 && grade <= 66) {
                        System.out.println("You got an D");
                    } else if (grade >= 0 && grade <= 59) {
                        System.out.println("You got an F");
                    }

                     System.out.println("Would you like to restart? y/n");
                    String restartResponse =  sc.next();

                    if (!restartResponse.equalsIgnoreCase( "y")){
                        gradeContinue = false;
                    }else {
                        gradeContinue = true;
                    }

            } while (gradeContinue) ;






//


////







    }
}
