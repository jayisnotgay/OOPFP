package GUI;

import Main.Cashier;

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
import javax.swing.border.Border;

public class ReceiptFrame extends JFrame {
	
	JButton backButton;
	
	ReceiptFrame(Cashier cashier, int i){
		
		//Declare image icons
		ImageIcon icon = new ImageIcon("icon.png");
		ImageIcon back = new ImageIcon("back.png");
		ImageIcon coke = new ImageIcon("coke.png");
		ImageIcon sprite = new ImageIcon("sprite.png");
		ImageIcon pepsi = new ImageIcon("pepsi.png");
		ImageIcon latte = new ImageIcon("latte.png");
		
		//Set border
		Border border = BorderFactory.createLineBorder(Color.GRAY,3);
		
		//Coke receipt picture and text label
		JLabel cokeLabel = new JLabel();
		//Visibility false
		cokeLabel.setVisible(false);
		//If previous coke orders (receipt) is more than one
		if(cashier.getNumOfPrevCokeOrder(i)>0) {
			//Visiblity true
			cokeLabel.setVisible(true);
		}
		//Set text number of previous coke order 
		cokeLabel.setText("Coca-Cola "+cashier.getNumOfPrevCokeOrder(i)+"x");
		//Set icon coke
		cokeLabel.setIcon(coke);
		cokeLabel.setHorizontalTextPosition(JLabel.CENTER);
		cokeLabel.setVerticalTextPosition(JLabel.BOTTOM);
		cokeLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		cokeLabel.setIconTextGap(0);
		cokeLabel.setBorder(border);
		cokeLabel.setVerticalAlignment(JLabel.TOP);
		cokeLabel.setHorizontalAlignment(JLabel.CENTER);
		cokeLabel.setBounds(15, 45, 150, 150);
		
		//Sprite receipt picture and text label
		JLabel spriteLabel = new JLabel();
		//Visibility false
		spriteLabel.setVisible(false);
		//If previous sprite orders (receipt) is more than one
		if(cashier.getNumOfPrevSpriteOrder(i)>0) {
			//Visiblity true
			spriteLabel.setVisible(true);
		}
		//Set text number of previous sprite order 
		spriteLabel.setText("Sprite "+cashier.getNumOfPrevSpriteOrder(i)+"x");
		//Set icon sprite
		spriteLabel.setIcon(sprite);
		spriteLabel.setHorizontalTextPosition(JLabel.CENTER);
		spriteLabel.setVerticalTextPosition(JLabel.BOTTOM);
		spriteLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		spriteLabel.setIconTextGap(0);
		spriteLabel.setBorder(border);
		spriteLabel.setVerticalAlignment(JLabel.TOP);
		spriteLabel.setHorizontalAlignment(JLabel.CENTER);
		spriteLabel.setBounds(180, 45, 150, 150);
		
		//Pepsi receipt picture and text label
		JLabel pepsiLabel = new JLabel();
		//Visibility false
		pepsiLabel.setVisible(false);
		//If previous pepsi orders (receipt) is more than one
		if(cashier.getNumOfPrevPepsiOrder(i)>0) {
			//Visiblity true
			pepsiLabel.setVisible(true);
		}
		//Set text number of previous pepsi order 
		pepsiLabel.setText("Pepsi "+cashier.getNumOfPrevPepsiOrder(i)+"x");
		//Set icon pepsi
		pepsiLabel.setIcon(pepsi);
		pepsiLabel.setHorizontalTextPosition(JLabel.CENTER);
		pepsiLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pepsiLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		pepsiLabel.setIconTextGap(0);
		pepsiLabel.setBorder(border);
		pepsiLabel.setVerticalAlignment(JLabel.TOP);
		pepsiLabel.setHorizontalAlignment(JLabel.CENTER);
		pepsiLabel.setBounds(15, 300, 150, 150);
		
		//Latte receipt picture and text label
		JLabel latteLabel = new JLabel();
		//Visibility false
		latteLabel.setVisible(false);
		//If previous latte orders (receipt) is more than one
		if(cashier.getNumOfPrevLatteOrder(i)>0) {
			//Visiblity true
			latteLabel.setVisible(true);
		}
		//Set text number of previous latte order 
		latteLabel.setText("Latte "+cashier.getNumOfPrevLatteOrder(i)+"x");
		//Set icon latte
		latteLabel.setIcon(latte);
		latteLabel.setHorizontalTextPosition(JLabel.CENTER);
		latteLabel.setVerticalTextPosition(JLabel.BOTTOM);
		latteLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		latteLabel.setIconTextGap(0);
		latteLabel.setBorder(border);
		latteLabel.setVerticalAlignment(JLabel.TOP);
		latteLabel.setHorizontalAlignment(JLabel.CENTER);
		latteLabel.setBounds(180, 300, 150, 150);
		
		//allOrderReceipt text
		JLabel allOrderReceipt = new JLabel();
		//Set text number of all previous order
		allOrderReceipt.setText("Orders       : "+valueOf(cashier.getNumOfPrevOrder(i)));
		allOrderReceipt.setBounds(15,450,250,25);
		allOrderReceipt.setVerticalAlignment(JLabel.CENTER);
		allOrderReceipt.setHorizontalAlignment(JLabel.LEFT);
		
		//totalPriceReceipt text
		JLabel totalPriceReceipt = new JLabel();
		//Set text price of all previous order
		totalPriceReceipt.setText("Total price : $"+valueOf(cashier.getTotalPrevPrice(i)));
		totalPriceReceipt.setBounds(15,475,250,25);
		totalPriceReceipt.setVerticalAlignment(JLabel.CENTER);
		totalPriceReceipt.setHorizontalAlignment(JLabel.LEFT);
		
		//totalBalance text
		JLabel balance = new JLabel();
		//Set text customer's balance
		balance.setText("Balance     : $"+valueOf(cashier.getCustomerBalance(i)));
		balance.setBounds(15,500,250,25);
		balance.setVerticalAlignment(JLabel.CENTER);
		balance.setHorizontalAlignment(JLabel.LEFT);
		
		//success text
		JLabel success = new JLabel();
		//Set text success
		success.setText("Success! You will receive: ");
		success.setBounds(15,15,250,30);
		success.setVerticalAlignment(JLabel.CENTER);
		success.setHorizontalAlignment(JLabel.LEFT);
		
		//back Button
		backButton = new JButton();
		backButton.setBounds(55,650,250,30);
		//backButton action listener
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//If success = true
				if(cashier.Success(i)) {
					//Dispose window
					dispose();
					//New order window
					OrderFrame orderWindow = new OrderFrame(cashier, i);
					//System.out.println(cashier.getNumOfOrder(0));
				}
			}
		});
		//Set text
		backButton.setText("Back to mainpage");
		//Set icon
		backButton.setIcon(back);
		backButton.setFocusable(false);
		
		this.setTitle("Vending Machine Simulator"); //Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Kills app on close
		this.setResizable(false); //Prevents resizing frame
		this.setSize(360,720); // x-dimension, and y-dimension of frame
		this.setLayout(null);
		this.setVisible(true); // Make frame visible
		this.add(success);
		this.add(cokeLabel);
		this.add(spriteLabel);
		this.add(pepsiLabel);
		this.add(latteLabel);
		this.add(allOrderReceipt);
		this.add(totalPriceReceipt);
		this.add(balance);
		this.add(backButton);

		this.setIconImage(icon.getImage()); //Change icon of frame
		this.getContentPane().setBackground(new Color(242,242,242)); //Color background
	}
}
