package cn.edu.nsu.predom.hibernate.auto;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Book
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.edu.nsu.predom.hibernate.auto.Book
 * @author MyEclipse Persistence Tools
 */
public class BookDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(BookDAO.class);
	// property constants
	public static final String BOOK_ISBN = "bookIsbn";
	public static final String BOOK_NAME = "bookName";
	public static final String BOOK_AUTH = "bookAuth";
	public static final String BOOK_PUBLISH = "bookPublish";
	public static final String BOOK_PRICE = "bookPrice";
	public static final String BOOK_FACE = "bookFace";

	protected void initDao() {
		// do nothing
	}

	public void save(Book transientInstance) {
		log.debug("saving Book instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Book persistentInstance) {
		log.debug("deleting Book instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Book findById(java.lang.Integer id) {
		log.debug("getting Book instance with id: " + id);
		try {
			Book instance = (Book) getHibernateTemplate().get(
					"cn.edu.nsu.predom.hibernate.auto.Book", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Book instance) {
		log.debug("finding Book instance by example");
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
		log.debug("finding Book instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Book as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBookIsbn(Object bookIsbn) {
		return findByProperty(BOOK_ISBN, bookIsbn);
	}

	public List findByBookName(Object bookName) {
		return findByProperty(BOOK_NAME, bookName);
	}

	public List findByBookAuth(Object bookAuth) {
		return findByProperty(BOOK_AUTH, bookAuth);
	}

	public List findByBookPublish(Object bookPublish) {
		return findByProperty(BOOK_PUBLISH, bookPublish);
	}

	public List findByBookPrice(Object bookPrice) {
		return findByProperty(BOOK_PRICE, bookPrice);
	}

	public List findByBookFace(Object bookFace) {
		return findByProperty(BOOK_FACE, bookFace);
	}

	public List findAll() {
		log.debug("finding all Book instances");
		try {
			String queryString = "from Book";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Book merge(Book detachedInstance) {
		log.debug("merging Book instance");
		try {
			Book result = (Book) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Book instance) {
		log.debug("attaching dirty Book instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Book instance) {
		log.debug("attaching clean Book instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BookDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BookDAO) ctx.getBean("BookDAO");
	}
}