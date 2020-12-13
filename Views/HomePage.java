package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener
{
	private JLabel label, adminLabel;
	private JButton loginBtn, signUpBtn, exitBtn;
	private JPanel panel;

	public HomePage()
	{
		super("CSE470 Project");
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);

//		label = new JLabel("Book Store");
//		label.setBounds(350, 10, 350, 30);
//		panel.add(label);

        label = new JLabel("Welcome to BRAC Book Store");
        label.setBounds(220, 10, 350, 30);
        panel.add(label);

		loginBtn = new JButton("Login");
		loginBtn.setBounds(80, 200, 100, 30);
		panel.add(loginBtn);
		loginBtn.addActionListener(this);

		signUpBtn = new JButton("Sign Up");
		signUpBtn.setBounds(250, 200, 100, 30);
		panel.add(signUpBtn);
		signUpBtn.addActionListener(this);


		exitBtn = new JButton("Exit");
		exitBtn.setBounds(430, 200, 80, 30);
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
