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


public class BuyBookController
{
  public static void BuyBookController(String bookName, int amount)
	{
    UserModel um = new UserModel();
		DatabaseConnection dbc = new DatabaseConnection();
    String query = "UPDATE `books` SET `amount`='"+amount+"' WHERE `bookName`='"+bookName+"';";
		try
		{
      dbc.openConnection();
			dbc.st.execute(query);


			BuyBook bb = new BuyBook();
      bb.setVisible(true);
			//this.setVisible(false);
      dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}
  }
}
