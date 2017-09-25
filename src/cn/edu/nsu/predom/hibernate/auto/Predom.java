package cn.edu.nsu.predom.hibernate.auto;

/**
 * Predom entity. @author MyEclipse Persistence Tools
 */

public class Predom implements java.io.Serializable {

	// Fields

	private Integer predomId;
	private Functions functions;
	private UserGroup userGroup;

	// Constructors

	/** default constructor */
	public Predom() {
	}

	/** full constructor */
	public Predom(Functions functions, UserGroup userGroup) {
		this.functions = functions;
		this.userGroup = userGroup;
	}

	// Property accessors

	public Integer getPredomId() {
		return this.predomId;
	}

	public void setPredomId(Integer predomId) {
		this.predomId = predomId;
	}

	public Functions getFunctions() {
		return this.functions;
	}

	public void setFunctions(Functions functions) {
		this.functions = functions;
	}

	public UserGroup getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

}