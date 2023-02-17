package Shapes;

public class Rectangle {
    private static int length;
    private static int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    //Getter
    public static int getLength() {
        return length;
    }

    public static int getWidth() {
        return width;
    }
    //Setter

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static int getArea(Rectangle box){
        return getLength() * getWidth();
    }

    public static int getPerimeter(Rectangle area){
        return 2 * getLength() + 2 * getWidth();
    }



}
