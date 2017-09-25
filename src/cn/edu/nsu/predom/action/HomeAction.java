/**
 * 
 */
package cn.edu.nsu.predom.action;

import javax.enterprise.inject.New;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;

import cn.edu.nsu.predom.db.users.Users;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

/**
 * 负责所有的全局功能
 * @author Administrator
 *
 */
public class HomeAction extends ActionSupport 
{	
	private String user_email;
	private String user_password;
	
	public String home()
	{
		return "home";
	}
	
	@Validations(
			requiredStrings={
				@RequiredStringValidator(fieldName="user_email",message="用户名不能为空！",type=ValidatorType.FIELD,trim=true,shortCircuit=true),
				@RequiredStringValidator(fieldName="user_password",message="密码不能为空！",type=ValidatorType.FIELD,trim=true,shortCircuit=true)
			},
			emails={
					@EmailValidator(fieldName="user_email",message="请输入正确的email！",type=ValidatorType.FIELD,shortCircuit=true)
			}
			)
	
	public String login()
	{
		ServletActionContext.getRequest().getSession().setAttribute("user", new Users());
		return "login";
	}
	public void validateLogin() {
		// TODO Auto-generated method stub
		super.validate();
	}
	
	public String getUser_email() {
		return user_email;
	}



	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}



	public String getUser_password() {
		return user_password;
	}



	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	
}
