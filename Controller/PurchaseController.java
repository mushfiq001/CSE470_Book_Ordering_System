package Controller;

import java.util.ArrayList;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.sql.*;
import Controller.*;
import Model.*;
import Views.*;


public class PurchaseController
{
  public int price;
  public int amount;

	public static void purchase(String bookName, int amountToPick)
	{
		UserModel um = new UserModel();
		DatabaseConnection dbc = new DatabaseConnection();
		try
		{
			dbc.openConnection();
      ResultSet rs = dbc.st.executeQuery("SELECT `price`,`amount`,`authorName`,`publishYear` FROM `books` WHERE `bookName`='"+bookName+"';");
			while(rs.next()){
        Purchase p = new Purchase(Integer.parseInt(rs.getString(1)),Integer.parseInt(rs.getString(2)),amountToPick,rs.getString(3),rs.getString(4),bookName);
  			p.setVisible(true);
  			//this.setVisible(false);
      }
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}
	}


}
