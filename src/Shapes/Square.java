package Shapes;

public class Square extends Rectangle{
    private static int side;

    public static int getSide() {
        return side;
    }

    public static int getArea(Rectangle box){
        return getSide() * getSide();
    }

    public static int getPerimeter(Rectangle box){
        return 4 * getSide();
    }
    public Square(int length, int width, int side) {
        super(length, width);
        Square.side = side;
    }
}
