package FinalProject;

//Carbonated class
public class Coffee implements Beverage{
	//Declaring variables
	protected String name;
	protected double price;
	
	//getName method overridden from Beverage
	@Override
	public String getName() {
		return name;
	}

	//getPrice method overridden from Beverage
	@Override
	public double getPrice() {
		return price;
	}
	
}
