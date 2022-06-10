package FinalProject;

//Class to create an order
public class Order {
	//Declaring variables of order and price
	private String order;
	private double price;
	
	//Set order and price
	public Order(String order, double price) {
		this.order = order;
		this.price = price;
	}

	//getOrder method
	public String getOrder() {
		return order;
	}
	
	//getPrice method
	public double getPrice() {
		return price;
	}
}
