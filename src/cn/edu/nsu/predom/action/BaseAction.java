/**
 * 
 */
package cn.edu.nsu.predom.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.nsu.predom.spring.ServiceManager;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author LZG
 *
 */
public class BaseAction extends ActionSupport{
	
	public ServiceManager getServiceManager(){
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceManager serviceManager = (ServiceManager)cx.getBean("serviceManager");
		return serviceManager;
	}

}
