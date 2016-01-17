/**
 * 
 */
package org.at.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.at.controller.RadarController;
import org.at.model.StudentStatistics;
import org.at.transaction.ActivityRadarTransactionDao;
import org.at.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marist User
 *
 */
@Service("activityRadarService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ActivityRadarService  extends HibernateUtil implements ActivityRadarDao{
	
	private static final Logger LOGGER =Logger.getLogger(ActivityRadarService.class);

	@Autowired
	ActivityRadarTransactionDao ActivityRadarTrnDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<StudentStatistics> getAllStudentStats() {

		LOGGER.trace("Nikhil: Into the transaction layer");
		
		List<StudentStatistics> statsList = new ArrayList<StudentStatistics>();
		
		statsList = ActivityRadarTrnDao.getAllStudentStats();
		
		return statsList;
	}

}
