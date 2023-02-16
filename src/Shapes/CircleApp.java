package Shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius");
        int userInput = sc.nextInt();


        Circle circle = new Circle(userInput);
        double circumference = circle.getCircumference();
        double area = circle.getArea();




        System.out.printf("The circumference is %.02f ",circumference);
        System.out.printf("And the Area is %.02f ",area);








    }
}
