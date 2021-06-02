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
public class Invoice {
    private int id;
	private Customer customer;
	private double amount;

	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerName() {
		return customer.getName();
	}
        

	public double getAmountAfterDiscount() {
		return amount - amount * customer.getDiscount() / 100;
	}
        public String toString(){
        return ("The Id of the customer is: "+id+ " name: "+customer+ ", discount: "+super.toString());
}
}