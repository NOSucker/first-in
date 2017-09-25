package cn.edu.nsu.predom.hibernate.auto;

import java.util.HashSet;
import java.util.Set;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private Integer bookId;
	private BookType bookType;
	private String bookIsbn;
	private String bookName;
	private String bookAuth;
	private String bookPublish;
	private float bookPrice;
	private String bookFace;
	private Set buies = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(String bookIsbn, String bookName, String bookAuth,
			String bookPublish, float bookPrice, String bookFace) {
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
		this.bookFace = bookFace;
	}

	/** full constructor */
	public Book(BookType bookType, String bookIsbn, String bookName,
			String bookAuth, String bookPublish, float bookPrice,
			String bookFace, Set buies, Set comments) {
		this.bookType = bookType;
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
		this.bookFace = bookFace;
		this.buies = buies;
		this.comments = comments;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public BookType getBookType() {
		return this.bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public String getBookIsbn() {
		return this.bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuth() {
		return this.bookAuth;
	}

	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}

	public String getBookPublish() {
		return this.bookPublish;
	}

	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}

	public float getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookFace() {
		return this.bookFace;
	}

	public void setBookFace(String bookFace) {
		this.bookFace = bookFace;
	}

	public Set getBuies() {
		return this.buies;
	}

	public void setBuies(Set buies) {
		this.buies = buies;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}