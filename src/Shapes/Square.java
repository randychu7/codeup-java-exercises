package Shapes;

public class Square extends Rectangle{

    protected int side;

    public int getPerimeter(){
        return 4 * side;
    }

    public int getArea(){
        return side * side;
    }
    public Square (int side){
        super(side,side);
        this.side = side;
    }

}
