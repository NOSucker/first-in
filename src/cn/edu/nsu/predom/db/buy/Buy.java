/**
 * 
 */
package cn.edu.nsu.predom.db.buy;

import cn.edu.nsu.predom.db.book.Book;

/**
 * @author ���Ƕ�
 *
 */
public class Buy {
	private int buy_id;
	private int book_id;
	private int users_id;
	private int buy_num;
	private int orders_id;
	
	private Book book;
	
	public int getBuy_id() {
		return buy_id;
	}
	public void setBuy_id(int buyId) {
		buy_id = buyId;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int bookId) {
		book_id = bookId;
	}
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int usersId) {
		users_id = usersId;
	}
	public int getBuy_num() {
		return buy_num;
	}
	public void setBuy_num(int buyNum) {
		buy_num = buyNum;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int ordersId) {
		orders_id = ordersId;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	

	
	
}
