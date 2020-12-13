package Views;

import Controller.BuyBookController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Purchase extends JFrame implements ActionListener
{
	private String bookName;
	private String authorName;
	private String publishYear;
	private int price;
	private int dbAmount;
	private int amount;

	private JLabel label,adminLabel;
	private JTextField cardField, addressField, expiryField, cvv;
	private JButton backBtn,logOutBtn, exitBtn, purchaseBtn;
	private JPanel panel;

	public Purchase(int price,int dbAmount, int amount, String authorName, String publishYear, String bookName)
	{
		super("Purchase");
		this.setSize(800,450);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.bookName = bookName;
		this.authorName = authorName;
		this.publishYear = publishYear;
		this.price = price;
		this.amount = amount;
		this.dbAmount = dbAmount;

		panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel("Book Store");
		label.setBounds(350, 10, 350, 30);
		panel.add(label);

		label = new JLabel(bookName);
		label.setBounds(200, 80, 350, 30);
		panel.add(label);
		label = new JLabel(authorName);
		label.setBounds(200, 110, 350, 30);
		panel.add(label);
		label = new JLabel(publishYear);
		label.setBounds(200, 140, 350, 30);
		panel.add(label);
		label = new JLabel(Integer.toString(price*amount)+"TK. in total");
		label.setBounds(200, 170, 350, 30);
		panel.add(label);

		//No Functional Fileds start
		label = new JLabel("Credit Cart Number");
		label.setBounds(400, 80, 350, 30);
		panel.add(label);

		cardField = new JTextField();
		cardField.setBounds(530, 80, 100, 30);
		panel.add(cardField);

		label = new JLabel("Expiry date");
		label.setBounds(400,110,100,30);
		panel.add(label);

		expiryField = new JTextField();
		expiryField.setBounds(530,110,100,30);
		panel.add(expiryField);

		label = new JLabel("CVV");
		label.setBounds(640,110,100,30);
		panel.add(label);

		cvv = new JTextField();
		cvv.setBounds(680,110,100,30);
		panel.add(cvv);

		label = new JLabel("Delivery Address");
		label.setBounds(400, 150, 350, 30);
		panel.add(label);

		addressField = new JTextField();
		addressField.setBounds(530, 150, 100, 30);
		panel.add(addressField);
		//No Functional Fileds End

		purchaseBtn = new JButton("Purchase");
		purchaseBtn.setBounds(500, 270, 100, 30);
		panel.add(purchaseBtn);
		purchaseBtn.addActionListener(this);

		backBtn = new JButton("Back");
		backBtn.setBounds(80, 360, 100, 30);
		panel.add(backBtn);
		backBtn.addActionListener(this);

		logOutBtn = new JButton("LogOut");
		logOutBtn.setBounds(380, 360, 100, 30);
		panel.add(logOutBtn);
		logOutBtn.addActionListener(this);


		exitBtn = new JButton("Exit");
		exitBtn.setBounds(680, 360, 80, 30);
		panel.add(exitBtn);
		exitBtn.addActionListener(this);



		this.add(panel);
	}



		public void actionPerformed(ActionEvent ae)
		{
			String command = ae.getActionCommand();
			//For Purchase Button
			if(command.equals(purchaseBtn.getText()))
			{
				BuyBookController bbc = new BuyBookController();
				bbc.BuyBookController(bookName,(dbAmount-amount));
				// System.out.println(dbAmount);
				// System.out.println(amount);
				this.setVisible(false);
			}
			//For Back Button
			if(command.equals(backBtn.getText()))
			{
				BuyBook bb = new BuyBook();
				bb.setVisible(true);
				//this.setVisible(false);
			}
			//For Logout Button
			else if(command.equals(logOutBtn.getText()))
			{
				Login lg = new Login();
				lg.setVisible(true);
				this.setVisible(false);
			}
			//For Exit Button
			else if(command.equals(exitBtn.getText()))
			{
				System.exit(0);
			}
			else{}
		}

}
