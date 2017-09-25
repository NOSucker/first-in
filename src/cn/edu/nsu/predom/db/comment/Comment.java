package cn.edu.nsu.predom.db.comment;

import cn.edu.nsu.predom.db.book.Book;

public class Comment
{
	private int comment_id;
	private int book_id;
	private int user_id;
	private String comment_content;
	private Book book;
	/**
	 * @return the comment_id
	 */
	public int getComment_id()
	{
		return comment_id;
	}
	/**
	 * @param comment_id the comment_id to set
	 */
	public void setComment_id(int comment_id)
	{
		this.comment_id = comment_id;
	}
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
	 * @return the user_id
	 */
	public int getUser_id()
	{
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id)
	{
		this.user_id = user_id;
	}
	/**
	 * @return the comment_content
	 */
	public String getComment_content()
	{
		return comment_content;
	}
	/**
	 * @param comment_content the comment_content to set
	 */
	public void setComment_content(String comment_content)
	{
		this.comment_content = comment_content;
	}
	/**
	 * @return
	 * @see java.lang.String#toString()
	 */
	public String toString()
	{
		return comment_id+"\t"+book_id+"\t"+user_id+"\t"+comment_content;
	}
	/**
	 * @return the book
	 */
	public Book getBook()
	{
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(Book book)
	{
		this.book = book;
	}
	

	
}
