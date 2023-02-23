package Shapes;

public class Rectangle extends Quadrilateral{
    //Implements Measurables

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width *2;
    }

    @Override
    public double getArea() {
        return length * width;
    }


//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public static int getArea(int length, int width){
//        return length * width;
//    }


}
