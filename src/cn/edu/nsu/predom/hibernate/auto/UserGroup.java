package cn.edu.nsu.predom.hibernate.auto;

import java.util.HashSet;
import java.util.Set;

/**
 * UserGroup entity. @author MyEclipse Persistence Tools
 */

public class UserGroup implements java.io.Serializable {

	// Fields

	private Integer userGroupId;
	private String userGroupName;
	private Set predoms = new HashSet(0);
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserGroup() {
	}

	/** minimal constructor */
	public UserGroup(String userGroupName) {
		this.userGroupName = userGroupName;
	}

	/** full constructor */
	public UserGroup(String userGroupName, Set predoms, Set userses) {
		this.userGroupName = userGroupName;
		this.predoms = predoms;
		this.userses = userses;
	}

	// Property accessors

	public Integer getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getUserGroupName() {
		return this.userGroupName;
	}

	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}

	public Set getPredoms() {
		return this.predoms;
	}

	public void setPredoms(Set predoms) {
		this.predoms = predoms;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}