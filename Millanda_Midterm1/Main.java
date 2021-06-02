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
public class Main {
    public static void main (String args[]){
       Shapes circle = new Circle();
       System.out.println(circle.toString());

       Shapes shape2 = new Shapes(" Red", true);
       System.out.println(shape2.toString());
       
       System.out.println("The color is " + shape2.getColor());
       System.out.println(shape2.isFilled());

       System.out.println("\n");

       //Circle
       Circle circle1 = new Circle();
       System.out.println(circle1.toString());
       
       Circle circle2 = new Circle(2.0);

       Circle circle3 = new Circle(2.0, " Pink", true);
       System.out.println(circle3.toString());

       System.out.println("The Circle has radius of "
               + circle1.getRadius() + " and an area of " + circle1.getArea());

       System.out.println("The Circle has radius of "
               + circle2.getRadius() + " and an area of " + circle2.getArea());
       System.out.println("\n");
       //Rectangle  
       Rectangle rectangle1 = new Rectangle();
       System.out.println(rectangle1.toString());
       Rectangle rectangle2 = new Rectangle(1.2f, 3.4f);
       System.out.println(rectangle2);  

       rectangle2.setLength(5.6f);
       rectangle2.setWidth(7.8f);
       System.out.println(rectangle2);  // toString()
       System.out.println("Length is: " + rectangle2.getLength());
       System.out.println("Width is: " + rectangle2.getWidth());
       
       System.out.printf("Area is: %.2f%n", rectangle2.getArea());
       System.out.printf("Perimeter is: %.2f%n", rectangle2.getPerimeter());       
       System.out.println("\n");
                   
       //Square  
       Square square1 = new Square();
       System.out.println(square1.toString());

       Square square2 = new Square(4.0);
       System.out.println(square2.toString());

       Square square3 = new Square(3.0," Green",false);
       System.out.println(square3.toString());
       
       
    }        
}
