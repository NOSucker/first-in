/**
 * 
 */
package cn.edu.nsu.predom.db.predom;

/**
 * @author ���Ƕ�
 *
 */
public class Predom {
	private int predom_id;
	private int function_id;
	private int userGroup_id;
	/**
	 * @return the predom_id
	 */
	public int getPredom_id() {
		return predom_id;
	}
	/**
	 * @param predomId the predom_id to set
	 */
	public void setPredom_id(int predomId) {
		predom_id = predomId;
	}
	/**
	 * @return the function_id
	 */
	public int getFunction_id() {
		return function_id;
	}
	/**
	 * @param functionId the function_id to set
	 */
	public void setFunction_id(int functionId) {
		function_id = functionId;
	}
	/**
	 * @return the userGroup_id
	 */
	public int getUserGroup_id() {
		return userGroup_id;
	}
	/**
	 * @param userGroupId the userGroup_id to set
	 */
	public void setUserGroup_id(int userGroupId) {
		userGroup_id = userGroupId;
	}
	
	public String toString(){
		return this.predom_id+"\t"+this.function_id+"\t"+this.userGroup_id+"\t";
	}

}
