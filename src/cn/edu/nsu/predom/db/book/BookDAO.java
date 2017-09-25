package cn.edu.nsu.predom.db.book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.predom.db.DBMain;

public class BookDAO extends DBMain<Book>
{

	@Override
	public void add(Book dataObj) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "insert book(book_id=?,bookType_id=?,book_ISBN=?,book_name=?,book_author=?,book_press=?,book_price=?,book_picture=?)";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, dataObj.getBook_id());
		pst.setInt(2, dataObj.getBookType_id());
		pst.setString(3, dataObj.getBook_ISBN());
		pst.setString(4, dataObj.getBook_name());
		pst.setString(5, dataObj.getBook_author());
		pst.setString(6, dataObj.getBook_press());
		pst.setFloat(7, dataObj.getBook_price());
		pst.setString(8, dataObj.getBook_picture());

		pst.executeUpdate();

		release();
	}

	@Override
	public Book assemble(ResultSet rst) throws SQLException
	{
		// TODO Auto-generated method stub
		Book b = new Book();

		b.setBook_id(rst.getInt("book_id"));
		b.setBookType_id(rst.getInt("bookType_id"));
		b.setBook_ISBN(rst.getString("book_ISBN"));
		b.setBook_name(rst.getString("book_name"));
		b.setBook_author(rst.getString("book_auth"));
		b.setBook_press(rst.getString("book_publish"));
		b.setBook_price(rst.getFloat("book_price"));
		b.setBook_picture(rst.getString("book_face"));
		b.setBook_inDate(rst.getString("book_inDate"));
		
		return b;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "delete from book where book_id=?";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, id);

		pst.executeUpdate();

		release();
	}

	@Override
	public ArrayList<Book> getAll() throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<Book>();

		String sqlStr = "select * from book";
		pst = getPreparedStatement(sqlStr);

		rst = pst.executeQuery();
		Book b = null;
		while (rst.next())
		{
			b = assemble(rst);

			books.add(b);

		}

		release();

		return books;
	}

	@Override
	public Book getById(int id) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sql = "select * from book where book_id=?";
		pst = this.getPreparedStatement(sql);

		pst.setInt(1, id);

		rst = pst.executeQuery();

		Book b = null;
		while (rst.next())
		{
			b = assemble(rst);

			release();

			return b;

		}
		return null;
	}

	@Override
	public void modify(Book dataObj) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		String sqlStr = "update book set bookType_id=?,book_ISBN=?,book_name=?,book_author=?,book_press=?,book_price=?,book_picture=? where book_id=?";
		pst = getPreparedStatement(sqlStr);

		pst.setInt(1, dataObj.getBookType_id());
		pst.setString(2, dataObj.getBook_ISBN());
		pst.setString(3, dataObj.getBook_name());
		pst.setString(4, dataObj.getBook_author());
		pst.setString(5, dataObj.getBook_press());
		pst.setFloat(6, dataObj.getBook_price());
		pst.setString(7, dataObj.getBook_picture());
		pst.setInt(8, dataObj.getBook_id());

		pst.executeUpdate();

		release();
	}

	
}
