package org.at.resources;

public enum RiskCategory {
	
	NO_RISK ("NO RISK"),
	LOW_RISK ("LOW RISK"),
	MEDIUM_RISK ("MEDIUM RISK"),
	HIGH_RISK ("HIGH RISK");

	public String risk;

	RiskCategory(String risk) {
		this.risk = risk;
	}
}
