/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm1;

/**
 *
 * @author 2ndyrGroupA
 */
public class Square extends Rectangle{
    public Square(){
        super();
        double side = 1.0;
    }
    public Square(double side){
        super(side,side);
        side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        side = side;
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPerimeter(){
        return 4*getSide();
    }
    public String toString(){
        return ("A square with side= "+getSide()+", which is a subclass of "+super.toString());
    }
}
