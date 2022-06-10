package FinalProject;

import static java.lang.String.valueOf;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ProfileFrame extends JFrame {
	
	JButton backButton;
	JButton depositButton;
	JTextField depositField;
	
	ProfileFrame(Cashier cashier, int i){
		
		//Image icon
		ImageIcon icon = new ImageIcon("icon.png");
		ImageIcon back = new ImageIcon("back.png");
		
		//Declare border
		Border border = BorderFactory.createLineBorder(Color.GRAY,3);
		
		//Customer text label
		JLabel customerText = new JLabel();
		customerText.setText("Customer");
		customerText.setFont(new Font("Lucida Sans",Font.BOLD,12));
		customerText.setBounds(140,40,150,30);
		
		//Deposit text label
		JLabel depositText = new JLabel();
		depositText.setText("Deposit");
		depositText.setFont(new Font("Lucida Sans",Font.BOLD,12));
		depositText.setBounds(145,145,150,30);
		
		//Order history text
		JLabel orderHistoryText = new JLabel();
		orderHistoryText.setText("Order History");
		orderHistoryText.setFont(new Font("Lucida Sans",Font.BOLD,12));
		orderHistoryText.setBounds(130,300,150,30);
		
		//Coke order history text
		JLabel cokeOrderHistory = new JLabel();
		//Set text to value of coke history order and price of customer
		cokeOrderHistory.setText("Coca-Cola "+valueOf(cashier.getNumOfHistoryCokeOrder(i)+" x $")+cashier.getPriceOfCoke()+":    $"+valueOf(cashier.getNumOfHistoryCokeOrder(i)*cashier.getPriceOfCoke()));
		cokeOrderHistory.setBounds(50,360,250,25);
	    cokeOrderHistory.setVerticalAlignment(JLabel.CENTER);
	    cokeOrderHistory.setHorizontalAlignment(JLabel.LEFT);
	    
	    //Sprite order history text
	    JLabel spriteOrderHistory = new JLabel();
	  //Set text to value of sprite history order and price of customer
		spriteOrderHistory.setText("Sprite "+valueOf(cashier.getNumOfHistorySpriteOrder(i)+" x $")+cashier.getPriceOfSprite()+":    $"+valueOf(cashier.getNumOfHistorySpriteOrder(i)*cashier.getPriceOfSprite()));
		spriteOrderHistory.setBounds(50,390,250,25);
	    spriteOrderHistory.setVerticalAlignment(JLabel.CENTER);
	    spriteOrderHistory.setHorizontalAlignment(JLabel.LEFT);
	    
	    //Pepsi order history text
	    JLabel pepsiOrderHistory = new JLabel();
	  //Set text to value of pepsi history order and price of customer
		pepsiOrderHistory.setText("Pepsi "+valueOf(cashier.getNumOfHistoryPepsiOrder(i)+" x $")+cashier.getPriceOfPepsi()+":    $"+valueOf(cashier.getNumOfHistoryPepsiOrder(i)*cashier.getPriceOfPepsi()));
		pepsiOrderHistory.setBounds(50,420,250,25);
	    pepsiOrderHistory.setVerticalAlignment(JLabel.CENTER);
	    pepsiOrderHistory.setHorizontalAlignment(JLabel.LEFT);
	    
	    //Latte order history text
	    JLabel latteOrderHistory = new JLabel();
	    //Set text to value of latte history order and price of customer
		latteOrderHistory.setText("Latte "+valueOf(cashier.getNumOfHistoryLatteOrder(i)+" x $")+cashier.getPriceOfLatte()+":    $"+valueOf(cashier.getNumOfHistoryLatteOrder(i)*cashier.getPriceOfLatte()));
		latteOrderHistory.setBounds(50,450,250,25);
	    latteOrderHistory.setVerticalAlignment(JLabel.CENTER);
	    latteOrderHistory.setHorizontalAlignment(JLabel.LEFT);
	    
	    //ALl order history text
	    JLabel allOrderHistory = new JLabel();
	    //Set text to value of all history order of customer
		allOrderHistory.setText("Orders       : "+valueOf(cashier.getNumOfHistoryOrder(i)));
		allOrderHistory.setBounds(50,510,250,25);
		allOrderHistory.setVerticalAlignment(JLabel.CENTER);
		allOrderHistory.setHorizontalAlignment(JLabel.LEFT);
		
		//Total price history text
		JLabel totalPriceHistory = new JLabel();
		//Set text to value of total history price of customer
		totalPriceHistory.setText("Total price : $"+valueOf(cashier.getTotalHistoryPrice(i)));
		totalPriceHistory.setBounds(50,540,250,25);
		totalPriceHistory.setVerticalAlignment(JLabel.CENTER);
		totalPriceHistory.setHorizontalAlignment(JLabel.LEFT);
		
		//Username text
		JLabel username = new JLabel();
		//Set text to customer's email
		username.setText("     Username   "+cashier.getCustomer(i));
		username.setBounds(50,75,250,30);
		username.setBorder(border);
		
		//Balance text
		JLabel balance = new JLabel();
		//Set text to customer's balance
		balance.setText("     Balance   $"+cashier.getCustomerBalance(i));
		balance.setBounds(50,105,250,30);
		balance.setBorder(border);
		
		//Fail text
		JLabel fail = new JLabel();
		//Visibility false
		fail.setVisible(false);
		fail.setText("Deposit must be greater than 0.");
		fail.setBounds(50,265,250,30);
		
		//Success text
		JLabel success = new JLabel();;
		//Text nothing
		success.setText("");
		success.setBounds(50,265,250,30);
		
		//Deposit text field
		depositField = new JTextField();
		depositField.setBounds(50,185,250,30);
		
		//Back button
		backButton = new JButton();
		backButton.setBounds(15,12,30,30);
		//backButton action listener
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Dispose window
				dispose();
				//New order window
				OrderFrame orderWindow = new OrderFrame(cashier, i);
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
				}
		});
		//Set icon back
		backButton.setIcon(back);
		backButton.setFocusable(false);
		
		//Deposit button
		depositButton = new JButton();
		depositButton.setBounds(200,225,100,30);
		//depositButon action listener
		depositButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Set variable deposit to deposit field entered text
				double deposit = Double.parseDouble(depositField.getText());
				//If deposit is more than 0
				if(deposit>0) {
					//Console log get customer's balance
					System.out.println(cashier.getCustomerBalance(i));
					//Set deposit method
					cashier.customers.get(i).balance.setDeposit(deposit);
					//Set text
					balance.setText("     Balance   $"+cashier.getCustomerBalance(i));
					//Fail text visibility false
					fail.setVisible(false);
					//Set success text
					success.setText("Deposit success! You've deposited $"+depositField.getText()+".");
				}else {
					//Set success text to nothing
					success.setText("");
					//Set fail text visibility true
					fail.setVisible(true);
					//Console log
					System.out.println("Deposit must be greater than 0.");
				}
				}
		});
		//Set text
		depositButton.setText("OK");
		depositButton.setFocusable(false);
		
		this.setTitle("Vending Machine Simulator"); //Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Kills app on close
		this.setResizable(false); //Prevents resizing frame
		this.setSize(360,720); // x-dimension, and y-dimension of frame
		this.setLayout(null);
		this.setVisible(true); // Make frame visible
		this.add(customerText);
		this.add(depositText);
		this.add(orderHistoryText);
		this.add(username);
		this.add(balance);
		this.add(cokeOrderHistory);
		this.add(spriteOrderHistory);
		this.add(pepsiOrderHistory);
		this.add(latteOrderHistory);
		this.add(allOrderHistory);
		this.add(totalPriceHistory);
		this.add(depositField);
		this.add(backButton);
		this.add(depositButton);
		this.add(fail);
		this.add(success);
		
		this.setIconImage(icon.getImage()); //Change icon of frame
		this.getContentPane().setBackground(new Color(242,242,242)); //Color background
	}

}
