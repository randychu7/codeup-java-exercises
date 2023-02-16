package util;

import java.util.Scanner;


public class Input {
     Scanner sc = new Scanner(System.in);
//    String userInput = sc.nextLine();

    public String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line...");
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Say yes or no?");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String lowerInput = userInput.toLowerCase();

        if (lowerInput == "y"|| lowerInput == "yes" || lowerInput == "true"){
            System.out.println("true");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public int getInt(int min, int max) {

        boolean repeat = true;
        int userInt;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an interger between " + min + " and " + max);
            userInt = sc.nextInt();
            if (userInt >= min && userInt <= max) {
                System.out.println("That is within the range");
                repeat = false;

            } else {
                System.out.println("Try again!");
//                repeat = true;
            }
        } while (repeat);
        return userInt;
    }

    public int getDouble(double min, double max) {

        boolean repeat = true;

        int userInt;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an interger between " + min + " and " + max);
            userInt = sc.nextInt();
            if (userInt >= min && userInt <= max) {
                System.out.println("That is within the range");
                repeat = false;

            } else {
                System.out.println("Try again!");
            }
        } while (repeat);
        return userInt;
    }






}
