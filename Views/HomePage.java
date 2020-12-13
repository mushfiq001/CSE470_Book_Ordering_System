package Views;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HomePage extends JFrame implements ActionListener
{
	private JLabel label, adminLabel;
	private JButton loginBtn, signUpBtn, exitBtn;
	private JPanel panel;

	public HomePage()
	{
		super("HomePage");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel("Book Store");
		label.setBounds(350, 10, 350, 30);
		panel.add(label);

		loginBtn = new JButton("Login");
		loginBtn.setBounds(80, 360, 100, 30);
		panel.add(loginBtn);
		loginBtn.addActionListener(this);

		signUpBtn = new JButton("Sign Up");
		signUpBtn.setBounds(350, 360, 100, 30);
		panel.add(signUpBtn);
		signUpBtn.addActionListener(this);


		exitBtn = new JButton("Exit");
		exitBtn.setBounds(680, 360, 80, 30);
		panel.add(exitBtn);
		exitBtn.addActionListener(this);



		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae)
		{
			String command = ae.getActionCommand();

			if(command.equals(loginBtn.getText()))
			{
				Login lg = new Login();
				lg.setVisible(true);
				this.setVisible(false);
			}
			else if(command.equals(signUpBtn.getText()))
			{
				SignUp su = new SignUp();
				su.setVisible(true);
				this.setVisible(false);
			}
			else if(command.equals(exitBtn.getText()))
			{
				System.exit(0);
			}
			else{}
		}

}
