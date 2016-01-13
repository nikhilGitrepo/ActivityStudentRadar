package org.at.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.at.pojo.StudentStatistics;
import org.at.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RadarController extends HibernateUtil {

	private static Map<String,StudentStatistics> stats;
	
	static StudentStatistics s1,s2;
	
	private static StudentStatistics save(StudentStatistics student){
		
		if(stats == null){
			stats = new HashMap<String,StudentStatistics>();
		}
		
		stats.put(student.getAlternative_id(), student);
		return student;
	}
	
	static{
		//s1 = new StudentStatistics("STUDENT12", "MNG_333N_222_08F", "Management", 22, 2, 4, 97.9625, 1.5, 0.5, 1, 2.948312, "NO RISK");
		//s2 = new StudentStatistics("STUDENT13", "MNG_333N_222_08F", "Management", 22, 2, 3.8729, 25, 1.71056, 0.5, 2.5, 2.00949, "NO RISK");
		s1 = new StudentStatistics();
		s2 = new StudentStatistics();
		save(s1);
		save(s2);
		
	}
	
	@RequestMapping(value = "/activity/getAllStudentStats",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<StudentStatistics>> getStudentStats(){

		
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
		
		Collection<StudentStatistics> statistics = statsList;
		System.out.println("*****Student Statistics are ***** : " + statistics);
		
		return new ResponseEntity<Collection<StudentStatistics>>(statistics, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/activity/addAllStudentStats",
				method = RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentStatistics> addStudentStats(){
	
		Session session = getSession();
		try {
			session.getTransaction().begin();
	
			session.saveOrUpdate(s1);
			session.saveOrUpdate(s2);
			
			session.getTransaction().commit();
			
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();			
		}
		
		return new ResponseEntity<StudentStatistics>(s2, HttpStatus.OK);
	
	}
	
}
