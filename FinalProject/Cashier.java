package FinalProject;

import java.util.ArrayList;

public class Cashier {
	
	//Declaring totalPrice and numberOfCustomers
	public double totalPrice;
	private int numberOfCustomers;
	
	//Creating coke, sprite, pepsi, latte objects
	Coke coke = new Coke();
	Sprite sprite = new Sprite();
	Pepsi pepsi = new Pepsi();
	Latte latte = new Latte();
	
	//Creating order objects for each beverages
	Order orderCoke = new Order(coke.getName(),coke.getPrice());
	Order orderSprite = new Order(sprite.getName(),sprite.getPrice());
	Order orderPepsi = new Order(pepsi.getName(),pepsi.getPrice());
	Order orderLatte = new Order(latte.getName(),latte.getPrice());
	
	//Declaring customer array list that stores customers
	protected ArrayList<Customer> customers = new ArrayList<Customer>();
	
	//addCustomer method 
	public void addCustomer(String email, String password) {
		//Creating Customer object
		Customer newCustomer = new Customer(email, password);
		//Appends customer object to customers array
		customers.add(newCustomer);
	}
	
	//getCustomer method that returns email
	public String getCustomer(int i) {
		//Returns customers email
        return customers.get(i).getEmail();
	}
	
	//getCustomerBalance method that returns balance
	public double getCustomerBalance(int i) {
		//Returns customers balance
        return customers.get(i).balance.getBalance();
	}
	
	//getCustomerPassword method that returns password
	public String getCustomerPassword(int i) {
		//Returns customers password
        return customers.get(i).getPassword();
	}
	
	//getNumOfCustomers method that returns customers array list size
	public int getNumOfCustomers() {
		//Returns customers array list size
		numberOfCustomers = customers.size();
		return numberOfCustomers;
	}
	
	//getAllCustomer method for console log
	public void getAllCustomer() {
		for(int i=0; i<customers.size(); i++) {
			//Prints every customers email on the array list
			System.out.println((i+1)+". "+customers.get(i).getEmail());
		}
	}
	
	//setOrderCoke method to set coke order
	public void setOrderCoke(int i) {
		//Appends orderCoke orders array list in customers array list
		customers.get(i).orders.add(orderCoke);
	}
	
	//setOrderSprite method to set sprite order
	public void setOrderSprite(int i) {
		//Appends orderSprite orders array list in customers array list
		customers.get(i).orders.add(orderSprite);	
	}
	
	//setOrderPepsi method to set pepsi order
	public void setOrderPepsi(int i) {
		//Appends orderPepsi orders array list in customers array list
		customers.get(i).orders.add(orderPepsi);		
	}
	
	//setOrderLatte method to set latte order
	public void setOrderLatte(int i) {
		//Appends orderLatte orders array list in customers array list
		customers.get(i).orders.add(orderLatte);		
	}
	
