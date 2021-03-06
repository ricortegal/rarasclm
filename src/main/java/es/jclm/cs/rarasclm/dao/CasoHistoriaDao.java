package es.jclm.cs.rarasclm.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import es.jclm.cs.rarasclm.entities.CasoHistoria;
import es.jclm.cs.rarasclm.entities.CasoHistoriaId;

@Repository
public class CasoHistoriaDao extends BaseEntityDao<CasoHistoria,CasoHistoriaId>{
	
	private static final Logger log = LoggerFactory.getLogger(CasoHistoriaDao.class);
	
	public int getVersion(String caso) {
		Session session = getSessionFactory().openSession();
		try {
			Query queryCount = session.createQuery("SELECT count(*) FROM CasoHistoria ch WHERE ch.id.idCaso=:caso");
			long num = Integer.parseInt(queryCount.setParameter("caso", caso).uniqueResult().toString());
			if(num==0)
				return 1;
			
			Query queryMax = session.createQuery("SELECT max(ch.id.idVersion) FROM CasoHistoria ch WHERE ch.id.idCaso=:caso");
			int ret = Integer.parseInt(queryMax.setParameter("caso", caso).uniqueResult().toString());
			if(ret==-1)
				return 1;
			else
				return ret+1;
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			return 1;
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
