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
public class Shapes {

  private boolean filled;
  private String color;
  
  public Shapes(){
      filled = true;
      color= " Green";
  }
  public Shapes(String colorln,boolean filledln){
      filled=filledln;
      color = colorln;
  }
  public String getColor(){
      return color;
  }
  public boolean isFilled(){
      if(filled==true){
          return true;
      }else{
          return false;
      }
  }
  public String toString(){
      String isNot="";
      if(isFilled()== false){
          isNot = "not";
      }
          return "A shape with color of " +color+ " and is " +isNot+ " filled.";
      
  }
  
          
          
  
}
