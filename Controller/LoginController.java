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
			if(password.equals(rs.getString(1))){
				if(userName.equals("admin"))
				{
					AdminPanel ap = new AdminPanel();
					ap.setVisible(true);
				}
				else
				{
				BuyBook bb = new BuyBook();
				bb.setVisible(true);
				}
			}
			else
			{
				Login lg = new Login();
				lg.setVisible(true);
			}
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}

	}
}
