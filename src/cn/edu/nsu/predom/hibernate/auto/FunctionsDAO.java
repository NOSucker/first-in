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
 * Functions entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.nsu.predom.hibernate.auto.Functions
 * @author MyEclipse Persistence Tools
 */
public class FunctionsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(FunctionsDAO.class);
	// property constants
	public static final String FUNCTION_NAME = "functionName";
	public static final String FUNCTION_NOTE = "functionNote";

	protected void initDao() {
		// do nothing
	}

	public void save(Functions transientInstance) {
		log.debug("saving Functions instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Functions persistentInstance) {
		log.debug("deleting Functions instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Functions findById(java.lang.Integer id) {
		log.debug("getting Functions instance with id: " + id);
		try {
			Functions instance = (Functions) getHibernateTemplate().get(
					"cn.edu.nsu.predom.hibernate.auto.Functions", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Functions instance) {
		log.debug("finding Functions instance by example");
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
		log.debug("finding Functions instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Functions as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFunctionName(Object functionName) {
		return findByProperty(FUNCTION_NAME, functionName);
	}

	public List findByFunctionNote(Object functionNote) {
		return findByProperty(FUNCTION_NOTE, functionNote);
	}

	public List findAll() {
		log.debug("finding all Functions instances");
		try {
			String queryString = "from Functions";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Functions merge(Functions detachedInstance) {
		log.debug("merging Functions instance");
		try {
			Functions result = (Functions) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Functions instance) {
		log.debug("attaching dirty Functions instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Functions instance) {
		log.debug("attaching clean Functions instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FunctionsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FunctionsDAO) ctx.getBean("FunctionsDAO");
	}
}