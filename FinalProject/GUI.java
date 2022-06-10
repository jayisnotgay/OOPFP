package FinalProject;

public class GUI {

	public static void main(String[] args) {
		
		//Declare cashier object
		Cashier cashier = new Cashier();
		//Add customers
		cashier.addCustomer("jairo@gmail.com", "12345");
		cashier.addCustomer("nathan@gmail.com", "54321");
		cashier.addCustomer("test@gmail.com", "123");
		
		//Login window GUI
		LoginFrame loginWindow = new LoginFrame(cashier);
	}
}
	
