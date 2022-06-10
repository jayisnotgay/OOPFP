package GUI;

import Main.Cashier;

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
import static java.lang.String.valueOf;

public class OrderFrame extends JFrame {
	
	//Declare buttons object
	JButton addCoke;
	JButton deleteCoke;
	JButton addSprite;
	JButton deleteSprite;
	JButton addPepsi;
	JButton deletePepsi;
	JButton addLatte;
	JButton deleteLatte;
	JButton checkOutPageButton;
	JButton profileButton;
	JButton logOutButton;
	
	OrderFrame(Cashier cashier, int i){
		
		//Image icons
		ImageIcon icon = new ImageIcon("icon.png"); //Image icon
		ImageIcon add = new ImageIcon("add.png");
		ImageIcon delete = new ImageIcon("minus.png");
		ImageIcon back = new ImageIcon("back.png");
		ImageIcon profile = new ImageIcon("profile.png");
		ImageIcon coke = new ImageIcon("coke.png");
		ImageIcon sprite = new ImageIcon("sprite.png");
		ImageIcon pepsi = new ImageIcon("pepsi.png");
		ImageIcon latte = new ImageIcon("latte.png");
		
		//Set border
		Border border = BorderFactory.createLineBorder(Color.GRAY,3);
		
		//Coke picture, text, and border
		JLabel cokeLabel = new JLabel(); //Creates a label
		cokeLabel.setText("Coca-Cola"); //Sets the text
		cokeLabel.setIcon(coke); //Sets image
		cokeLabel.setHorizontalTextPosition(JLabel.CENTER);
		cokeLabel.setVerticalTextPosition(JLabel.BOTTOM);
		cokeLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		cokeLabel.setIconTextGap(0);
		cokeLabel.setBorder(border); //Sets border
		cokeLabel.setVerticalAlignment(JLabel.TOP);
		cokeLabel.setHorizontalAlignment(JLabel.CENTER);
		cokeLabel.setBounds(15, 45, 150, 150);
		
		//sprite picture, text, and border
		JLabel spriteLabel = new JLabel(); //Creates a label
		spriteLabel.setText("Sprite"); //Sets the text
		spriteLabel.setIcon(sprite); //Sets image
		spriteLabel.setHorizontalTextPosition(JLabel.CENTER);
		spriteLabel.setVerticalTextPosition(JLabel.BOTTOM);
		spriteLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		spriteLabel.setIconTextGap(0);
		spriteLabel.setBorder(border); //Sets border
		spriteLabel.setVerticalAlignment(JLabel.TOP);
		spriteLabel.setHorizontalAlignment(JLabel.CENTER);
		spriteLabel.setBounds(180, 45, 150, 150);
		
		//Pepsi picture, text, and border
		JLabel pepsiLabel = new JLabel(); //Creates a label
		pepsiLabel.setText("Pepsi"); //Sets the text
		pepsiLabel.setIcon(pepsi); //Sets image
		pepsiLabel.setHorizontalTextPosition(JLabel.CENTER);
		pepsiLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pepsiLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		pepsiLabel.setIconTextGap(0);
		pepsiLabel.setBorder(border); //Sets border
		pepsiLabel.setVerticalAlignment(JLabel.TOP);
		pepsiLabel.setHorizontalAlignment(JLabel.CENTER);
		pepsiLabel.setBounds(15, 300, 150, 150);
		
		//Latte picture, text, and border
		JLabel latteLabel = new JLabel(); //Creates a label
		latteLabel.setText("Latte"); //Sets the text
		latteLabel.setIcon(latte); //Sets image
		latteLabel.setHorizontalTextPosition(JLabel.CENTER);
		latteLabel.setVerticalTextPosition(JLabel.BOTTOM);
		latteLabel.setFont(new Font("Lucida Sans",Font.BOLD,12));
		latteLabel.setIconTextGap(0);
		latteLabel.setBorder(border); //Sets border
		latteLabel.setVerticalAlignment(JLabel.TOP);
		latteLabel.setHorizontalAlignment(JLabel.CENTER);
		latteLabel.setBounds(180, 300, 150, 150);
		
		//Number of Coke order text
		JLabel cokeTotal = new JLabel();
		//Set text to number of coke orders
		cokeTotal.setText(valueOf(cashier.getNumOfCokeOrder(i)));
		cokeTotal.setBounds(85,210,30,30);
		
		//Number of Sprite order text
		JLabel spriteTotal = new JLabel();
		//Set text to number of sprite orders
		spriteTotal.setText(valueOf(cashier.getNumOfSpriteOrder(i)));
		spriteTotal.setBounds(250,210,30,30);
		
		//Number of Pepsi order text
		JLabel pepsiTotal = new JLabel();
		//Set text to number of pepsi orders
		pepsiTotal.setText(valueOf(cashier.getNumOfPepsiOrder(i)));
		pepsiTotal.setBounds(85,470,30,30);
		
		//Number of Latte order text
		JLabel latteTotal = new JLabel();
		//Set text to number of latte orders
		latteTotal.setText(valueOf(cashier.getNumOfLatteOrder(i)));
		latteTotal.setBounds(250,470,30,30);
		
		//Checkout page button
		checkOutPageButton = new JButton();
		checkOutPageButton.setBounds(105,650,150,30);
		//Checkout button listener
		checkOutPageButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//If number of orders more than 0
				if(cashier.getNumOfOrder(i)>0) {
					//Disposes window
					dispose();
					//New Checkout window
					CheckOutFrame checkOutWindow = new CheckOutFrame(cashier, i);
					//Console log number of orders
					System.out.println(cashier.getNumOfOrder(i));
				}
			}
		});
		//Set text to number of orders
		checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
		checkOutPageButton.setFocusable(false);
		
		//Coke add order button
		addCoke = new JButton();
		addCoke.setBounds(120,210,30,30);
		//AddCoke button action listener
		addCoke.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Set order coke
				cashier.setOrderCoke(i);
				//Refresh cokeTotal text
				cokeTotal.setText(valueOf(cashier.getNumOfCokeOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to add
		addCoke.setIcon(add);
		addCoke.setFocusable(false);
		
		//Coke delete order button
		deleteCoke = new JButton();
		deleteCoke.setBounds(30,210,30,30);
		//deleteCoke button action listener
		deleteCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Remove order coke
				cashier.removeOrderCoke(i);
				//Refresh cokeTotal text
				cokeTotal.setText(valueOf(cashier.getNumOfCokeOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to delete
		deleteCoke.setIcon(delete);
		deleteCoke.setFocusable(false);
		
		//Sprite add order button
		addSprite = new JButton();
		addSprite.setBounds(285,210,30,30);
		//addSprite button action listener
		addSprite.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Set order sprite
				cashier.setOrderSprite(i);
				//Refresh spriteTotal text
				spriteTotal.setText(valueOf(cashier.getNumOfSpriteOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to add
		addSprite.setIcon(add);
		addSprite.setFocusable(false);
		
		//Sprite delete order button
		deleteSprite = new JButton();
		deleteSprite.setBounds(195,210,30,30);
		//deleteSPrite action listener
		deleteSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Remove order sprite
				cashier.removeOrderSprite(i);
				//Refresh spriteTotal text
				spriteTotal.setText(valueOf(cashier.getNumOfSpriteOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to delete
		deleteSprite.setIcon(delete);
		deleteSprite.setFocusable(false);
		
		//Pepsi add order button
		addPepsi = new JButton();
		addPepsi.setBounds(120,470,30,30);
		//addPepsi action listener
		addPepsi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Add order pepsi
				cashier.setOrderPepsi(i);
				//Refresh pepsiTotal text
				pepsiTotal.setText(valueOf(cashier.getNumOfPepsiOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to add
		addPepsi.setIcon(add);
		addPepsi.setFocusable(false);
		
		//Pepsi delete order button
		deletePepsi = new JButton();
		deletePepsi.setBounds(30,470,30,30);
		//deletePepsi action listener
		deletePepsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Remove order pepsi
				cashier.removeOrderPepsi(i);
				//Refresh pepsiTotal text
				pepsiTotal.setText(valueOf(cashier.getNumOfPepsiOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to delete
		deletePepsi.setIcon(delete);
		deletePepsi.setFocusable(false);
		
		
		//Latte add order button
		addLatte = new JButton();
		addLatte.setBounds(285,470,30,30);
		//addLatte action listener
		addLatte.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Set order latte
				cashier.setOrderLatte(i);
				//Refresh latteTotal text
				latteTotal.setText(valueOf(cashier.getNumOfLatteOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		//Set icon to add
		addLatte.setIcon(add);
		addLatte.setFocusable(false);
		
		//Latte delete order button
		deleteLatte = new JButton();
		deleteLatte.setBounds(195,470,30,30);
		//deleteLatte action listener
		deleteLatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Remove order latte
				cashier.removeOrderLatte(i);
				//Refresh latteTotal text
				latteTotal.setText(valueOf(cashier.getNumOfLatteOrder(i)));
				//Refresh checkoutPageButton text
				checkOutPageButton.setText("Cart "+"("+cashier.getNumOfOrder(i)+")");
				//Console log get number of order
				System.out.println(cashier.getNumOfOrder(i));
			}
		});
		deleteLatte.setIcon(delete);
		deleteLatte.setFocusable(false);
		
		//Profile page button
		profileButton = new JButton();
		profileButton.setBounds(300,12,30,30);
		//profileButton action listener
		profileButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Dispose window
				dispose();
				//New profile window
				ProfileFrame profileWindow = new ProfileFrame(cashier, i);

			}
		});
		//Set icon to profile
		profileButton.setIcon(profile);
		profileButton.setFocusable(false);
		
		//Login page button
		logOutButton = new JButton();
		logOutButton.setBounds(15,12,30,30);
		//logOutButton action listener
		logOutButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//Dispose window
				dispose();
				//New login window
				LoginFrame loginWindow = new LoginFrame(cashier);

			}
		});
		//Set icon to back
		logOutButton.setIcon(back);
		logOutButton.setFocusable(false);
		
		//Frame set up
		this.setTitle("Vending Machine Simulator"); //Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Kills app on close
		this.setResizable(false); //Prevents resizing frame
		this.setSize(360,720); // x-dimension, and y-dimension of frame
		this.setLayout(null);
		this.setVisible(true); // Make frame visible
		this.add(cokeLabel);//Adds label to frame
		this.add(spriteLabel);
		this.add(pepsiLabel);
		this.add(latteLabel);
		this.add(cokeTotal);
		this.add(spriteTotal);
		this.add(pepsiTotal);
		this.add(latteTotal);
		this.add(addCoke);
		this.add(deleteCoke);
		this.add(addSprite);
		this.add(deleteSprite);
		this.add(addPepsi);
		this.add(deletePepsi);
		this.add(addLatte);
		this.add(deleteLatte);
		this.add(checkOutPageButton);
		this.add(profileButton);
		this.add(logOutButton);
		
		this.setIconImage(icon.getImage()); //Change icon of frame
		this.getContentPane().setBackground(new Color(242,242,242)); //Color background
	}
}
