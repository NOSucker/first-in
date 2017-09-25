/**
 * 
 */
package cn.edu.nsu.predom.hibernate.menual;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * @author LZG
 *
 */
public class UsersDAO {
	
	public static void main(String[] args) {
		//����hibernate����
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//���sessionfactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//����һ��session
		Session session = sessionFactory.openSession();
		//��������
		Transaction transaction = session.beginTransaction();
		
		/*Users u = (Users)session.get(Users.class, 529);
		System.out.println(u);*/
		//HQL,Usersָ�־���
		
		/*Query query = session.createQuery("from Users");
		List<Users> users = query.list();
		System.out.println(users);*/
		/*u.setUser_name("yy");
		//�޸ĳ־û�����
		session.update(u);*/
		//ɾ���־û�����
		//session.delete(u);
		//���һ��������new
//		Users u = new Users();
		//��ϵӳ��
		Users u = (Users)session.get(Users.class, 529);
		System.out.println(u);
		System.out.println(u.getUserGroup());
		//�ύ����
		transaction.commit();
		//�ر�session
		session.close();
	}
}
