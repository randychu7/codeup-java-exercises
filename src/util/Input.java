package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a line...");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Say yes or no?");
        String userInput = scanner.nextLine().toLowerCase();

        if (userInput.equals("y") || userInput.equals("yes") || userInput.equals("true")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = 0;
        boolean repeat = true;

        do {
            System.out.println("Choose an integer between " + min + " and " + max);

            try {
                String userInput = scanner.nextLine();
                userInt = Integer.parseInt(userInput);

                if (userInt >= min && userInt <= max) {
                    repeat = false;
                } else {
                    System.out.println("Try again!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        } while (repeat);

        return userInt;
    }

    public double getDouble(double min, double max) {
        double userDouble = 0;
        boolean repeat = true;

        do {
            System.out.println("Choose a double between " + min + " and " + max);

            try {
                String userInput = scanner.nextLine();
                userDouble = Double.parseDouble(userInput);

                if (userDouble >= min && userDouble <= max) {
                    repeat = false;
                } else {
                    System.out.println("Try again!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter a double.");
            }
        } while (repeat);

        return userDouble;
    }

    public static void main(String[] args) {
        Input newInput = new Input();

        try {
            newInput.getInt(1, 10);
            newInput.getDouble(1.0, 10.0);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
