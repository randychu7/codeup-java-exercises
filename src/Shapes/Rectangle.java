package Shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

    public int getArea(){
        return length * width;
    }

    public static int getArea(int length, int width){
        return length * width;
    }

//    perimeter = 2 x length + 2 x width
//    area = length x width

}