	//removeOrderCoke method to remove coke order
	public void removeOrderCoke(int i) {
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals coke order
			if(customers.get(i).orders.get(index)==orderCoke) {
				//Remove customer's order index
				customers.get(i).orders.remove(index);
				//break
				break;
			}
		}
	}
	
	//removeOrderSprite method to remove sprite order
	public void removeOrderSprite(int i) {
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals sprite order
			if(customers.get(i).orders.get(index)==orderSprite) {
				//Remove customer's order index
				customers.get(i).orders.remove(index);
				//break
				break;
			}
		}
	}
	
	//removeOrderPepsi method to remove pepsi order
	public void removeOrderPepsi(int i) {
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals pepsi order
			if(customers.get(i).orders.get(index)==orderPepsi) {
				//Remove customer's order index
				customers.get(i).orders.remove(index);
				//break
				break;
			}
		}
	}
	
	//removeOrderLatte method to remove latte order
	public void removeOrderLatte(int i) {
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals latte order
			if(customers.get(i).orders.get(index)==orderLatte) {
				//Remove customer's order index
				customers.get(i).orders.remove(index);
				//break
				break;
			}
		}
	}
	
	//getNumOfCokeOrder method to get number of coke orders
	public int getNumOfCokeOrder(int i) {
		//Declaring totalOrderCoke
		int totalOrderCoke = 0;
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals coke order
			if(customers.get(i).orders.get(index)==orderCoke) {
				//Add totalOrderCoke by 1
				totalOrderCoke += 1;	
			}
		}return totalOrderCoke; //Returns number of coke orders
	}
	
	//getNumOfSpriteOrder method to get number of sprite orders
	public int getNumOfSpriteOrder(int i) {
		//Declaring totalOrderSprite
		int totalOrderSprite = 0;
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals sprite order
			if(customers.get(i).orders.get(index)==orderSprite) {
				//Add totalOrderSprite by 1
				totalOrderSprite += 1;	
			}
		}return totalOrderSprite; //Returns number of sprite orders
	}
	
	//getNumOfPepsiOrder method to get number of pepsi orders
	public int getNumOfPepsiOrder(int i) {
		//Declaring totalOrderPepsi
		int totalOrderPepsi = 0;
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals pepsi order
			if(customers.get(i).orders.get(index)==orderPepsi) {
				//Add totalOrderPepsi by 1
				totalOrderPepsi += 1;	
			}
		}return totalOrderPepsi; //Returns number of pepsi orders
	}
	
	//getNumOfLatteOrder method to get number of latte orders
	public int getNumOfLatteOrder(int i) {
		//Declaring totalOrderLatte
		int totalOrderLatte = 0;
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).orders.size(); index++) {
			//If customer's order index equals latte order
			if(customers.get(i).orders.get(index)==orderLatte) {
				//Add totalOrderLatte by 1
				totalOrderLatte += 1;	
			}
		}return totalOrderLatte; //Returns number of latte orders
	}
	
	//getNumOfPrevCokeOrder method to get number of previous latte orders (receipt)
	public int getNumOfPrevCokeOrder(int i) {
		//Declaring totalPrevOrderCoke
		int totalPrevOrderCoke = 0;
		//For each order object in orders array list
		for(int index=0; index<customers.get(i).prevorder.size(); index++) {
			//If customer's prevorder index equals coke order
			if(customers.get(i).prevorder.get(index)==orderCoke) {
				//Add totalPrevOrderCoke by 1
				totalPrevOrderCoke += 1;	
			}
		}return totalPrevOrderCoke; //Returns number of previous coke order
	}
	
	//getNumOfPrevSpriteOrder method to get number of previous sprite orders (receipt)
	public int getNumOfPrevSpriteOrder(int i) {
		//Declaring totalPrevOrderSprite
		int totalPrevOrderSprite = 0;
		//For each order object in prevorder array list
		for(int index=0; index<customers.get(i).prevorder.size(); index++) {
			//If customer's prevorder index equals sprite order
			if(customers.get(i).prevorder.get(index)==orderSprite) {
				//Add totalPrevOrderSprite by 1
				totalPrevOrderSprite += 1;	
			}
		}return totalPrevOrderSprite; //Returns number of previous sprite order
	}
	
	//getNumOfPrevPepsiOrder method to get number of previous pepsi orders (receipt)
	public int getNumOfPrevPepsiOrder(int i) {
		//Declaring totalPrevOrderPepsi
		int totalPrevOrderPepsi = 0;
		//For each order object in prevorder array list
		for(int index=0; index<customers.get(i).prevorder.size(); index++) {
			//If customer's prevorder index equals pepsi order
			if(customers.get(i).prevorder.get(index)==orderPepsi) {
				//Add totalPrevOrderPepsi by 1
				totalPrevOrderPepsi += 1;	
			}
		}return totalPrevOrderPepsi; //Returns number of previous pepsi order
	}
	
	//getNumOfPrevLatteOrder method to get number of previous latte orders (receipt)
	public int getNumOfPrevLatteOrder(int i) {
		//Declaring totalPrevOrderLatte
		int totalPrevOrderLatte = 0;
		//For each order object in prevorder array list
		for(int index=0; index<customers.get(i).prevorder.size(); index++) {
			//If customer's prevorder index equals latte order
			if(customers.get(i).prevorder.get(index)==orderLatte) {
				//Add totalPrevOrderLatte by 1
				totalPrevOrderLatte += 1;	
			}
		}return totalPrevOrderLatte; //Returns number of previous latte order
	}
	
	//getNumOfHistoryCokeOrder method to get number of coke orders history
	public int getNumOfHistoryCokeOrder(int i) {
		//Declaring totalPrevOrderCoke
		int totalHistoryOrderCoke = 0;
		//For each order object in orderhistory array list
		for(int index=0; index<customers.get(i).orderhistory.size(); index++) {
			//If customer's orderhistory index equals coke order
			if(customers.get(i).orderhistory.get(index)==orderCoke) {
				//Add totalHistoryOrderCoke by 1
				totalHistoryOrderCoke += 1;	
			}
		}return totalHistoryOrderCoke; //Returns number of coke orders history
	}
	
	//getNumOfHistorySpriteOrder method to get number of sprite orders history
	public int getNumOfHistorySpriteOrder(int i) {
		//Declaring totalHistoryOrderSprite
		int totalHistoryOrderSprite = 0;
		//For each order object in orderhistory array list
		for(int index=0; index<customers.get(i).orderhistory.size(); index++) {
			//If customer's orderhistory index equals sprite order
			if(customers.get(i).orderhistory.get(index)==orderSprite) {
				//Add totalHistoryOrderSprite by 1
				totalHistoryOrderSprite += 1;	
			}
		}return totalHistoryOrderSprite; //Returns number of coke orders history
	}
	
	//getNumOfHistoryPepsiOrder method to get number of pepsi orders history
	public int getNumOfHistoryPepsiOrder(int i) {
		//Declaring totalHistoryOrderPepsi
		int totalHistoryOrderPepsi = 0;
		//For each order object in orderhistory array list
		for(int index=0; index<customers.get(i).orderhistory.size(); index++) {
			//If customer's orderhistory index equals pepsi order
			if(customers.get(i).orderhistory.get(index)==orderPepsi) {
				//Add totalHistoryOrderPepsi by 1
				totalHistoryOrderPepsi += 1;	
			}
		}return totalHistoryOrderPepsi; //Returns number of pepsi orders history
	}
	
	//getNumOfHistoryLatteOrder method to get number of latte orders history
	public int getNumOfHistoryLatteOrder(int i) {
		//Declaring totalHistoryOrderLatte
		int totalHistoryOrderLatte = 0;
		//For each order object in orderhistory array list
		for(int index=0; index<customers.get(i).orderhistory.size(); index++) {
			//If customer's orderhistory index equals latte order
			if(customers.get(i).orderhistory.get(index)==orderLatte) {
				//Add totalHistoryOrderLatte by 1
				totalHistoryOrderLatte += 1;	
			}
		}return totalHistoryOrderLatte; //Returns number of latte orders history
	}
	
	//getNumOfOrder method to get number of all orders
	public int getNumOfOrder(int i) {
		//Returns orders array list size of customers array list
		return customers.get(i).orders.size();
	}
	
	//getNumOfPrevOrder method to get number of all previous orders (receipt)
	public int getNumOfPrevOrder(int i) {
		//Returns prevorders array list size of customers array list
		return customers.get(i).prevorder.size();
	}
	
	//getNumOfHistoryOrder method to get number of all history orders
	public int getNumOfHistoryOrder(int i) {
		//Returns orderhistory array list size of customers array list
		return customers.get(i).orderhistory.size();
	}
	
	//getPriceOfCoke method to get coke object price
	public double getPriceOfCoke() {
		//Returns coke price
		return coke.getPrice();
	}
	
	//getPriceOfSprite method to get sprite object price
	public double getPriceOfSprite() {
		//Returns sprite price
		return sprite.getPrice();
	}
	
	//getPriceOfPepsi method to get pepsi object price
	public double getPriceOfPepsi() {
		//Returns pepsi price
		return pepsi.getPrice();
	}
	
	//getPriceOfLatte method to get latte object price
	public double getPriceOfLatte() {
		//Returns latte price
		return latte.getPrice();
	}
	
	//getTotalPrice method to get total price of orders
	public double getTotalPrice(int i) {
		//Console log
		System.out.println(customers.get(i).getTotalPrice());
		//Returns total price of index customer
		return customers.get(i).getTotalPrice();
	}
	
	//getTotalPrevPrice method to get total price of previous orders (receipt)
	public double getTotalPrevPrice(int i) {
		//Console log
		System.out.println(customers.get(i).getTotalPrevPrice());
		//Returns total previous price of index customer
		return customers.get(i).getTotalPrevPrice();
	}
	
	//getTotalHistoryPrice method to get total price of order history
	public double getTotalHistoryPrice(int i) {
		//Console log
		System.out.println(customers.get(i).getTotalHistoryPrice());
		//Returns total order history price of index customer
		return customers.get(i).getTotalHistoryPrice();
	}
	
	//getOrderHistory method to get all order history of index customer (console log)
	public void getOrderHistory(int i) {
		//For each index from 0 to orderhistory size
		for(int index=0; index<customers.get(i).orderhistory.size(); index++) {
			//Prints all order history
			System.out.println(customers.get(i).orderhistory.get(index).getOrder()+"  $"+customers.get(i).orderhistory.get(index).getPrice());
		}
	}
	
	//CheckOut method to set checkout for specified customer
	public boolean CheckOut(int i) {
		//if customers balance setCheckOut = true
		if(customers.get(i).balance.setCheckOut(customers.get(i).getTotalPrice())) {
			//For each index from 0 to orders size
			for(int index=0; index<customers.get(i).orders.size(); index++) {
				//Append objects of orders array list into orderhistory array list
				customers.get(i).orderhistory.add(customers.get(i).orders.get(index));
				//Append objects of orders array list into prevorder array list
				customers.get(i).prevorder.add(customers.get(i).orders.get(index));
				}
			//Clears orders array list
			customers.get(i).orders.clear();
			//Returns true
			return true;
		}else {
			//Returns false
			return false;
		}
	}
	
	//Success method for checkout success
	public boolean Success(int i) {
		//Clears prevorder array list (receipt)
		customers.get(i).prevorder.clear();
		//Return true
		return true;
	}
}

