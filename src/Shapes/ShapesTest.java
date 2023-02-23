package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        Measurable myShape1 = new Rectangle(5,5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());


//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
////        System.out.println(Rectangle.getArea(4 , 5));

    }
}
