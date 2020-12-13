package Model;

import java.lang.*;

public class BookModel
{
	private String bookName;
	private String authorName;
	private String publishYear;
	private int price;
	private int amount;


	public BookModel(){}

	//Set Methods
	public void setBookName(String bookName){this.bookName = bookName;}
	public void setAuthorName(String authorName){this.authorName = authorName;}
	public void setPublishYear(String publishYear){this.publishYear = publishYear;}
	public void setPrice(int price){this.price = price;}
	public void setAmount(int amount){this.amount = amount;}
	//Get Methods
	public String getBookName() {return bookName;}
	public String getAuthorName() {return authorName;}
	public String getPublishYear() {return publishYear;}
	public int getPrice() {return price;}
	public int getAmount() {return amount;}

}
