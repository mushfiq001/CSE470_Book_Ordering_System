package Controller;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.sql.*;
import Controller.*;
import Model.*;
import Views.*;


public class LoginController
{
	public void loginUser(String userName, String password)
	{

		UserModel um = new UserModel();
		DatabaseConnection dbc = new DatabaseConnection();
		try
		{
			dbc.openConnection();
      ResultSet rs = dbc.st.executeQuery("SELECT `password` FROM `users` WHERE `userName`='"+userName+"';");
			while(rs.next())
      //System.out.println(rs.getString(1));
      if(password.equals(rs.getString(1))){
        BuyBook bb = new BuyBook();
				bb.setVisible(true);
				//this.setVisible(false);
      }else{
        Login lg = new Login();
  			lg.setVisible(true);
  			//this.setVisible(false);
      }
			//JOptionPane.showMessageDialog(this, "Sign Up Successful");

			// HomePage abf = new HomePage();
			// abf.setVisible(true);
			// //this.setVisible(false);
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}
		// JOptionPane.showMessageDialog(this, "Sign Up Successful");
		//
		// HomePage abf = new HomePage();
		// abf.setVisible(true);
		// this.setVisible(false);

	}
}
