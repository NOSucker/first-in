/**
 * 
 */
package cn.edu.nsu.predom.db.function;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.predom.db.DBMain;

/**
 * @author ���Ƕ�
 * 
 */
public class FunctionDAO extends DBMain<Function> {

	@Override
	public void add(Function dataObj) throws ClassNotFoundException,
			SQLException {
		sql = "insert functions(function_name,function_note) values(?,?)";
		pst = this.getPreparedStatement(sql);
		pst.setString(1, dataObj.getFunction_name());
		pst.setString(2, dataObj.getFunction_note());
		pst.executeUpdate();
	}

	@Override
	public Function assemble(ResultSet rst) throws SQLException {
		Function fc = new Function();
		fc.setFunction_id(rst.getInt("function_id"));
		fc.setFunction_name(rst.getString("function_name"));
		fc.setFunction_note(rst.getString("function_note"));
		return fc;
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		sql = "delete functions where function_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();

	}

	@Override
	public ArrayList<Function> getAll() throws ClassNotFoundException,
			SQLException {
		ArrayList<Function> functions = new ArrayList<Function>();
		Function function = null;
		sql = "select * from functions";
		pst = this.getPreparedStatement(sql);
		rst = pst.executeQuery();
		while (rst.next()) {
			function = assemble(rst);
			functions.add(function);
		}
		return functions;
	}

	public ArrayList<Function> getAllByUserGroupId(int userGroup_id) throws ClassNotFoundException,
			SQLException {
		ArrayList<Function> functions = new ArrayList<Function>();
		Function function = null;
		sql = "select functions.* from functions,predom where functions.function_id=predom.function_ID and predom.userGroup_id=?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, userGroup_id);
		rst = pst.executeQuery();
		while (rst.next()) {
			function = assemble(rst);
			functions.add(function);
		}
		return functions;
	}

	@Override
	public Function getById(int id) throws ClassNotFoundException, SQLException {
		Function function = null;
		sql = "select * from functions where functions_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		while (rst.next()) {
			function = assemble(rst);
		}
		return function;
	}

	@Override
	public void modify(Function newDataObj) throws ClassNotFoundException,
			SQLException {
		sql = "update functions set functions_name = ?,functions_note = ? where functions_id = ?";
		pst = this.getPreparedStatement(sql);
		pst.setString(1, newDataObj.getFunction_name());
		pst.setString(2, newDataObj.getFunction_note());
		pst.setInt(3, newDataObj.getFunction_id());
		pst.executeUpdate();
	}

}
