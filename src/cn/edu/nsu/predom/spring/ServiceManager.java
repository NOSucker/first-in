/**
 * 
 */
package cn.edu.nsu.predom.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * @author LZG
 *
 */
@Service()
public class ServiceManager {
	
	@Resource()
	private UserService userService;
	@Resource()
	private OrderService oderService;
	@Resource()
	private UserGroupService userGroupService;
	
	public UserGroupService getUserGroupService() {
		return userGroupService;
	}

	public void setUserGroupService(UserGroupService userGroupService) {
		this.userGroupService = userGroupService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public OrderService getOderService() {
		return oderService;
	}

	public void setOderService(OrderService oderService) {
		this.oderService = oderService;
	}
	
}
