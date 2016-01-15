package org.at.resources;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape= JsonFormat.Shape.OBJECT)
public enum RiskCategory {
	
	NO_RISK ("NO RISK"),
	LOW_RISK ("LOW RISK"),
	MEDIUM_RISK ("MEDIUM RISK"),
	HIGH_RISK ("HIGH RISK");

	private String risk;

	RiskCategory(String risk) {
		this.risk = risk;
	}

	//@JsonFormat(shape = JsonFormat.Shape.STRING)
	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}
}
