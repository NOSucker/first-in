/**
 * 
 */
package cn.edu.nsu.predom.db.buy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.predom.db.DBMain;

/**
 * @author ���Ƕ�
 *
 */
public class BuyDAO extends DBMain<Buy>{
	@Override
	public void add(Buy dataObj) throws ClassNotFoundException, SQLException {
		sql = "insert buy(book_id,users_id,buy_num,orders_id) values(?,?,?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, dataObj.getBook_id());
		pst.setInt(2, dataObj.getUsers_id());
		pst.setInt(3, dataObj.getBuy_num());
		pst.setInt(4, dataObj.getOrders_id());
		pst.executeUpdate();
		this.release();
	}

	@Override
	public Buy assemble(ResultSet rst) throws SQLException {
		Buy buy = new Buy();
		buy.setBook_id(rst.getInt("book_id"));
		buy.setUsers_id(rst.getInt("users_id"));
		buy.setBuy_num(rst.getInt("buy_num"));
		buy.setOrders_id(rst.getInt("orders_id"));
		this.release();
		return buy;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete buy where buy_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		this.release();
	}

	@Override
	public ArrayList<Buy> getAll() throws ClassNotFoundException, SQLException {
		ArrayList<Buy> buys = new ArrayList<Buy>();
		sql = "select * from buy";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		Buy buy = null;
		while(rst.next()){
			buy = this.assemble(rst);
			buys.add(buy);
		}	
		this.release();
		return buys;
	}

	@Override
	public Buy getById(int id) throws ClassNotFoundException, SQLException {
		Buy buy = null;
		sql = "select * from buy where buy_id = ?";
		pst =this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		while(rst.next()){
			buy = this.assemble(rst);
		}
		this.release();
		return buy;
	}

	@Override
	public void modify(Buy newDataObj) throws ClassNotFoundException,
			SQLException {
		sql = "updata buy set book_id = ?,users_id = ?,buy_num = ?,orders_id = ? where buy_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, newDataObj.getBook_id());
		pst.setInt(2, newDataObj.getUsers_id());
		pst.setInt(3, newDataObj.getBuy_num());
		pst.setInt(4, newDataObj.getOrders_id());
		pst.setInt(5, newDataObj.getBuy_id());
		pst.executeUpdate();
	}
	

}
