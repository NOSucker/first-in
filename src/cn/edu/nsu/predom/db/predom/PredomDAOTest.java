/**
 * 
 */
package cn.edu.nsu.predom.db.predom;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author ���Ƕ�
 *
 */
public class PredomDAOTest {
	
static PredomDAO pd = new PredomDAO(); 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			getById();
//			getAll();
//			addTest();
			delete();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void getById() throws ClassNotFoundException, SQLException{	
			Predom u = pd.getById(3);
			if(u  == null)
				System.out.println("������!");
			else
				System.out.println(u);
	}
	private  static void getAll() throws ClassNotFoundException, SQLException{
			ArrayList<Predom> users = pd.getAll();
			for(int i = 0;i < users.size();i++){
				System.out.println(users.get(i));
			}
	}
	private static void addTest() throws ClassNotFoundException, SQLException{
		Predom u = new Predom();
		u.setUserGroup_id(1);
		u.setFunction_id(1);
		pd.add(u);
	}
	
	public static void delete() throws ClassNotFoundException, SQLException{
		pd.delete(3);
	}
	

}
