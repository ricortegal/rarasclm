package es.jclm.cs.rarasclm.entities;// default package
// Generated 26-nov-2015 14:41:38 by Hibernate Tools 4.3.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EnfermedadRara.
 * @see .EnfermedadRara
 * @author Hibernate Tools
 */
@Stateless
public class EnfermedadRaraHome {

    private static final Log log = LogFactory.getLog(EnfermedadRaraHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(EnfermedadRara transientInstance) {
	log.debug("persisting EnfermedadRara instance");
	try {
	    entityManager.persist(transientInstance);
	    log.debug("persist successful");
	} catch (RuntimeException re) {
	    log.error("persist failed", re);
	    throw re;
	}
    }

    public void remove(EnfermedadRara persistentInstance) {
	log.debug("removing EnfermedadRara instance");
	try {
	    entityManager.remove(persistentInstance);
	    log.debug("remove successful");
	} catch (RuntimeException re) {
	    log.error("remove failed", re);
	    throw re;
	}
    }

    public EnfermedadRara merge(EnfermedadRara detachedInstance) {
	log.debug("merging EnfermedadRara instance");
	try {
	    EnfermedadRara result = entityManager.merge(detachedInstance);
	    log.debug("merge successful");
	    return result;
	} catch (RuntimeException re) {
	    log.error("merge failed", re);
	    throw re;
	}
    }

    public EnfermedadRara findById(String id) {
	log.debug("getting EnfermedadRara instance with id: " + id);
	try {
	    EnfermedadRara instance = entityManager.find(EnfermedadRara.class, id);
	    log.debug("get successful");
	    return instance;
	} catch (RuntimeException re) {
	    log.error("get failed", re);
	    throw re;
	}
    }
}
