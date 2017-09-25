/**
 * 
 */
package cn.edu.nsu.predom.db.userGroup;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.predom.db.DBMain;

/**
 * @author ���Ƕ�
 * 
 */
public class UserGroupDAO extends DBMain<UserGroup> {

	/**
	 * 
	 */
	@Override
	public void add(UserGroup dataObj) throws ClassNotFoundException,
			SQLException {
		sql = "insert userGroup(usergroup_name,usergroup_note) values(?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setString(1, dataObj.getUsergroup_name());
		pst.setString(2, dataObj.getUsergroup_note());
		pst.executeUpdate();
		release();

	}
	/**
	 * 
	 */
	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete userGroup where usergroup_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		
		release();
	}
	/**
	 * 
	 */
	@Override
	public ArrayList<UserGroup> getAll() throws ClassNotFoundException,
			SQLException {
		ArrayList<UserGroup> groups = new ArrayList<UserGroup>();
		UserGroup u = null;
		sql = "select * from userGroup";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		while (rst.next()) {
			u = assemble(rst);
			groups.add(u);
		}
		release();
		return groups;
	}
	/**
	 * 
	 */
	@Override
	public UserGroup getById(int id) throws ClassNotFoundException,
			SQLException {
		sql = "select * from userGroup where usergroup_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		UserGroup u = null;
		while (rst.next()) {
			u = assemble(rst);
		}
		release();
		return u;
	}
	/**
	 * 
	 */
	@Override
	public void modify(UserGroup newDataObj) throws ClassNotFoundException,
			SQLException {
		sql = "update userGroup set usergroup_name = ?,usergroup_note=? where usergroup_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setString(1, newDataObj.getUsergroup_name());
		pst.setString(2, newDataObj.getUsergroup_note());
		pst.setInt(3, newDataObj.getUsergroup_id());
		pst.executeUpdate();

		release();
	}
	/**
	 * 
	 */
	@Override
	public UserGroup assemble(ResultSet rst) throws SQLException {
		UserGroup u = new UserGroup();
		u.setUsergroup_id(rst.getInt("usergroup_id"));
		u.setUsergroup_name(rst.getString("usergroup_name"));
		return u;
	}
	

}
