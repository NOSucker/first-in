package cn.edu.nsu.predom.hibernate.auto;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserGroup entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.nsu.predom.hibernate.auto.UserGroup
 * @author MyEclipse Persistence Tools
 */
public class UserGroupDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(UserGroupDAO.class);
	// property constants
	public static final String USER_GROUP_NAME = "userGroupName";

	protected void initDao() {
		// do nothing
	}

	public void save(UserGroup transientInstance) {
		log.debug("saving UserGroup instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserGroup persistentInstance) {
		log.debug("deleting UserGroup instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserGroup findById(java.lang.Integer id) {
		log.debug("getting UserGroup instance with id: " + id);
		try {
			UserGroup instance = (UserGroup) getHibernateTemplate().get(
					"cn.edu.nsu.predom.hibernate.auto.UserGroup", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserGroup instance) {
		log.debug("finding UserGroup instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserGroup instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserGroup as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserGroupName(Object userGroupName) {
		return findByProperty(USER_GROUP_NAME, userGroupName);
	}

	public List findAll() {
		log.debug("finding all UserGroup instances");
		try {
			String queryString = "from UserGroup";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserGroup merge(UserGroup detachedInstance) {
		log.debug("merging UserGroup instance");
		try {
			UserGroup result = (UserGroup) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserGroup instance) {
		log.debug("attaching dirty UserGroup instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserGroup instance) {
		log.debug("attaching clean UserGroup instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UserGroupDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserGroupDAO) ctx.getBean("UserGroupDAO");
	}
}