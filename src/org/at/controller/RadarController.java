package org.at.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.at.model.StudentStatistics;
import org.at.model.StudentStatsStub;
import org.at.resources.Courses;
import org.at.resources.RiskCategory;
import org.at.service.ActivityRadarDao;
import org.at.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RadarController{
	
	private static final Logger LOGGER =Logger.getLogger(RadarController.class);
	
	@Autowired
	ActivityRadarDao activityRadar;

	@RequestMapping(value = "/activity/getAllStudentStats",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<StudentStatistics>> getStudentStats(){

		List<StudentStatistics> statsList = new ArrayList<StudentStatistics>();
		
		statsList = activityRadar.getAllStudentStats();

		Collection<StudentStatistics> statistics = statsList;
		
		LOGGER.info("Student Statistics are : " + statistics);
		
		return new ResponseEntity<Collection<StudentStatistics>>(statistics, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/activity/loadAllCourses",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String,String>> loadAllCourses(){
		
		LOGGER.debug("Courses Offered In College are : " + Courses.values());
		
		Map<String,String> courses = new HashMap<>();
		for(Courses c : Courses.values())
			courses.put(c.name(),c.subject);
		
		return new ResponseEntity<Map<String,String>>( courses, HttpStatus.OK);
	
	}
	
	@RequestMapping(value = "/activity/loadRisks",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String,String>> loadRisks(){
	
		LOGGER.debug("Risk types : " + RiskCategory.values());
		
		Map<String,String> risks = new HashMap<>();
		for(RiskCategory r : RiskCategory.values())
			risks.put(r.name(),r.risk);
		
		return new ResponseEntity<Map<String,String>>( risks, HttpStatus.OK);
	
	}
	
}
