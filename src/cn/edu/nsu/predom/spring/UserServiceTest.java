/**
 * 
 */
package cn.edu.nsu.predom.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZG
 *
 */
public class UserServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceManager serviceManager = (ServiceManager)cx.getBean("serviceManager");
		
//		System.out.println(userDAO.getById(5711));
//		System.out.println(userDAO.getAll());
//		System.out.println(userDAO.getByEmail("41@qq.com"));
		
		Map<String, Object> u = new HashMap<String, Object>();
		u.put("userGroup_id", 4);
		u.put("user_name", "杨垚");
		u.put("user_address", "成都东软学院");
		u.put("user_code", "811844");
		u.put("user_phone", "18180462893");
		u.put("user_email", "1576927046@qq.com");
		u.put("user_password", "123456");
//		userDAO.add(u);
//		System.out.println(userDAO.getAll());
		
//		u.put("user_address", "成都东软");
//		u.put("user_id",5711 );
//		userDAO.modify(u);
//		System.out.println(userDAO.getById(5711));
		
//		userDAO.delete(5710);
//		System.out.println(userDAO.getById(5710));
		
		//System.out.println(serviceManager.getUserService().getAll());
		System.out.println(serviceManager.getUserService().getById(529));
	}

}
