/**
 * 
 */
package cn.edu.nsu.predom.db.function;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author ���Ƕ�
 * 
 */
public class FunctionDAOTest {
	static FunctionDAO fd = new FunctionDAO();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			getById();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void getById() throws ClassNotFoundException, SQLException {
		Function u = fd.getById(3);
		if (u == null)
			System.out.println("������!");
		else
			System.out.println(u);
	}

	private static void getAll() throws ClassNotFoundException, SQLException {
		ArrayList<Function> users = fd.getAll();
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		Function u = new Function();
		u.setFunction_name("ɾ���û�");
		u.setFunction_note("delete users");
		fd.add(u);
	}

	public static void alterTest() throws ClassNotFoundException, SQLException {
		Function u = new Function();
		u.setFunction_name("ɾ���û�");
		u.setFunction_note("delete users");
		u.setFunction_id(1);
		fd.modify(u);
	}

	public static void delete() throws ClassNotFoundException, SQLException {
		fd.delete(3);
	}
}
