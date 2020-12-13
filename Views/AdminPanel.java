package Views;

import Controller.AdminController;
import Model.BookModel;
import Model.DatabaseConnection;
import Model.UserModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;


public class AdminPanel extends JFrame implements ActionListener
{
	private JLabel label;
	private JTextField bookId, bookName, authorName, publishYear, price, amount;
	private JButton backBtn,logOutBtn, exitBtn, addBtn, updateBtn, deleteBtn;
	private JPanel panel;
	// frame
  JFrame f;
  // Table
  JTable j;
	final Vector columnNames = new Vector();
	final Vector data = new Vector();

	public AdminPanel()
	{
		super("AdminPanel");
		this.setSize(800,450);
        this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel("Book Store");
		label.setBounds(350, 10, 350, 30);
		panel.add(label);

		label = new JLabel("Name");
		label.setBounds(500, 10, 350, 30);
		panel.add(label);

		label = new JLabel("Author");
		label.setBounds(550, 10, 350, 30);
		panel.add(label);

		label = new JLabel("Year");
		label.setBounds(600, 10, 350, 30);
		panel.add(label);

		label = new JLabel("Price");
		label.setBounds(650, 10, 350, 30);
		panel.add(label);

		label = new JLabel("Quantity");
		label.setBounds(700, 10, 350, 30);
		panel.add(label);


		//Book Id
		label = new JLabel("Book Id:");
		label.setBounds(10, 50, 100, 30);
		panel.add(label);

		bookId = new JTextField();
		bookId.setBounds(120, 50, 200, 30);
		panel.add(bookId);

		//Book Name
		label = new JLabel("Book Name:");
		label.setBounds(10, 90, 100, 30);
		panel.add(label);

		bookName = new JTextField();
		bookName.setBounds(120, 90, 200, 30);
		panel.add(bookName);

		//Author Name
		label = new JLabel("Author Name:");
		label.setBounds(10, 130, 100, 30);
		panel.add(label);

		authorName = new JTextField();
		authorName.setBounds(120, 130, 200, 30);
		panel.add(authorName);

		//Book Publish Year
		label = new JLabel("Publish Year:");
		label.setBounds(10, 170, 100, 30);
		panel.add(label);

		publishYear = new JTextField();
		publishYear.setBounds(120, 170, 200, 30);
		panel.add(publishYear);

		//Book Price
		label = new JLabel("Book Price:");
		label.setBounds(10, 210, 100, 30);
		panel.add(label);

		price = new JTextField();
		price.setBounds(120, 210, 200, 30);
		panel.add(price);

		//Book Amount
		label = new JLabel("Book Amount:");
		label.setBounds(10, 250, 100, 30);
		panel.add(label);

		amount = new JTextField();
		amount.setBounds(120, 250, 200, 30);
		panel.add(amount);


		//Add Button
		addBtn = new JButton("Add");
		addBtn.setBounds(340, 50, 80, 30);
		panel.add(addBtn);
		addBtn.addActionListener(this);
		//Update Button
		updateBtn = new JButton("Update");
		updateBtn.setBounds(340, 100, 80, 30);
		panel.add(updateBtn);
		updateBtn.addActionListener(this);
		//Delete Button
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(340, 150, 80, 30);
		panel.add(deleteBtn);
		deleteBtn.addActionListener(this);

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
	//Action Performed Method
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
		//For 'Add' Button
		else if(command.equals(addBtn.getText()))
		{
			if(bookName.getText().length() == 0){
				//errorText.append("bookName is mandatory\n");
				bookName.setBackground(Color.red);
			}
			if(authorName.getText().length() == 0){
				authorName.setBackground(Color.red);
			}
			if(publishYear.getText().length() == 0){
				publishYear.setBackground(Color.red);
			}
			if(price.getText().length() == 0){
				price.setBackground(Color.red);
			}
			if(amount.getText().length() == 0){
				amount.setBackground(Color.red);
			}
			else{
			BookModel bm = new BookModel();
			bm.setBookName(bookName.getText());
			bm.setAuthorName(authorName.getText());
			bm.setPublishYear(publishYear.getText());
			bm.setPrice(Integer.parseInt(price.getText()));
			bm.setAmount(Integer.parseInt(amount.getText()));

			AdminController ac = new AdminController();
			ac.add(bm);
			this.setVisible(false);
			}
		}
		//For 'Update' Button
		else if(command.equals(updateBtn.getText()))
		{
			if(bookId.getText().length() == 0){
				bookId.setBackground(Color.red);
			}
			if(bookName.getText().length() == 0){
				//errorText.append("bookName is mandatory\n");
				bookName.setBackground(Color.red);
			}
			if(authorName.getText().length() == 0){
				authorName.setBackground(Color.red);
			}
			if(publishYear.getText().length() == 0){
				publishYear.setBackground(Color.red);
			}
			if(price.getText().length() == 0){
				price.setBackground(Color.red);
			}
			if(amount.getText().length() == 0){
				amount.setBackground(Color.red);
			}
			else{
			BookModel bm = new BookModel();
			bm.setBookName(bookName.getText());
			bm.setAuthorName(authorName.getText());
			bm.setPublishYear(publishYear.getText());
			bm.setPrice(Integer.parseInt(price.getText()));
			bm.setAmount(Integer.parseInt(amount.getText()));

			AdminController ac = new AdminController();
			ac.update(bm, Integer.parseInt(bookId.getText()));
			this.setVisible(false);
			}
		}
		//For 'Delete' Button
		else if(command.equals(deleteBtn.getText()))
		{
			if(bookId.getText().length() == 0){
				bookId.setBackground(Color.red);
			}
			else{
			AdminController ac = new AdminController();
			ac.delete(Integer.parseInt(bookId.getText()));
			this.setVisible(false);
			}
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
