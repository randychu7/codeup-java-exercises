package Shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side, side);

    }

    @Override
    public void setLength(int length) {
       this.length = length;
    }


    @Override
    public void setWidth(int width) {
       this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }


//    protected int side;
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
//
//    public int getArea(){
//        return side * side;
//    }
//    public Square (int side){
//        super(side,side);
//        this.side = side;
//    }

}
