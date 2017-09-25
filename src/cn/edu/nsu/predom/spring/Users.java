/**
 * 
 */
package cn.edu.nsu.predom.spring;

import org.springframework.stereotype.Component;


/**
 * @author Clover
 *
 */
@Component()
public class Users 
{
	private int user_ID;
	private int userGroup_id; 
	private String user_name; 
	private String user_address;
	private String user_code; 
	private String user_phone;
	private String user_email;
	private String user_password;
	//================================
	/**
	 * @return the user_ID
	 */
	public int getUser_ID() {
		return user_ID;
	}
	/**
	 * @param user_ID the user_ID to set
	 */
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	/**
	 * @return the userGroup_id
	 */
	public int getUserGroup_id() {
		return userGroup_id;
	}
	/**
	 * @param userGroup_id the userGroup_id to set
	 */
	public void setUserGroup_id(int userGroup_id) {
		this.userGroup_id = userGroup_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_address
	 */
	public String getUser_address() {
		return user_address;
	}
	/**
	 * @param user_address the user_address to set
	 */
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	/**
	 * @return the user_code
	 */
	public String getUser_code() {
		return user_code;
	}
	/**
	 * @param user_code the user_code to set
	 */
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	/**
	 * @return the user_phone
	 */
	public String getUser_phone() {
		return user_phone;
	}
	/**
	 * @param user_phone the user_phone to set
	 */
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	/**
	 * @return the user_email
	 */
	public String getUser_email() {
		return user_email;
	}
	/**
	 * @param user_email the user_email to set
	 */
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return this.user_ID+"\t"+this.userGroup_id+"\t"+this.user_name
				+"\t"+this.user_address+"\t"+this.user_code
				+"\t"+this.user_phone+"\t"+this.user_email
				+"\t"+this.user_password;
	}
	
	
	
	
}
