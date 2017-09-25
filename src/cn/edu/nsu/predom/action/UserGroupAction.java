/**
 * 
 */
package cn.edu.nsu.predom.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javassist.expr.Instanceof;

import javax.ws.rs.core.Request;

import org.apache.commons.collections.MapUtils;
import org.apache.ibatis.annotations.Param;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.nsu.predom.db.userGroup.UserGroup;
import cn.edu.nsu.predom.spring.ServiceManager;

/**
 * @author LZG
 *
 */
public class UserGroupAction extends BaseAction{

	private int usergroup_id;
	
	private Map<String, Object> usergroup = new HashMap<String, Object>();//避免空指针异常
	private ArrayList<UserGroup> userGroups = new ArrayList<UserGroup>();//new一个对象，避免空指针异常
	private List<Map<String, Object>> userGroupList = new ArrayList<Map<String,Object>>();

	public int getUsergroup_id() {
		return usergroup_id;
	}

	public void setUsergroup_id(int usergroup_id) {
		this.usergroup_id = usergroup_id;
	}
	

	public List<Map<String, Object>> getUserGroupList() {
		return userGroupList;
	}

	public void setUserGroupList(List<Map<String, Object>> userGroupList) {
		this.userGroupList = userGroupList;
	}

	public Map<String, Object> getUsergroup() {
		return usergroup;
	}

	public void setUsergroup(Map<String, Object> usergroup) {
		this.usergroup = usergroup;
	}

	public ArrayList<UserGroup> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(ArrayList<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}

	public String userGroupList(){
		userGroupList = getServiceManager().getUserGroupService().getAll();
		return "userGroupList";
	}
	
	public String deleteUserGroup(){
		getServiceManager().getUserGroupService().delete(usergroup_id);
		return "deleteUserGroup";
	}
	
	public String openAddUserGroup(){
		return "openAddUserGroup";
	}
	
	public String addUserGroup(){
		getServiceManager().getUserGroupService().add(usergroup);
		return "addUserGroup";
	}
	
	public String openModifyUserGroup(){
		List<Map<String, Object>> ug = getServiceManager().getUserGroupService().getById(usergroup_id);
		usergroup = ug.get(0);
		return "openModifyUserGroup";
	}
	
	public String modifyUserGroup(){
	    getServiceManager().getUserGroupService().modify(usergroup);
		return "modifyUserGroup";
	}
}
