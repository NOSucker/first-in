/**
 * 
 */
package cn.edu.nsu.predom.db.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.predom.db.DBMain;

/**
 * User閿熸枻鎷烽敓鏂ゆ嫹閿熸嵎璇ф嫹閿熸枻鎷烽敓鏂ゆ嫹
 * 
 * @author 閿熸枻鎷峰皬閿熸枻鎷�
 * 
 */
public class UserDAO extends DBMain<Users> {

	@Override
	public Users getById(int id) throws ClassNotFoundException, SQLException {
		// 閿熸枻鎷疯SQL
		String sql = "select * from users where user_ID=?";
		pst = getPreparedStatement(sql);
		pst.setInt(1, id);
		// 鎵ч敓鏂ゆ嫹SQL
		rst = pst.executeQuery();
		// 閿熸枻鎷烽敓鏂ゆ嫹鎵ч敓鍙枻鎷烽敓锟�		
		Users u = null;
		while (rst.next()) {
			u = assemble(rst);
		}

		release();
		return u;
	}
/**
 * 
 * @param user_email
 * @return
 * @throws ClassNotFoundException
 * @throws SQLException
 */
	public Users getByEmail(String user_email) throws ClassNotFoundException,
			SQLException {
		// 閿熸枻鎷疯SQL
		String sql = "select * from users where user_email=?";
		pst = getPreparedStatement(sql);
		pst.setString(1, user_email);
		// 鎵ч敓鏂ゆ嫹SQL
		rst = pst.executeQuery();
		// 閿熸枻鎷烽敓鏂ゆ嫹鎵ч敓鍙枻鎷烽敓锟�		
		Users u = null;
		while (rst.next()) {
			u = assemble(rst);
		}

		release();
		return u;
	}

	@Override
	public ArrayList<Users> getAll() throws ClassNotFoundException,
			SQLException {
		// 閿熸枻鎷疯SQL
		String sql = "select * from users";
		pst = getPreparedStatement(sql);
		// 鎵ч敓鏂ゆ嫹SQL
		rst = pst.executeQuery();
		// 閿熸枻鎷烽敓鏂ゆ嫹鎵ч敓鍙枻鎷烽敓锟�
		ArrayList<Users> users = new ArrayList<Users>();
		while (rst.next()) {
			Users u = assemble(rst);

			users.add(u);
		}

		release();

		return users;

	}

	@Override
	public void add(Users u) throws ClassNotFoundException, SQLException {

		// 閿熸枻鎷疯SQL
		String sql = "insert into users(userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password) values(?,?,?,?,?,?,?)";
		pst = getPreparedStatement(sql);

		pst.setInt(1, u.getUserGroup_id());
		pst.setString(2, u.getUser_name());
		pst.setString(3, u.getUser_address());
		pst.setString(4, u.getUser_code());
		pst.setString(5, u.getUser_phone());
		pst.setString(6, u.getUser_email());
		pst.setString(7, u.getUser_password());

		// 鎵ч敓鏂ゆ嫹SQL
		pst.executeUpdate();
		// 閿熸枻鎷烽敓鏂ゆ嫹鎵ч敓鍙枻鎷烽敓锟�
		release();

	}

	@Override
	public void modify(Users newUser) throws ClassNotFoundException,
			SQLException {
		sql = "update users set userGroup_id = ?,user_name=?,user_address=?,user_code=?,user_phone=?,user_email=?,user_password=? where user_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, newUser.getUserGroup_id());
		pst.setString(2, newUser.getUser_name());
		pst.setString(3, newUser.getUser_address());
		pst.setString(4, newUser.getUser_code());
		pst.setString(5, newUser.getUser_phone());
		pst.setString(6, newUser.getUser_email());
		pst.setString(7, newUser.getUser_password());
		pst.setInt(8, newUser.getUser_ID());
		pst.executeUpdate();
		this.release();

	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		sql = "delete users where user_ID = ?";
		pst = getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	public Users assemble(ResultSet rst) throws SQLException {
		Users u = new Users();
		u.setUser_ID(rst.getInt("user_ID"));
		u.setUserGroup_id(rst.getInt("userGroup_id"));
		u.setUser_name(rst.getString("user_name"));
		u.setUser_address(rst.getString("user_address"));
		u.setUser_code(rst.getString("user_code"));
		u.setUser_phone(rst.getString("user_phone"));
		u.setUser_email(rst.getString("user_email"));
		u.setUser_password(rst.getString("user_password"));

		return u;
	}

}
