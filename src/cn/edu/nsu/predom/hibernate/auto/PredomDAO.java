package cn.edu.nsu.predom.hibernate.auto;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Predom entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.nsu.predom.hibernate.auto.Predom
 * @author MyEclipse Persistence Tools
 */
public class PredomDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(PredomDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Predom transientInstance) {
		log.debug("saving Predom instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Predom persistentInstance) {
		log.debug("deleting Predom instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Predom findById(java.lang.Integer id) {
		log.debug("getting Predom instance with id: " + id);
		try {
			Predom instance = (Predom) getHibernateTemplate().get(
					"cn.edu.nsu.predom.hibernate.auto.Predom", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Predom instance) {
		log.debug("finding Predom instance by example");
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
		log.debug("finding Predom instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Predom as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Predom instances");
		try {
			String queryString = "from Predom";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Predom merge(Predom detachedInstance) {
		log.debug("merging Predom instance");
		try {
			Predom result = (Predom) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Predom instance) {
		log.debug("attaching dirty Predom instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Predom instance) {
		log.debug("attaching clean Predom instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PredomDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PredomDAO) ctx.getBean("PredomDAO");
	}
}