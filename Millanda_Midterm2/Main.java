/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm2;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
       Customer customer1 = new Customer("name: " + "Dave Lyndrex Millan");
       customer1.setMember(true);
       customer1.setMemberType("SILVER");
       System.out.println(customer1.toString());

       Visit visitor = new Visit("Dave Lyndrex", new Date());
       visitor.setProductExpense(2000);
       visitor.setServiceExpense(500);
       DiscountRate discounted = new DiscountRate();
       System.out.print("Service Discount is: ");
       System.out.println(visitor.getTotalExpense());
       
   }
    
}
