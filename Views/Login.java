package Views;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.sql.*;
import Controller.*;
import Model.*;


public class Login extends JFrame implements ActionListener
{
	private JLabel label,userNameLabel,passLabel;
	private JTextField tfld;
	private JPasswordField pfld;
	private JButton backBtn,loginBtn,exitBtn;
	private JPanel panel;

	public Login()
	{
		super("Login");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.white);

		label = new JLabel("Book Store");
		label.setBounds(350, 10, 350, 30);
		panel.add(label);

		userNameLabel = new JLabel("User Name/Id: ");
		userNameLabel.setBounds(270, 100, 100, 30);
		panel.add(userNameLabel);

		tfld = new JTextField();
		tfld.setBounds(370, 100, 100, 30);
		panel.add(tfld);

		passLabel = new JLabel("Password: ");
		passLabel.setBounds(270, 150, 100, 30);
		panel.add(passLabel);

		pfld = new JPasswordField();
		pfld.setBounds(370, 150, 100, 30);
		pfld.setEchoChar('*');
		panel.add(pfld);


		backBtn = new JButton("Back");
		backBtn.setBounds(80, 360, 100, 30);
		panel.add(backBtn);
		backBtn.addActionListener(this);

		loginBtn = new JButton("Login");
		loginBtn.setBounds(380, 360, 100, 30);
		panel.add(loginBtn);
		loginBtn.addActionListener(this);

		exitBtn = new JButton("Exit");
		exitBtn.setBounds(680, 360, 100, 30);
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
			HomePage hp = new HomePage();
			hp.setVisible(true);
			this.setVisible(false);
		}
		//For Login Button
		else if(command.equals(loginBtn.getText()))
		{
			LoginController lc = new LoginController();
			lc.loginUser(tfld.getText(), pfld.getText());
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
