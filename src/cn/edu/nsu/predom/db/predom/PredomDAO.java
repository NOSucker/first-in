/**
 * 
 */
package cn.edu.nsu.predom.db.predom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.predom.db.DBMain;

/**
 * @author ���Ƕ�
 *
 */
public class PredomDAO extends DBMain<Predom>{
	@Override
	public void add(Predom dataObj) throws ClassNotFoundException, SQLException {
		sql = "insert predom (function_id,userGroup_id) values(?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, dataObj.getFunction_id());
		pst.setInt(2, dataObj.getUserGroup_id());
		pst.executeUpdate();
		release();
	}
	/**
	 * 
	 * @param userGroup_id
	 * @param function_ids
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void configPredom(int userGroup_id,int[] function_ids) throws ClassNotFoundException, SQLException {
		sql = "delete from predom where userGroup_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, userGroup_id);
		pst.executeUpdate();
		
		sql = "insert predom (function_ID,userGroup_id) values(?,?)";
		pst = this.getPreparedStatement(sql);
		for(int i=0;i<function_ids.length;i++)
		{
			pst.setInt(1, function_ids[i]);
			pst.setInt(2, userGroup_id);
			pst.executeUpdate();
		}
		release();
		
	}

	@Override
	public Predom assemble(ResultSet rst) throws SQLException {
		Predom pd = new Predom();
		pd.setFunction_id(rst.getInt("function_id"));
		pd.setUserGroup_id(rst.getInt("userGroup_id"));
		pd.setPredom_id(rst.getInt("predom_id"));
		return pd;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete predom where predom_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
	}

	@Override
	public ArrayList<Predom> getAll() throws ClassNotFoundException,
			SQLException {
		ArrayList<Predom> predoms = new ArrayList<Predom> ();
		sql = "select * from predom ";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		Predom p = null;
		while(rst.next()){
			p = assemble(rst);
			predoms.add(p);
		}
		return predoms;
	}

	@Override
	public Predom getById(int id) throws ClassNotFoundException, SQLException {
		sql = "select * from predom whrere predom_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Predom p = null;
		while(rst.next()){
			p = assemble(rst);
		}
		return p;
	}

	@Override
	public void modify(Predom newDataObj) throws ClassNotFoundException,
			SQLException {}

}
