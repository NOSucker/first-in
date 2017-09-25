/**
 * 
 */
package cn.edu.nsu.predom.interceptor;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 后台所有功能验证用户是否已登录
 * @author LZG
 *
 */
public class LoginInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		//构造不需要验证已登录的功能列表，home.action和login.action
		ArrayList<String> notloginList = new ArrayList<String>();
		notloginList.add("/home.action");
		notloginList.add("/login.action");
		
		//获得当前功能
		HttpServletRequest request = ServletActionContext.getRequest();
		String functionPsth = request.getServletPath();
		
		//1.如果当前功能在不需验证的功能列表中，直接放行
		if(notloginList.contains(functionPsth)){
			arg0.invoke();
		}
		
		//2.否则，进行已登录验证
		else {
			if(request.getSession().getAttribute("user")!=null){
				arg0.invoke();
			}
			else {
				return "notLogin";
			}
		}
		return "notLogin";
	}

}
