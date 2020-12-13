package Views;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.sql.*;
import Controller.*;
import Model.*;


public class SignUp extends JFrame implements ActionListener
{
	private JLabel label,fullNameLabel,userNameLabel,passLabel;
	private JTextField tfld,fntf;
	private JPasswordField pfld;
	private JButton backBtn,exitBtn,registerBtn;
	private JPanel panel;

	public SignUp()
	{
		super("SignUp");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel("BRAC Library");
		label.setBounds(350, 10, 350, 30);
		panel.add(label);

		fullNameLabel = new JLabel("Full Name: ");
		fullNameLabel.setBounds(270, 50, 100, 30);
		panel.add(fullNameLabel);

		fntf = new JTextField();
		fntf.setBounds(370, 50, 100, 30);
		panel.add(fntf);

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

		registerBtn = new JButton("Register");
		registerBtn.setBounds(500, 190, 100, 30);
		panel.add(registerBtn);
		registerBtn.addActionListener(this);

		backBtn = new JButton("Back");
		backBtn.setBounds(80, 360, 100, 30);
		panel.add(backBtn);
		backBtn.addActionListener(this);

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
		//For Register Button
		else if (command.equals(registerBtn.getText()))
		{
			UserController uc = new UserController();
			uc.registerUser(fntf.getText(), tfld.getText(), pfld.getText());
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
