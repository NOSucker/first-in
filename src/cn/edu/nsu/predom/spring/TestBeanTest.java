/**
 * 
 */
package cn.edu.nsu.predom.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LZG
 *
 */
public class TestBeanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TestBean testBean = new TestBean();
		//¿ØÖÆ·´×ª
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean =  (TestBean)cx.getBean("testBean");
		
		testBean.test();
	}

}
