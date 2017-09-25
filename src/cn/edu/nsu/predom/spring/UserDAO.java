/**
 * 
 */
package cn.edu.nsu.predom.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.edu.nsu.predom.db.DBMain;

/**
 * User閿熸枻鎷烽敓鏂ゆ嫹閿熸嵎璇ф嫹閿熸枻鎷烽敓鏂ゆ嫹
 * 
 * @author 閿熸枻鎷峰皬閿熸枻鎷�
 * 
 */
@Service()
public class UserDAO{
	@Resource()
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Map<String, Object> getById(int id){
		// 閿熸枻鎷疯SQL
		Map<String, Object> u = null;

		String sql = "select * from users where user_ID=?";
		//转存
		List<Map<String, Object>> users = jdbcTemplate.queryForList(sql,new Object[]{id});
		if(users.size()>0){
			u = users.get(0);
		}
		
		return u;
	}
/**
 * 
 * @param user_email
 * @return
 * @throws ClassNotFoundException
 * @throws SQLException
 */
	public List<Map<String, Object>> getByEmail(String user_email){
		// 閿熸枻鎷疯SQL
		String sql = "select * from users where user_email=?";
		List<Map<String, Object>> users = jdbcTemplate.queryForList(sql, new Object[]{user_email});
		return users;
	}

	public List<Map<String, Object>> getAll(){
		// 閿熸枻鎷疯SQL	
		String sql = "select * from users";
		//转存
		List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
		
		return users;

	}

	public void add(Map<String, Object> u){
		// 閿熸枻鎷疯SQL
		String sql = "insert into users(userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password) values(?,?,?,?,?,?,?)";
		
		Object[] params = new Object[u.size()];
		String keyStr = "userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password";
		String[] keys = keyStr.split(",");
		for(int i=0;i<keys.length;i++){
			params[i]=u.get(keys[i]);
		}

		jdbcTemplate.update(sql, params);

	}

	public void modify(Map<String, Object> newUser){
		String sql = "update users set userGroup_id = ?,user_name=?,user_address=?,user_code=?,user_phone=?,user_email=?,user_password=? where user_id = ?";
		
		Object[] params = new Object[newUser.size()];
		String keyStr = "userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password,user_id";
		String[] keys = keyStr.split(",");
		for(int i=0;i<keys.length;i++){
			params[i]=newUser.get(keys[i]);
		}
		
		jdbcTemplate.update(sql, params);

	}

	public void delete(int id){
		// TODO Auto-generated method stub
		String sql = "delete from users where user_ID = ?";
		
		jdbcTemplate.update(sql, new Object[]{id});
		
	}

/*	public Users assemble(ResultSet rst) throws SQLException {
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
	}*/

}
