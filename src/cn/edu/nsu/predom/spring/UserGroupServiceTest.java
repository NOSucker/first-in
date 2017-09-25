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
public class UserGroupServiceTest {

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
		
		Map<String, Object> ug = new HashMap<String, Object>();
		ug.put("usergroup_name", "—Óàê");
		//System.out.println(serviceManager.getUserGroupService().getAll());
		serviceManager.getUserGroupService().add(ug);
		//serviceManager.getUserGroupService().getById(4);
		ug.put("usergroup_name", "yy");
		ug.put("usergroup_id", 1080);
		//serviceManager.getUserGroupService().modify(ug);
		//serviceManager.getUserGroupService().delete(1081);
		System.out.println(serviceManager.getUserGroupService().getAll());
		
		
		
//		userDAO.add(u);
//		System.out.println(userDAO.getAll());
		
//		u.put("user_address", "≥…∂º∂´»Ì");
//		u.put("user_id",5711 );
//		userDAO.modify(u);
//		System.out.println(userDAO.getById(5711));
		
//		userDAO.delete(5710);
//		System.out.println(userDAO.getById(5710));
		
//		System.out.println(serviceManager.getUserService().getAll());
	}

}
