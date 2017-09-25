package cn.edu.nsu.predom.hibernate.auto;

import java.util.HashSet;
import java.util.Set;

/**
 * BookType entity. @author MyEclipse Persistence Tools
 */

public class BookType implements java.io.Serializable {

	// Fields

	private Integer bookTypeId;
	private String bookTypeName;
	private Set books = new HashSet(0);

	// Constructors

	/** default constructor */
	public BookType() {
	}

	/** minimal constructor */
	public BookType(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}

	/** full constructor */
	public BookType(String bookTypeName, Set books) {
		this.bookTypeName = bookTypeName;
		this.books = books;
	}

	// Property accessors

	public Integer getBookTypeId() {
		return this.bookTypeId;
	}

	public void setBookTypeId(Integer bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public String getBookTypeName() {
		return this.bookTypeName;
	}

	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

}