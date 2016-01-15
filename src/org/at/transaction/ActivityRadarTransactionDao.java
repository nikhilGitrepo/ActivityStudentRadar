package org.at.transaction;

import java.util.List;

import org.at.model.StudentStatistics;
import org.springframework.stereotype.Repository;

public interface ActivityRadarTransactionDao {
	
	public List<StudentStatistics> getAllStudentStats();

}
