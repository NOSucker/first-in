package cn.edu.nsu.predom.hibernate.auto;

import java.util.HashSet;
import java.util.Set;

/**
 * Functions entity. @author MyEclipse Persistence Tools
 */

public class Functions implements java.io.Serializable {

	// Fields

	private Integer functionId;
	private String functionName;
	private String functionNote;
	private Set predoms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Functions() {
	}

	/** minimal constructor */
	public Functions(String functionName, String functionNote) {
		this.functionName = functionName;
		this.functionNote = functionNote;
	}

	/** full constructor */
	public Functions(String functionName, String functionNote, Set predoms) {
		this.functionName = functionName;
		this.functionNote = functionNote;
		this.predoms = predoms;
	}

	// Property accessors

	public Integer getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionNote() {
		return this.functionNote;
	}

	public void setFunctionNote(String functionNote) {
		this.functionNote = functionNote;
	}

	public Set getPredoms() {
		return this.predoms;
	}

	public void setPredoms(Set predoms) {
		this.predoms = predoms;
	}

}