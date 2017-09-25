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
 * ��̨���й�����֤�û��Ƿ��ѵ�¼
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
		//���첻��Ҫ��֤�ѵ�¼�Ĺ����б�home.action��login.action
		ArrayList<String> notloginList = new ArrayList<String>();
		notloginList.add("/home.action");
		notloginList.add("/login.action");
		
		//��õ�ǰ����
		HttpServletRequest request = ServletActionContext.getRequest();
		String functionPsth = request.getServletPath();
		
		//1.�����ǰ�����ڲ�����֤�Ĺ����б��У�ֱ�ӷ���
		if(notloginList.contains(functionPsth)){
			arg0.invoke();
		}
		
		//2.���򣬽����ѵ�¼��֤
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
