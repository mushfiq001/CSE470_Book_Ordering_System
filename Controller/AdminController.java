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

public class AdminController
{
	public static void add(BookModel bookObject)
	{
		DatabaseConnection dbc = new DatabaseConnection();
		try
		{
      String query = "INSERT INTO `books` (`bookName`, `authorName`, `publishYear`, `price`, `amount`) VALUES ('"+bookObject.getBookName()+"','"+bookObject.getAuthorName()+"','"+bookObject.getPublishYear()+"','"+bookObject.getPrice()+"','"+bookObject.getAmount()+"');";
      dbc.openConnection();
      dbc.st.execute(query);
      dbc.closeConnection();

      AdminPanel ap = new AdminPanel();
      ap.setVisible(true);
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}
	}
  //Update Method
  public static void update(BookModel bookObject, int id)
	{
		DatabaseConnection dbc = new DatabaseConnection();
		try
		{
      String query = "UPDATE `books` SET `bookName`='"+bookObject.getBookName()+"',`authorName`='"+bookObject.getAuthorName()+"',`publishYear`='"+bookObject.getPublishYear()+"',`price`='"+bookObject.getPrice()+"',`amount`='"+bookObject.getAmount()+"' WHERE `id`='"+id+"'";
      dbc.openConnection();
      dbc.st.execute(query);
      dbc.closeConnection();

      AdminPanel ap = new AdminPanel();
      ap.setVisible(true);
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}
	}
  //Delete Method
  public static void delete(int id)
	{
		DatabaseConnection dbc = new DatabaseConnection();
		try
		{
      String query = "DELETE FROM `books` WHERE `id`='"+id+"'";
      dbc.openConnection();
      dbc.st.execute(query);
      dbc.closeConnection();

      AdminPanel ap = new AdminPanel();
      ap.setVisible(true);
		}
		catch(Exception ex){System.out.println(ex.getMessage());

		}
	}


}
