/**
 * 
 */
package cn.edu.nsu.predom.db.users;

import java.sql.SQLException;

/**
 * @author Clover
 *
 */
public class UserDAOTest {

	private static UserDAO dao = new UserDAO();

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try {
			getAllTest();
			//addTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				dao.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(dao.getAll().toString());
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Users u = new Users();
		u.setUserGroup_id(9);
		u.setUser_name("��С��");
		u.setUser_address("�ɶ�����ѧԺ");
		u.setUser_code("611844");
		u.setUser_phone("13668270601");
		u.setUser_email("137136612@qq.com");
		u.setUser_password("123456");
		//==================================
		dao.add(u);
		//======================
		getAllTest();
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
	}
	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
	}
	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
	}
}
