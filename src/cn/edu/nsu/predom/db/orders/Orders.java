/**
 * 
 */
package cn.edu.nsu.predom.db.orders;

import java.util.ArrayList;

import cn.edu.nsu.predom.db.buy.Buy;

/**
 * @author ���Ƕ�
 * 
 */
public class Orders {
	private int orders_id;
	private int users_id;
	private String orders_date;
	private float orders_totalPrice;
	private ArrayList<Buy> buys;

	/**
	 * @return the orders_id
	 */
	public int getOrders_id() {
		return orders_id;
	}

	/**
	 * @param ordersId
	 *            the orders_id to set
	 */
	public void setOrders_id(int ordersId) {
		orders_id = ordersId;
	}

	/**
	 * @return the users_id
	 */
	public int getUsers_id() {
		return users_id;
	}

	/**
	 * @param usersId
	 *            the users_id to set
	 */
	public void setUsers_id(int usersId) {
		users_id = usersId;
	}

	/**
	 * @return the orders_date
	 */
	public String getOrders_date() {
		return orders_date;
	}

	/**
	 * @param ordersDate
	 *            the orders_date to set
	 */
	public void setOrders_date(String ordersDate) {
		orders_date = ordersDate;
	}

	/**
	 * @return the orders_totalPrice
	 */
	public float getOrders_totalPrice() {
		return orders_totalPrice;
	}

	/**
	 * @param ordersTotalPrice
	 *            the orders_totalPrice to set
	 */
	public void setOrders_totalPrice(float ordersTotalPrice) {
		orders_totalPrice = ordersTotalPrice;
	}

	/**
	 * @return the buys
	 */
	public ArrayList<Buy> getBuys() {
		return buys;
	}

	/**
	 * @param buys
	 *            the buys to set
	 */
	public void setBuys(ArrayList<Buy> buys) {
		this.buys = buys;
	}

	public String toString() {
		return this.orders_id + "\t" + this.users_id + "\t" + this.orders_date
				+ "\t" + this.orders_totalPrice;
	}

}
