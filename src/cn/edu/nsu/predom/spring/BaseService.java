/**
 * 
 */
package cn.edu.nsu.predom.spring;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author LZG
 *
 */
public abstract class BaseService {

	@Resource()
	protected JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public abstract List<Map<String, Object>> getById(int id);
	public abstract List<Map<String, Object>> getByEmail(String user_email);
	public abstract List<Map<String, Object>> getAll();
	public abstract void add(Map<String, Object> u);
	public abstract void modify(Map<String, Object> newUser);
	public abstract void delete(int id);
	
	/**
	 * 将指定的Map结构数据按指定的键顺序转存到Object数组中
	 * @param map要被转存的数据
	 * @param keyStr键顺序
	 * @return Object数组
	 */
	public Object[] fromMapToObjectArray(Map<String, Object> map,String keyStr){
		
		Object[] params = new Object[map.size()];
		String[] keys = keyStr.split(",");
		for(int i=0;i<keys.length;i++)
		{
			if(map.get(keys[i]) instanceof Object[])
			{
				params[i] = ((Object[])map.get(keys[i]))[0];
			}
			else 
			{
				params[i]=map.get(keys[i]);
			}
			
		}
		return params;
	}
	
}
