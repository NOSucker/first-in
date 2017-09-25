/**
 * 
 */
package cn.edu.nsu.predom.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZG
 *
 */
public class OrderServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceManager serviceManager = (ServiceManager)cx.getBean("serviceManager");
		
		Map<String, Object> order = new HashMap<String, Object>();
		order.put("order_id", 1212);
		order.put("order_total", 100000.0);
		order.put("order-dataTime", "2017-05-08");
		order.put("order_user", 529);
		
		ArrayList<Map<String, Object>> buys = new ArrayList<Map<String,Object>>();
		Map<String, Object> buy1 = new HashMap<String, Object>();
		buy1.put("book_id", 7);
		buy1.put("user_ID", 529);
		buy1.put("buy_num", 10);
		buy1.put("order_id", 1212);
		buys.add(buy1);
		
		Map<String, Object> buy2 = new HashMap<String, Object>();
		buy2.put("book_id", 8);
		buy2.put("user_ID", 529);
		buy2.put("buy_num", 10);
		buy2.put("order_id", 1212);
		buys.add(buy2);
		
		serviceManager.getOderService().submitOder(order, buys);
	}

}
