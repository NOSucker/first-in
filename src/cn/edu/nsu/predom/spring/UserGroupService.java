/**
 * 
 */
package cn.edu.nsu.predom.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.edu.nsu.predom.db.DBMain;

/**
 * @author ���Ƕ�
 * 
 */
@Service()
public class UserGroupService extends BaseService {

	public List<Map<String, Object>> getById(int id) {

		String sql = "select * from userGroup where usergroup_id=?";
		//ת��
		List<Map<String, Object>> userGroups = jdbcTemplate.queryForList(sql,new Object[]{id});
		
		return userGroups;
	}

	public List<Map<String, Object>> getByEmail(String user_email) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> getAll() {
		// 锟斤拷裑SQL	
		String sql = "select * from userGroup";
		//ת��
		List<Map<String, Object>> userGroups = jdbcTemplate.queryForList(sql);
				
		return userGroups;
	}

	public void add(Map<String, Object> ug) {
		// 锟斤拷裑SQL
		String sql = "insert into userGroup(usergroup_name) values(?)";
				
		String keyStr = "usergroup_name";
		Object[] params = fromMapToObjectArray(ug, keyStr);
				
		jdbcTemplate.update(sql, params);
	}

	public void modify(Map<String, Object> newUserGroup) {
		String sql = "update userGroup set usergroup_name=? where userGroup_id = ?";
		
		String keyStr = "usergroup_name,userGroup_id";
		Object[] params = fromMapToObjectArray(newUserGroup, keyStr);
		for(int i=0;i<params.length;i++)
		{
			System.out.println(params[i].toString());
		}
		
		jdbcTemplate.update(sql, params);

	}

	public void delete(int id) {
		String sql = "delete from userGroup where userGroup_id = ?";
		
		jdbcTemplate.update(sql, new Object[]{id});
	}
	
}
