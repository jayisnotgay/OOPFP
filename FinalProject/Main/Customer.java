package Main;

import java.util.ArrayList;

public class Customer {
	//Declaring variables: email, password, balance, order
	protected String email;
	protected String password;
	protected Balance balance;
	protected Order order;
	
	//Declaring order arraylist for orders, orderhistory, prevorder(order receipt)
	protected ArrayList<Order> orders = new ArrayList<Order>();
	protected ArrayList<Order> orderhistory = new ArrayList<Order>();
	protected ArrayList<Order> prevorder = new ArrayList<Order>();
	
	//Set email, password, new balance
	public Customer(String email, String password) {
		this.email = email;
		this.password = password;
		this.balance = new Balance();
	}
	
	//getEmail method
	public String getEmail() {
		return email;
	}
	
	//getPassword method
	public String getPassword() {
		return password;
	}
	
	//getTotalPrice method
	public double getTotalPrice() {
		double totalPrice = 0; //Declaring totalPrice variable
		for(int index=0;index<orders.size();index++) { 
			totalPrice += orders.get(index).getPrice(); //Each order price in array list added to totalPrice
		}
		return totalPrice; //Returns price
	}
	
	//getTotalPrevPrice method (receipt total price)
	public double getTotalPrevPrice() {
		double totalPrevPrice = 0; //Declaring totalPrevPrice variable
		for(int index=0;index<prevorder.size();index++) {
			totalPrevPrice += prevorder.get(index).getPrice(); //Each prevorder price in array list added to totalPrevPrice
		}
		return totalPrevPrice; //Returns price
	}
	
	//getTotalHistoryPrice method
	public double getTotalHistoryPrice() {
		double totalHistoryPrice = 0; //Declaring totalHistoryPrice variable
		for(int index=0;index<orderhistory.size();index++) {
			totalHistoryPrice += orderhistory.get(index).getPrice(); //Each orderhistory price in array list added to totalHistoryPrice
		}
		return totalHistoryPrice; //Returns price
	}
}
