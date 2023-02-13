import java.util.Scanner;

public class MethodsExercise {
//    public static int addition(int number1, int number2){
//        return number1 + number2;
//
//    }
//
//    public static int subtraction(int number1, int number2){
//        return number1 - number2;
//    }
//    public static int multiply(int number1, int number2){
//        int originalNum = 0;
//        for (int i = 0; i < number1; i++){
//            originalNum += number2;
//        }
//        return originalNum;
//    }

//    public static int multiply(int number1, int number2){
//
//        if (number1 == 0){
//            return 0;
//        } else if(number2 == 1) {
//            return number1;
//        }
//        return number1 * multiply(number1,number2)-1;
//    }
//    public static int division(int number1, int number2){
//        return number1 / number2;
//    }
//    public static int modulus(int number1, int number2){
//        return number1 % number2;
//    }
//
//    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
////  a greeting message to the user by either their first or first and last name.
//
//// example: sayName("Justin") - "Hi Justin"
//// example: sayName("Justin", "Reich") - "Hi Justin Reich"
//
//    public static void sayName(String name){
//        System.out.printf("Hello %s",name);
//    }
//
//    public static void sayName(String FirstName, String LastName){
//        System.out.printf("Hello %s, %s",FirstName,LastName);
//    }
//
//
//// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static double add(double num1, double num2) {
//        return num1 + num2;
//    }


//    public static int getInteger (int min, int max){
//        if (min )
//    }
//
//    public static int getInteger(int lower, int upper) {
//        Scanner scan = new Scanner(System.in);
//                String input = scan.nextInt();
//                if (input >= lower && input <= upper) {
//                    System.out.println("In Range");
//                } else {
//                    System.out.println("Invalid input, please try again.");
//                }

//  2.  Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//    The method signature should look like this:
//
//    public static int getInteger(int min, int max);

//    and is used like this:
//
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.



//        public static int getInteger(int min, int max) {
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                System.out.print("Enter a number between " + min + " and " + max + ": ");
//
//                if (scanner.hasNextInt()) {
//                    int input = scanner.nextInt();
//                    if (input >= min && input <= max) {
//                        return input;
//                    }
//                }
//
//                System.out.println("Invalid input. Try again.");
//                scanner.nextLine();
//            }
//
//        }

    public static int getFactorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number between " + min + " and " + max + ": ");

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                long factorial = input;
                for (int i = 0; i < input; i++){
                    factorial *= input;
                }
                System.out.println("Your number is: " + factorial);
            }

            System.out.println("Invalid input. Try again.");
            scanner.nextLine();
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int getFacto = getFactorial(1,10);
        System.out.println(getFacto);
//        int userInput = getInteger(1, 10);
//        System.out.println("You put in " + userInput + " that is in the scope");
//




        int UserInput = sc.nextInt();
//        long original= UserInput;
//             for (int i = 0; i < UserInput; i++){
//                original *= UserInput;
//             }
//
//        System.out.println(original);






//           sayName("Randy");
//             sayName("Randy","Chu");
//            System.out.println(add(5,5));

//        System.out.println(addition(5,5));
//        System.out.println(multiply(5,5));
//        System.out.println(subtraction(5,5));
//        System.out.println(division(5,5));
//        System.out.println(modulus(2,12));



        }
}
