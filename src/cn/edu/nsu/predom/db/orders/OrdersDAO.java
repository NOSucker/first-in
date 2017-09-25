/**
 * 
 */
package cn.edu.nsu.predom.db.orders;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import cn.edu.nsu.predom.db.DBMain;
import cn.edu.nsu.predom.db.buy.Buy;

/**
 * @author ��
 *
 */
public class OrdersDAO extends DBMain<Orders>{

	@Override
	public void add(Orders dataObj) throws ClassNotFoundException, SQLException {
		sql = "insert orders(users_id,orders_date,orders_totalPrice,orders_id) values(?,?,?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, dataObj.getUsers_id());
		pst.setString(2, dataObj.getOrders_date());
		pst.setFloat(3, dataObj.getOrders_totalPrice());
		pst.setInt(4, getMaxId()+1);
		pst.executeUpdate();
	}
	public void submitOrder(ArrayList<Buy> buys) throws ClassNotFoundException, SQLException
	{
		float totalPrice = 0.0f;
		for(int i=0;i<buys.size();i++)
		{
			Buy buy = buys.get(i);
			totalPrice = totalPrice + buy.getBook().getBook_price()*buy.getBuy_num();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String curDate = sdf.format(new Date());
		//----------------------------------------------------
		sql = "select max(orders_id) m from orders";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		int curOrder_id = 1;
		while(rst.next()){
			curOrder_id = rst.getInt("m")+1;
		}
		//----------------------------------------------------
		sql = "insert orders(orders_id,user_id,orders_date,orders_totalPrice) values(?,?,?,?)";
		pst = getPreparedStatement(sql);
		pst.setInt(1, curOrder_id);
		pst.setInt(2, buys.get(0).getUsers_id());
		pst.setString(3, curDate);
		pst.setFloat(4,totalPrice);
		pst.executeUpdate();
		//-----------------------------------------------------
		sql = "insert buy(book_id,user_id,buy_num,orders_id) values(?,?,?,?)";
		pst = this.getPreparedStatement(sql);
		
		for(int i=0;i<buys.size();i++)
		{
			Buy buy = buys.get(i);
			pst.setInt(1, buy.getBook_id());
			pst.setInt(2, buy.getUsers_id());
			pst.setInt(3, buy.getBuy_num());
			pst.setInt(4, curOrder_id);
			pst.executeUpdate();
		}
		release();
	}
	@Override
	public Orders assemble(ResultSet rst) throws SQLException {
		Orders od = new Orders();
		od.setOrders_id(rst.getInt("orders_id"));
		od.setOrders_date(rst.getString("orders_date"));
		od.setOrders_totalPrice(rst.getFloat("orders_tptalPrice"));
		od.setUsers_id(rst.getInt("users_id"));
		return od;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete orders where orders_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();		
	}

	@Override
	public ArrayList<Orders> getAll() throws ClassNotFoundException,
			SQLException {
		ArrayList<Orders> orders = new ArrayList<Orders>();
		sql = "select * from orders";
		Orders od = null;
		while(rst.next()){
			od = assemble(rst);
			orders.add(od);
		}
		return orders;
	}

	@Override
	public Orders getById(int id) throws ClassNotFoundException, SQLException {
		sql = "select * from orders where orders_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Orders od = null;
		while(rst.next()){
			od = assemble(rst);
		}
		return od;
	}

	@Override
	public void modify(Orders newDataObj) throws ClassNotFoundException,
			SQLException {
		sql = "update orders set users_id = ?,orders_date=?,orders_totalPrice=? where orders_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, newDataObj.getUsers_id());
		pst.setString(2, newDataObj.getOrders_date());
		pst.setFloat(3, newDataObj.getOrders_totalPrice());
		pst.setInt(4, newDataObj.getOrders_id());
		pst.executeUpdate();
	}
	
	public  int getMaxId() throws ClassNotFoundException, SQLException{
		sql = "select max('orders_id') m from orders";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		int output = 0;
		while(rst.next()){
			output = rst.getInt("m");
		}
		return output;
	}
	
	

}
