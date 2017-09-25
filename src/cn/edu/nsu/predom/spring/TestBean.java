/**
 * 
 */
package cn.edu.nsu.predom.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LZG
 *
 */
@Component()
public class TestBean {
	
	@Value("zxh")
	private String name;
	@Resource()
	private Users users;
	
	public TestBean(){
		System.out.println("=========TestBean()");
	}
	
	public void test(){
		System.out.println("=========TestBean£º"+name);
		System.out.println("=========TestBean£º"+users);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("=========TestBean()"+name);
		this.name = name;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
}
