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

    public static int getFacto() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number between 1-10: ");

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= 1 && input <= 10) {
                    long factorial = 1;
                    for (int i = 1; i <= input; i++){
                        factorial *= i;
                    }
                    return (int) factorial;
                }
            }
            System.out.println("Invalid input. Try again.");
            scanner.nextLine();
        }
    }
//

    public static void rollDice () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides are on first Dice");
        int diceRoll1 = scanner.nextInt();
        System.out.println("How many sides are on the second Dice?");
        int diceRoll2 = scanner.nextInt();
        System.out.println("Would you like to roll? y/n");
        scanner.next();

        boolean willContinue = true;
        do {
            int rolledDice1 = (int) (Math.random() * diceRoll1 + 1);
            int rolledDice2 = (int) (Math.random() * diceRoll2 + 1);
            System.out.println("The first dice is: "+ rolledDice1);
            System.out.println("The second dice is:" + rolledDice2);

            System.out.println("Do you want to roll again?? Y/N?");
            String response = scanner.next();
            if (response.equalsIgnoreCase("n")) {
                willContinue = false;
            }

        } while (willContinue);
        scanner.close();
    }





        public static void main(String[] args){
//        rollDice();
        Scanner sc = new Scanner(System.in);

        int getFactorial = getFacto();
        System.out.println("The factorial of the number is: " + getFactorial);

        //Dice Roll

//
//        int userInput = getInteger(1, 10);
//        System.out.println("You put in " + userInput + " that is in the scope");


//        //FACTORIAL WITH RECURSION

//        public static int getFactorial(int num) {
//        if (num == 0) {
//            return 1;
//        }
//        return num * getFactorial(num - 1);
//        }
//
//
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a number between 1-10: ");
//
//            if (scanner.hasNextInt()) {
//                int input = scanner.nextInt();
//                if (input >= 1 && input <= 10) {
//                    int factorial = getFactorial(input);
//                    System.out.println("The factorial of the number is: " + factorial);
//                } else {
//                    System.out.println("Invalid input. Try again.");
//                }
//            } else {
//                System.out.println("Invalid input. Try again.");
//            }
//            scanner.close();










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
