package Shapes;

import static java.lang.Math.PI;

public class Circle {

    private int radius;

    //Getter
    public int getRadius(){
        return this.radius;
    }

    //Setter
    public void setRadius(int radi){
        this.radius = radi;
    }

   public Circle (int radius){
        this.radius = radius;
   }

   public double getArea(){
        return PI * (getRadius()*getRadius());
   }

   public double getCircumference(){
        return PI * getRadius() * 2;
   }




}
