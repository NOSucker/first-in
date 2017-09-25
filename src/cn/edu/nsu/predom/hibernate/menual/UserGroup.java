/**
 * 
 */
package cn.edu.nsu.predom.hibernate.menual;

import java.util.Set;


/**
 * @author ï¿½ï¿½ï¿½Ç¶ï¿½
 *
 */
public class UserGroup {
	private int usergroup_id;
	private String usergroup_name;
	//==============================
	private Set<Users> users;//Ò»¸öUserGroup°üº¬¶à¸öusers
	/**
	 * @return the users
	 */
	public Set<Users> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<Users> users) {
		this.users = users;
	}
	//==============================
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
	/**
	 * @return the usergroup_note
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return usergroup_id+"\t"+usergroup_name;
	}
	
}
