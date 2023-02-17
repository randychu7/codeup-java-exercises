package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5,4, 5);

        int box1Area = Rectangle.getArea(box1);
        int box1Perm = Rectangle.getPerimeter(box1);

//        System.out.println(box1Area);
//        System.out.println(box1Perm);
        System.out.println(Square.getArea(box2));
        System.out.println(Square.getPerimeter(box2));
//        System.out.println(Rectangle.getPerimeter(box2));




    }
}
