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
		//加载hibernate配置
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//获得sessionfactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//开辟一个session
		Session session = sessionFactory.openSession();
		//开启事务
		Transaction transaction = session.beginTransaction();
		
		/*Users u = (Users)session.get(Users.class, 529);
		System.out.println(u);*/
		//HQL,Users指持久类
		
		/*Query query = session.createQuery("from Users");
		List<Users> users = query.list();
		System.out.println(users);*/
		/*u.setUser_name("yy");
		//修改持久化对象
		session.update(u);*/
		//删除持久化对象
		//session.delete(u);
		//添加一个对象用new
//		Users u = new Users();
		//关系映射
		Users u = (Users)session.get(Users.class, 529);
		System.out.println(u);
		System.out.println(u.getUserGroup());
		//提交事务
		transaction.commit();
		//关闭session
		session.close();
	}
}
