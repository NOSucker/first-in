/**
 * 
 */
package cn.edu.nsu.predom.db.bookType;

import java.util.ArrayList;

import cn.edu.nsu.predom.db.book.Book;

/**
 * BookType�����ݷ�װ��
 * @author Administrator
 *
 */
public class BookType
{
	private int bookType_id;
	private String bookType_name;
	private ArrayList<Book> books;
	
	
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
	 * @return the bookType_name
	 */
	public String getBookType_name()
	{
		return bookType_name;
	}


	/**
	 * @param bookType_name the bookType_name to set
	 */
	public void setBookType_name(String bookType_name)
	{
		this.bookType_name = bookType_name;
	}


	public String toString()
	{
		// TODO Auto-generated method stub
		return bookType_id+"\t"+bookType_name;
	}


	/**
	 * @return the books
	 */
	public ArrayList<Book> getBooks()
	{
		return books;
	}


	/**
	 * @param books the books to set
	 */
	public void setBooks(ArrayList<Book> books)
	{
		this.books = books;
	}
	
	
}

