package org.at.model;

import java.util.ArrayList;
import java.util.List;

public class StudentStatsStub {
	
	private List<StudentStatistics> statistics = new ArrayList<StudentStatistics>();

	public StudentStatsStub(List<StudentStatistics> statistics) {
		this.statistics = statistics;
	}

	public StudentStatsStub() {
	}

	public List<StudentStatistics> getStatistics() {
		return statistics;
	}

	public void setStatistics(List<StudentStatistics> statistics) {
		this.statistics = statistics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statistics == null) ? 0 : statistics.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentStatsStub other = (StudentStatsStub) obj;
		if (statistics == null) {
			if (other.statistics != null)
				return false;
		} else if (!statistics.equals(other.statistics))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentStatsStub [statistics=" + statistics + "]";
	}
	
}
