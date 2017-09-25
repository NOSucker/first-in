package cn.edu.nsu.predom.hibernate.auto;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Buy
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.nsu.predom.hibernate.auto.Buy
 * @author MyEclipse Persistence Tools
 */
public class BuyDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(BuyDAO.class);
	// property constants
	public static final String BUY_NUM = "buyNum";

	protected void initDao() {
		// do nothing
	}

	public void save(Buy transientInstance) {
		log.debug("saving Buy instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Buy persistentInstance) {
		log.debug("deleting Buy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Buy findById(java.lang.Integer id) {
		log.debug("getting Buy instance with id: " + id);
		try {
			Buy instance = (Buy) getHibernateTemplate().get(
					"cn.edu.nsu.predom.hibernate.auto.Buy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Buy instance) {
		log.debug("finding Buy instance by example");
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
		log.debug("finding Buy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Buy as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBuyNum(Object buyNum) {
		return findByProperty(BUY_NUM, buyNum);
	}

	public List findAll() {
		log.debug("finding all Buy instances");
		try {
			String queryString = "from Buy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Buy merge(Buy detachedInstance) {
		log.debug("merging Buy instance");
		try {
			Buy result = (Buy) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Buy instance) {
		log.debug("attaching dirty Buy instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Buy instance) {
		log.debug("attaching clean Buy instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BuyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BuyDAO) ctx.getBean("BuyDAO");
	}
}