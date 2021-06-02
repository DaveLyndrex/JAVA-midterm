/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm2;

import java.util.Date;

/**
 *
 * @author 2ndyrGroupA
 */
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, Date date){
        this.customer = new Customer(name);
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }
    public double getServiceExpense(){
        return serviceExpense;
    }
    public void setServiceExpense(double ex){
        serviceExpense = ex;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public void setProductExpense(double ex){
        productExpense = ex;
    }
    public double getTotalExpense(){
        return serviceExpense + productExpense;
    }
    public String toString(){
        return String.format("Visit of customer %1$s at date %2$s ", customer.toString(), date.toString());
    }
}
