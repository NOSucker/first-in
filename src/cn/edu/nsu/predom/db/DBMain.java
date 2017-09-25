/**
 * 锟斤拷锟节达拷锟诫复锟矫ｏ拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷DB锟斤拷锟斤拷锟斤拷锟斤拷械锟斤拷锟酵拷锟斤拷锟�
 * 锟斤拷锟斤拷锟斤拷DB锟斤拷锟斤拷锟斤拷锟侥革拷锟斤拷
 */
package cn.edu.nsu.predom.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public abstract class DBMain<E>
{
	/**
	 * 锟斤拷锟斤拷DB锟斤拷锟斤拷锟斤拷喽硷拷锟酵碉拷械谋锟斤拷锟�
	 */
	protected Connection con = null;
	protected PreparedStatement pst = null;
	protected ResultSet rst = null;
	protected String sql = null;
	
	/**
	 * 锟斤拷锟絇reparedStatement锟斤拷锟斤拷
	 * @param sql
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	protected PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException
	{
		//------锟斤拷锟斤拷锟斤拷菘锟斤拷锟�--------------------
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//------锟斤拷锟斤拷锟捷匡拷锟斤拷锟斤拷----------------------
		 con = DriverManager.getConnection("jdbc:sqlserver://100.0.101.25:1433;databaseName=bookshop", "sa", "sa");
		//-------锟斤拷装SQL锟斤拷锟�--------------------
		//String sql = "select * from users";
		 pst =  con.prepareStatement(sql);
		 
		 return pst;
	}
	/**
	 * 锟酵凤拷锟斤拷菘锟斤拷锟斤拷锟�
	 * @throws SQLException
	 */
	public void release() throws SQLException
	{
		if(rst != null)
		{
			rst.close();
		}
		if(pst != null)
		{
			pst.close();
		}
		if(con != null)
		{
			con.close();
		}

	}
	
	public abstract ArrayList<E> getAll() throws ClassNotFoundException,SQLException;
	
	public abstract E getById(int id) throws ClassNotFoundException,SQLException;
	
	public abstract void add(E dataObj) throws ClassNotFoundException,SQLException;
	
	public abstract void modify(E newDataObj) throws ClassNotFoundException,SQLException;
	
	public abstract void delete(int id) throws ClassNotFoundException,SQLException;
	
	public abstract  E assemble(ResultSet rst) throws SQLException;
	
	
}
