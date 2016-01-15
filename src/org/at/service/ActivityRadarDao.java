package org.at.service;

import java.util.List;

import org.at.model.StudentStatistics;

public interface ActivityRadarDao {
	
	public List<StudentStatistics> getAllStudentStats();

}
