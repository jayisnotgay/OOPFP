package GUI;

import Main.Cashier;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	
	//Declare variables
	private int i; //i for customer index
	JButton loginButton;
	JTextField usernameField;
	JTextField passwordField;
	
	LoginFrame(Cashier cashier){
		
		//Image icons
		ImageIcon icon = new ImageIcon("icon.png"); //Image icon
		ImageIcon vendingmachine = new ImageIcon("vendingmachine.png");
		
		//Vending machine image and text in login window
		JLabel vendingmachinelogin = new JLabel();
		vendingmachinelogin.setIcon(vendingmachine);
		vendingmachinelogin.setText("Vending Machine Simulator");
		vendingmachinelogin.setHorizontalTextPosition(JLabel.CENTER);
		vendingmachinelogin.setVerticalTextPosition(JLabel.BOTTOM);
		vendingmachinelogin.setFont(new Font("Lucida Sans",Font.BOLD,20));
		vendingmachinelogin.setIconTextGap(0);
		vendingmachinelogin.setVerticalAlignment(JLabel.TOP);
		vendingmachinelogin.setHorizontalAlignment(JLabel.CENTER);
		vendingmachinelogin.setBounds(0, 280, 360, 360);
		
		//Username text
		JLabel username = new JLabel();
		username.setText("Username");
		username.setBounds(15,120,80,30);
		
		//Password text
		JLabel password = new JLabel();
		password.setText("Password");
		password.setBounds(15,160,80,30);
		
		//If login failed text
		JLabel fail = new JLabel();
		//Visibility false (true if failed)
		fail.setVisible(false);
		fail.setText("Wrong username or password.");
		fail.setBounds(100,240,200,30);
		
		//Username text field
		usernameField = new JTextField();
		usernameField.setBounds(100,120,200,30);
		
		//Password text field
		passwordField = new JTextField();
		passwordField.setBounds(100,160,200,30);
		
		//Login button
		loginButton = new JButton();
		loginButton.setBounds(200,200,100,30);
		//Login action listener
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Declare variables of username and password entered in username text field and password text field
				String user = usernameField.getText();
				String pass = passwordField.getText();
				//FOr each customers
				for(int index=0;index<cashier.getNumOfCustomers();index++) {
					//If user equals index customer's email, password equals index customer's password
					if(user.equals(cashier.getCustomer(index)) && pass.equals(cashier.getCustomerPassword(index))) {
						//Variable i = customer index
						i = index;
						//Dispose window
						dispose();
						//New window of order window
						OrderFrame OrderWindow = new OrderFrame(cashier, i);
						//break
						break;
					}else{
						//Set fail text visibility to true
						fail.setVisible(true);
					}
				}//Console log getAllCustomer
				cashier.getAllCustomer();
			}
	});
		loginButton.setText("Login");
		loginButton.setFocusable(false);
		
		this.setTitle("Vending Machine Simulator"); //Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Kills app on close
		this.setResizable(false); //Prevents resizing frame
		this.setSize(360,720); // x-dimension, and y-dimension of frame
		this.setLayout(null);
		this.setVisible(true); // Make frame visible
		this.add(fail);//Adds label to frame
		this.add(usernameField); //Add username text field
		this.add(passwordField); //add password text field
		this.add(username); //Add username text
		this.add(password); //Add password text
		this.add(vendingmachinelogin); //Add vending machine picture and text
		this.add(loginButton); //Add login button

		this.setIconImage(icon.getImage()); //Change icon of frame
		this.getContentPane().setBackground(new Color(242,242,242)); //Color background
	}
	
}
