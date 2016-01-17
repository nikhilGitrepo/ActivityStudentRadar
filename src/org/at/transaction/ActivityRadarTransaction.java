/**
 * 
 */
package org.at.transaction;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.at.model.StudentStatistics;
import org.at.service.ActivityRadarService;
import org.at.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * @author Marist User
 *
 */
@Repository
public class ActivityRadarTransaction extends HibernateUtil implements ActivityRadarTransactionDao{

	private static final Logger LOGGER =Logger.getLogger(ActivityRadarTransaction.class);
	
	@Override
	public List<StudentStatistics> getAllStudentStats() {
		
		LOGGER.trace("Nikhil: Into the transaction layer");
		Session session = getSession();
		List<StudentStatistics> statsList = new ArrayList<StudentStatistics>();
		
		try {
			session.getTransaction().begin();

			Query query = session.getNamedQuery("fetchAllStudentStatistics");
			statsList = (List<StudentStatistics>) query.list();
			session.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return statsList;
	}

}
