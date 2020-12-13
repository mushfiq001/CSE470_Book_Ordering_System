package Views;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.sql.*;
import Controller.*;
import Model.*;


public class BuyBook extends JFrame implements ActionListener
{
	private JLabel label,adminLabel;
	private JTextField bookName, bookAmount;
	private JButton backBtn,logOutBtn, exitBtn, buyBtn;
	private JPanel panel;
	// frame
  JFrame f;
  // Table
  JTable j;
	final Vector columnNames = new Vector();
	final Vector data = new Vector();

	public BuyBook()
	{
		super("BuyBook");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel("Book Store");
		label.setBounds(350, 10, 350, 30);
		panel.add(label);



		label = new JLabel("Book Name:");
		label.setBounds(10, 100, 100, 30);
		panel.add(label);

		bookName = new JTextField();
		bookName.setBounds(120, 100, 200, 30);
		panel.add(bookName);

		label = new JLabel("Quantity:");
		label.setBounds(10, 150, 100, 30);
		panel.add(label);

		bookAmount = new JTextField();
		bookAmount.setBounds(120, 150, 200, 30);
		panel.add(bookAmount);

		buyBtn = new JButton("Add To Cart");
		buyBtn.setBounds(200, 200, 100, 30);
		panel.add(buyBtn);
		buyBtn.addActionListener(this);
		/////////////////////////
		UserModel um = new UserModel();
		DatabaseConnection dbc = new DatabaseConnection();
		try
		{
			dbc.openConnection();
			ResultSet rs = dbc.st.executeQuery("SELECT * FROM `books`;");
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			for (int i = 1; i <= columns; i++) {
			columnNames.addElement( md.getColumnName(i) );
			}

			while (rs.next()) {
			Vector row = new Vector(columns);
			for (int i = 1; i <= columns; i++){
			row.addElement( rs.getObject(i) );
			}
			data.addElement( row );
			}
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}

   // // Data to be displayed in the JTable
	 // String data[][]={ {"101","Amit","67"},
		// 										 {"102","Jai","78"},
		// 										 {"101","Sachin","70"}};
	 // String columnNames[]={"ID","NAME","Amount"};
		// Initializing the JTable
    j = new JTable(data, columnNames);
    j.setBounds(450, 40, 200, 300);
		// adding it to JScrollPane
    JScrollPane sp = new JScrollPane(j);
    // f.add(sp);
		// Frame Size
    j.setSize(300, 200);
    // Frame Visible = true
    //f.setVisible(true);
		panel.add(j);
		panel.add(sp);
		///////////////////////////
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
			//For Back Button
			if(command.equals(backBtn.getText()))
			{
				Login lg = new Login();
				lg.setVisible(true);
				this.setVisible(false);
			}
			//For 'Add To Cart' Button
			else if(command.equals(buyBtn.getText()))
			{
				PurchaseController pc = new PurchaseController();
				pc.purchase(bookName.getText(), Integer.parseInt(bookAmount.getText()));
				this.setVisible(false);
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
