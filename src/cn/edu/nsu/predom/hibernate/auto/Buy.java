package cn.edu.nsu.predom.hibernate.auto;

/**
 * Buy entity. @author MyEclipse Persistence Tools
 */

public class Buy implements java.io.Serializable {

	// Fields

	private Integer buyId;
	private Book book;
	private Users users;
	private Orders orders;
	private Integer buyNum;

	// Constructors

	/** default constructor */
	public Buy() {
	}

	/** full constructor */
	public Buy(Book book, Users users, Orders orders, Integer buyNum) {
		this.book = book;
		this.users = users;
		this.orders = orders;
		this.buyNum = buyNum;
	}

	// Property accessors

	public Integer getBuyId() {
		return this.buyId;
	}

	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Integer getBuyNum() {
		return this.buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

}