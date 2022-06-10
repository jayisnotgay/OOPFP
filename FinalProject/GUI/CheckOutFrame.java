package GUI;

import Main.Cashier;

import static java.lang.String.valueOf;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckOutFrame extends JFrame {
	
	JButton backButton;
	JButton checkOutButton;
	
	CheckOutFrame(Cashier cashier, int i){
		
		//Declare image icons
		ImageIcon icon = new ImageIcon("icon.png"); //Image icon
		ImageIcon back = new ImageIcon("back.png");
		
		//CokeOrder label
		JLabel cokeOrder = new JLabel();
		cokeOrder.setText("Coca-Cola "+valueOf(cashier.getNumOfCokeOrder(i)+" x $")+cashier.getPriceOfCoke()+":    $"+valueOf(cashier.getNumOfCokeOrder(i)*cashier.getPriceOfCoke()));
		cokeOrder.setBounds(15,50,250,25);
	    cokeOrder.setVerticalAlignment(JLabel.CENTER);
	    cokeOrder.setHorizontalAlignment(JLabel.LEFT);
	    
	    //SpriteOrder label
	    JLabel spriteOrder = new JLabel();
		spriteOrder.setText("Sprite "+valueOf(cashier.getNumOfSpriteOrder(i)+" x $")+cashier.getPriceOfSprite()+":    $"+valueOf(cashier.getNumOfSpriteOrder(i)*cashier.getPriceOfSprite()));
		spriteOrder.setBounds(15,80,250,25);
	    spriteOrder.setVerticalAlignment(JLabel.CENTER);
	    spriteOrder.setHorizontalAlignment(JLabel.LEFT);
	    
	    //PepsiOrder label
	    JLabel pepsiOrder = new JLabel();
		pepsiOrder.setText("Pepsi "+valueOf(cashier.getNumOfPepsiOrder(i)+" x $")+cashier.getPriceOfPepsi()+":    $"+valueOf(cashier.getNumOfPepsiOrder(i)*cashier.getPriceOfPepsi()));
		pepsiOrder.setBounds(15,110,250,25);
	    pepsiOrder.setVerticalAlignment(JLabel.CENTER);
	    pepsiOrder.setHorizontalAlignment(JLabel.LEFT);
	    
	    //LatteOrder label
	    JLabel latteOrder = new JLabel();
		latteOrder.setText("Latte "+valueOf(cashier.getNumOfLatteOrder(i)+" x $")+cashier.getPriceOfLatte()+":    $"+valueOf(cashier.getNumOfLatteOrder(i)*cashier.getPriceOfLatte()));
		latteOrder.setBounds(15,140,250,25);
	    latteOrder.setVerticalAlignment(JLabel.CENTER);
	    latteOrder.setHorizontalAlignment(JLabel.LEFT);
	    
	    //allOrder label
	    JLabel allOrder = new JLabel();
		allOrder.setText("Orders       : "+valueOf(cashier.getNumOfOrder(i)));
		allOrder.setBounds(15,370,250,25);
		allOrder.setVerticalAlignment(JLabel.CENTER);
		allOrder.setHorizontalAlignment(JLabel.LEFT);
		
		//totalPrice label
		JLabel totalPrice = new JLabel();
		totalPrice.setText("Total price : $"+valueOf(cashier.getTotalPrice(i)));
		totalPrice.setBounds(15,395,250,25);
		totalPrice.setVerticalAlignment(JLabel.CENTER);
		totalPrice.setHorizontalAlignment(JLabel.LEFT);
		
		//balance label
		JLabel balance = new JLabel();
		balance.setText("Balance     : $"+valueOf(cashier.getCustomerBalance(i)));
		balance.setBounds(15,420,250,25);
		balance.setVerticalAlignment(JLabel.CENTER);
		balance.setHorizontalAlignment(JLabel.LEFT);
		
		//fail label (set text when checkout fail)
		JLabel fail = new JLabel();
		fail.setText("");
		fail.setBounds(15,450,250,30);
		
		//back button
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
		
		//CheckOut button
		checkOutButton = new JButton();
		checkOutButton.setBounds(130,650,100,30);
		//Checkout action listener
		checkOutButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//If true
				if(cashier.CheckOut(i)) {
					//Dispose window
					dispose();
					//New receipt window
					ReceiptFrame receiptPage = new ReceiptFrame(cashier, i);
					//Console log get number of order
					System.out.println(cashier.getNumOfOrder(i));
				}else {
					//Set fail text
					fail.setText("Insufficient balance.");
				}
			}
		});
		//set text
		checkOutButton.setText("Checkout");
		checkOutButton.setFocusable(false);
		
		this.setTitle("Vending Machine Simulator"); //Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Kills app on close
		this.setResizable(false); //Prevents resizing frame
		this.setSize(360,720); // x-dimension, and y-dimension of frame
		this.setLayout(null);
		this.setVisible(true); // Make frame visible
		this.add(backButton);
		this.add(checkOutButton);
		this.add(cokeOrder);
		this.add(spriteOrder);
		this.add(pepsiOrder);
		this.add(latteOrder);
		this.add(allOrder);
		this.add(totalPrice);
		this.add(balance);
		this.add(fail);

		this.setIconImage(icon.getImage()); //Change icon of frame
		this.getContentPane().setBackground(new Color(242,242,242)); //Color background
	}

}
