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


public class UserController
{
	public void registerUser(String fullName, String userName, String password)
	{
		UserModel um = new UserModel();
		DatabaseConnection dbc = new DatabaseConnection();

		String query = "INSERT INTO `users`(`fullName`, `userName`, `password`) VALUES ('"+fullName+"', '"+userName+"', '"+password+"');";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();

			//JOptionPane.showMessageDialog(this, "Sign Up Successful");

			HomePage abf = new HomePage();
			abf.setVisible(true);
			//this.setVisible(false);
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
