package cn.edu.nsu.predom.db.book;

import java.util.ArrayList;

import cn.edu.nsu.predom.db.bookType.BookType;
import cn.edu.nsu.predom.db.comment.Comment;

public class Book
{
	private int book_id;
	private int bookType_id;
	private String book_ISBN;
	private String book_name;
	private String book_author;
	private String book_press;
	private float book_price;
	private String book_picture;
	private String book_inDate;

	private BookType bookType;
	private ArrayList<Comment> comments;
	/**
	 * @return the book_id
	 */
	public int getBook_id()
	{
		return book_id;
	}
	/**
	 * @param book_id the book_id to set
	 */
	public void setBook_id(int book_id)
	{
		this.book_id = book_id;
	}
	/**
	 * @return the bookType_id
	 */
	public int getBookType_id()
	{
		return bookType_id;
	}
	/**
	 * @param bookType_id the bookType_id to set
	 */
	public void setBookType_id(int bookType_id)
	{
		this.bookType_id = bookType_id;
	}
	/**
	 * @return the book_ISBN
	 */
	public String getBook_ISBN()
	{
		return book_ISBN;
	}
	/**
	 * @param book_ISBN the book_ISBN to set
	 */
	public void setBook_ISBN(String book_ISBN)
	{
		this.book_ISBN = book_ISBN;
	}
	/**
	 * @return the book_name
	 */
	public String getBook_name()
	{
		return book_name;
	}
	/**
	 * @param book_name the book_name to set
	 */
	public void setBook_name(String book_name)
	{
		this.book_name = book_name;
	}
	/**
	 * @return the book_author
	 */
	public String getBook_author()
	{
		return book_author;
	}
	/**
	 * @param book_author the book_author to set
	 */
	public void setBook_author(String book_author)
	{
		this.book_author = book_author;
	}
	/**
	 * @return the book_press
	 */
	public String getBook_press()
	{
		return book_press;
	}
	/**
	 * @param book_press the book_press to set
	 */
	public void setBook_press(String book_press)
	{
		this.book_press = book_press;
	}
	/**
	 * @return the book_price
	 */
	public float getBook_price()
	{
		return book_price;
	}
	/**
	 * @param book_price the book_price to set
	 */
	public void setBook_price(float book_price)
	{
		this.book_price = book_price;
	}
	/**
	 * @return the book_picture
	 */
	public String getBook_picture()
	{
		return book_picture;
	}
	/**
	 * @param book_picture the book_picture to set
	 */
	public void setBook_picture(String book_picture)
	{
		this.book_picture = book_picture;
	}
	public String toString()
	{
		// TODO Auto-generated method stub
		return book_id+"\t"+bookType_id+"\t"+book_ISBN+"\t"+book_name+"\t"+book_author+"\t"+book_press+"\t"+book_price+"\t"+book_picture;
	}
	/**
	 * @return the bookType
	 */
	public BookType getBookType()
	{
		return bookType;
	}
	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(BookType bookType)
	{
		this.bookType = bookType;
	}
	/**
	 * @return the comments
	 */
	public ArrayList<Comment> getComments()
	{
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(ArrayList<Comment> comments)
	{
		this.comments = comments;
	}
	/**
	 * @return the book_inDate
	 */
	public String getBook_inDate() {
		return book_inDate;
	}
	/**
	 * @param book_inDate the book_inDate to set
	 */
	public void setBook_inDate(String book_inDate) {
		this.book_inDate = book_inDate;
	}
	
}
