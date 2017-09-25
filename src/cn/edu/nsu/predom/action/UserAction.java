/**
 * 
 */
package cn.edu.nsu.predom.action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import cn.edu.nsu.predom.db.userGroup.UserGroup;
import cn.edu.nsu.predom.db.userGroup.UserGroupDAO;
import cn.edu.nsu.predom.db.users.UserDAO;
import cn.edu.nsu.predom.db.users.Users;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class UserAction extends BaseAction
{
	private Log log = LogFactory.getLog(getClass());//创建一个工厂模式的日志对象
	//--------------------------------
	private int user_ID;
	
	private File userPic;
	private String userPicFileName;
	private String userPicContentType;
	
	//--------------------------
	private List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
	private Users user = new Users();//new一个对象，避免空指针异常
	private ArrayList<UserGroup> ugs = new ArrayList<UserGroup>();
	
	//-------------------------------
	private String fileLastName;
	private String fileUri;
	
	public String getFileLastName() {
		return fileLastName;
	}

	public void setFileLastName(String fileLastName) {
		this.fileLastName = fileLastName;
	}

	public String getFileUri() {
		return fileUri;
	}

	public void setFileUri(String fileUri) {
		this.fileUri = fileUri;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public File getUserPic() {
		return userPic;
	}

	public void setUserPic(File userPic) {
		this.userPic = userPic;
	}

	public String getUserPicFileName() {
		return userPicFileName;
	}

	public void setUserPicFileName(String userPicFileName) {
		this.userPicFileName = userPicFileName;
	}

	public String getUserPicContentType() {
		return userPicContentType;
	}

	public void setUserPicContentType(String userPicContentType) {
		this.userPicContentType = userPicContentType;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	
	public ArrayList<UserGroup> getUgs() {
		return ugs;
	}

	public void setUgs(ArrayList<UserGroup> ugs) {
		this.ugs = ugs;
	}

	public int getUser_ID() {
		return user_ID;
	}


	public void setUser(Users user) {
		this.user = user;
	}

	public Users getUser() {
		return user;
	}

	public List<Map<String, Object>> getUserList() {
		return userList;
	}

	public void setUserList(List<Map<String, Object>> userList) {
		this.userList = userList;
	}

	public String list()
	{
		userList = getServiceManager().getUserService().getAll();
		return "list";
		//return "jsonList";//返回json数据格式到客户端，不是到网页
	}
	public String openAdd()
	{
		UserGroupDAO userGroupDAO = new UserGroupDAO();
		try {
			ugs = userGroupDAO.getAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				userGroupDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "openAdd";
	}
	public String add()
	{
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.add(user);
			
			try {
				//文件最终名字
				Calendar cal = Calendar.getInstance();
				long curTime = cal.getTimeInMillis();
				String fileExt = userPicFileName.substring(userPicFileName.lastIndexOf("."));
				fileLastName = curTime + fileExt;
				
				//文件最终物理路径
				String fileLastPath = ServletActionContext.getServletContext().getRealPath("/pics/"+fileLastName);
				fileUri = "/pics/"+fileLastName;
				
				//转存
				File targetFile = new File(fileLastPath);
				FileUtils.copyFile(userPic, targetFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				userDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "add";
	}
	public String openModify()
	{
		UserDAO userDAO = new UserDAO();
		UserGroupDAO userGroupDAO = new UserGroupDAO();
		try {
			log.info("user_ID="+user_ID);
			user = userDAO.getById(user_ID);
			ugs = userGroupDAO.getAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				userDAO.release();
				userGroupDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "openModify";
	}
	public String modify()
	{
		//--------------------------------
		//modifyUsers里面把一个user对象的离散属性封装到user
		//System.out.println(user);
		//--------------------------------
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.modify(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				userDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "modify";
	}
	public String delete()
	{
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.delete(user_ID);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				userDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "delete";
	}
}
