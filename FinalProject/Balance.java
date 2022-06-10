package FinalProject;

//Balance for customer object
public class Balance {
	
	//Declaring balance variable
	private double balance;
	
	//Set balance
	public Balance() {
		this.balance = 100;
	}
	
	//getBalance method
	public double getBalance() {
		return balance;
	}
	
	//Order checkout
	public boolean setCheckOut(double price) {
		if(balance >= price && price>0) { //If balance is more or equal than price, and price is more than 0
			balance -= price; //Price deducted from balance
			System.out.println("Order success!"); //Console log
			System.out.println("$"+balance); //Console log
			return true; //Return true boolean
		}else {
			System.out.println("Insufficient balance."); //Console log
			System.out.println("$"+balance); //Console log
			return false; //Return false boolean
		}
	}
	
	//Customer deposit
	public boolean setDeposit(double deposit) {
		if(deposit > 0) { //If deposit is more than 0
			balance += deposit; //Deposit is added to balance
			System.out.println("Deposit success!"); //Console log
			System.out.println("$"+balance); //Console log
			return true; //Return true boolean
		}else {
			System.out.println("Deposit must be greater than 0!"); //Console log
			System.out.println("$"+balance); //Console log
			return false; //Return false boolean
		}
	}
}
