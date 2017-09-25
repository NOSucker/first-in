/**
 * 
 */
package cn.edu.nsu.predom.spring;

import org.springframework.stereotype.Component;


/**
 * @author ���Ƕ�
 *
 */
@Component()
public class UserGroup {
	private int usergroup_id;
	private String usergroup_name;
	/**
	 * @return the usergroup_id
	 */
	public int getUsergroup_id() {
		return usergroup_id;
	}
	/**
	 * @param usergroup_id the usergroup_id to set
	 */
	public void setUsergroup_id(int usergroup_id) {
		this.usergroup_id = usergroup_id;
	}
	/**
	 * @return the usergroup_name
	 */
	public String getUsergroup_name() {
		return usergroup_name;
	}
	/**
	 * @param usergroup_name the usergroup_name to set
	 */
	public void setUsergroup_name(String usergroup_name) {
		this.usergroup_name = usergroup_name;
	}

}
