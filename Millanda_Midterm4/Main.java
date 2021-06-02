/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm4;

/**
 *
 * @author 2ndyrGroupA
 */
public class Main {   
      public static void main(String[] args) {
         
	Customer customer1 = new Customer(1, "Dave", 20);
	Invoice invoice1 = new Invoice(1000, customer1, 100000);
	System.out.println("Customer name: " + invoice1.getCustomerName());
        System.out.println("Customer Id: "+ customer1.getId());
        System.out.println("Customer Discount Rate: "+customer1.getDiscount());
        System.out.println("Amount: " + invoice1.getAmount());
	System.out.println("Invoice After Discount: " + invoice1.getAmountAfterDiscount());
	
      }
}