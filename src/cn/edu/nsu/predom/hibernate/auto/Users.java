package cn.edu.nsu.predom.hibernate.auto;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer userId;
	private UserGroup userGroup;
	private String userName;
	private String userAddress;
	private String userCode;
	private String userPhone;
	private String userEmail;
	private String userPassword;
	private Set orderses = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set buies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String userName, String userAddress, String userCode,
			String userPhone, String userEmail, String userPassword) {
		this.userName = userName;
		this.userAddress = userAddress;
		this.userCode = userCode;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	/** full constructor */
	public Users(UserGroup userGroup, String userName, String userAddress,
			String userCode, String userPhone, String userEmail,
			String userPassword, Set orderses, Set comments, Set buies) {
		this.userGroup = userGroup;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userCode = userCode;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.orderses = orderses;
		this.comments = comments;
		this.buies = buies;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public UserGroup getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getBuies() {
		return this.buies;
	}

	public void setBuies(Set buies) {
		this.buies = buies;
	}

}