package cn.edu.nsu.predom.hibernate.auto;

import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Users users;
	private double orderTotal;
	private String orderDataTime;
	private Set buies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Integer orderId, Users users, double orderTotal,
			String orderDataTime) {
		this.orderId = orderId;
		this.users = users;
		this.orderTotal = orderTotal;
		this.orderDataTime = orderDataTime;
	}

	/** full constructor */
	public Orders(Integer orderId, Users users, double orderTotal,
			String orderDataTime, Set buies) {
		this.orderId = orderId;
		this.users = users;
		this.orderTotal = orderTotal;
		this.orderDataTime = orderDataTime;
		this.buies = buies;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public double getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getOrderDataTime() {
		return this.orderDataTime;
	}

	public void setOrderDataTime(String orderDataTime) {
		this.orderDataTime = orderDataTime;
	}

	public Set getBuies() {
		return this.buies;
	}

	public void setBuies(Set buies) {
		this.buies = buies;
	}

}