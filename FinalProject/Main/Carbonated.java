package Main;

//Carbonated class that implements Beverage interface
public class Carbonated implements Beverage{
	//Declare name and price variable
	protected String name;
	protected double price;
	
	//getName method overridden from Beverages
	@Override
	public String getName() {
		return name;
	}

	//getPrice method overridden from Beverages
	@Override
	public double getPrice() {
		return price;
	}

}
