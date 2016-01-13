/**
 * 
 */
package org.at.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Nikhil
 *
 */
@Entity
@Table(name="StudentStatistics")
@NamedQueries({
	@NamedQuery(
	name = "fetchAllStudentStatistics",
	query = "from StudentStatistics"
	)
})
public class StudentStatistics implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String ALTERNATIVE_ID;
	private String COURSE_ID;
	private String SUBJECT;
	private String ONLINE_FLAG;
	private String ENROLLMENT;
	private Double RC_FINAL_GRADE;
	private Integer PERCENTILE;
	private Integer SAT_VERBAL;
	private Integer SAT_MATH;
	private Integer APTITUDE_SCORE;
	private Integer AGE;
	private Integer RC_GENDER;
	private String RC_ENROLLMENT_STATUS;
	private String RC_CLASS_CODE;
	private Double GPA_CUMULATIVE;
	private Double GPA_SEMESTER;
	private String STANDING;
	private Double RMN_SCORE;
	private Double RMN_SCORE_PARTIAL;
	private Double R_CONTENT_READ;
	private String R_ASSMT_SUB;
	private Double R_FORUM_POST;
	private Double R_FORUM_READ;
	private Double R_LESSONS_VIEW;
	private Double R_ASSMT_TAKE;
	private Double R_ASN_SUB;
	private Double R_ASN_READ;
	private Double R_SESSIONS;
	private String ACADEMIC_RISK;
	private Double FAIL_PROBABILITY;
	private Double PASS_PROBABILITY;
	private String MODEL_RISK_CONFIDENCE;
	
	public StudentStatistics() {
	}

	public StudentStatistics(String ALTERNATIVE_ID, String COURSE_ID, String SUBJECT, Integer AGE, Integer RC_GENDER,
			Double GPA_CUMULATIVE, Double RMN_SCORE, Double R_CONTENT_READ, Double R_FORUM_POST,
			Double R_ASN_SUB, Double R_SESSIONS, String MODEL_RISK_CONFIDENCE) {

		this.ALTERNATIVE_ID = ALTERNATIVE_ID;
		this.COURSE_ID = COURSE_ID;
		this.SUBJECT = SUBJECT;
		this.AGE = AGE;
		this.RC_GENDER = RC_GENDER;
		this.GPA_CUMULATIVE = GPA_CUMULATIVE;
		this.RMN_SCORE = RMN_SCORE;
		this.R_CONTENT_READ = R_CONTENT_READ;
		this.R_FORUM_POST = R_FORUM_POST;
		this.R_ASN_SUB = R_ASN_SUB;
		this.R_SESSIONS = R_SESSIONS;
		this.MODEL_RISK_CONFIDENCE = MODEL_RISK_CONFIDENCE;
	}

	@Id
	@Column(nullable = false)
	public String getALTERNATIVE_ID() {
		return ALTERNATIVE_ID;
	}

	public void setALTERNATIVE_ID(String ALTERNATIVE_ID) {
		this.ALTERNATIVE_ID = ALTERNATIVE_ID;
	}

	@Column(nullable = true)
	public String getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(String COURSE_ID) {
		this.COURSE_ID = COURSE_ID;
	}

	@Column(nullable = true)
	public String getSUBJECT() {
		return SUBJECT;
	}

	public void setSUBJECT(String SUBJECT) {
		this.SUBJECT = SUBJECT;
	}

	@Column(nullable = true)
	public String getONLINE_FLAG() {
		return ONLINE_FLAG;
	}

	public void setONLINE_FLAG(String ONLINE_FLAG) {
		this.ONLINE_FLAG = ONLINE_FLAG;
	}

	@Column(nullable = true)
	public String getENROLLMENT() {
		return ENROLLMENT;
	}

	public void setENROLLMENT(String ENROLLMENT) {
		this.ENROLLMENT = ENROLLMENT;
	}

	@Column(nullable = true)
	public Double getRC_FINAL_GRADE() {
		return RC_FINAL_GRADE;
	}

	public void setRC_FINAL_GRADE(Double RC_FINAL_GRADE) {
		this.RC_FINAL_GRADE = RC_FINAL_GRADE;
	}

	@Column(nullable = true)
	public Integer getPERCENTILE() {
		return PERCENTILE;
	}

	public void setPERCENTILE(Integer PERCENTILE) {
		this.PERCENTILE = PERCENTILE;
	}

	@Column(nullable = true)
	public Integer getSAT_VERBAL() {
		return SAT_VERBAL;
	}

	public void setSAT_VERBAL(Integer SAT_VERBAL) {
		this.SAT_VERBAL = SAT_VERBAL;
	}

	@Column(nullable = true)
	public Integer getSAT_MATH() {
		return SAT_MATH;
	}

	public void setSAT_MATH(Integer SAT_MATH) {
		this.SAT_MATH = SAT_MATH;
	}

	@Column(nullable = true)
	public Integer getAPTITUDE_SCORE() {
		return APTITUDE_SCORE;
	}

	public void setAPTITUDE_SCORE(Integer APTITUDE_SCORE) {
		this.APTITUDE_SCORE = APTITUDE_SCORE;
	}

	@Column(nullable = true)
	public Integer getAGE() {
		return AGE;
	}

	public void setAGE(Integer AGE) {
		this.AGE = AGE;
	}

	@Column(nullable = true)
	public Integer getRC_GENDER() {
		return RC_GENDER;
	}

	public void setRC_GENDER(Integer RC_GENDER) {
		this.RC_GENDER = RC_GENDER;
	}

	@Column(nullable = true)
	public String getRC_ENROLLMENT_STATUS() {
		return RC_ENROLLMENT_STATUS;
	}

	public void setRC_ENROLLMENT_STATUS(String RC_ENROLLMENT_STATUS) {
		this.RC_ENROLLMENT_STATUS = RC_ENROLLMENT_STATUS;
	}

	@Column(nullable = true)
	public String getRC_CLASS_CODE() {
		return RC_CLASS_CODE;
	}

	public void setRC_CLASS_CODE(String RC_CLASS_CODE) {
		this.RC_CLASS_CODE = RC_CLASS_CODE;
	}

	@Column(nullable = true)
	public Double getGPA_CUMULATIVE() {
		return GPA_CUMULATIVE;
	}

	public void setGPA_CUMULATIVE(Double GPA_CUMULATIVE) {
		this.GPA_CUMULATIVE = GPA_CUMULATIVE;
	}

	@Column(nullable = true)
	public Double getGPA_SEMESTER() {
		return GPA_SEMESTER;
	}

	public void setGPA_SEMESTER(Double GPA_SEMESTER) {
		this.GPA_SEMESTER = GPA_SEMESTER;
	}

	@Column(nullable = true)
	public String getSTANDING() {
		return STANDING;
	}

	public void setSTANDING(String STANDING) {
		this.STANDING = STANDING;
	}

	@Column(nullable = true)
	public Double getRMN_SCORE() {
		return RMN_SCORE;
	}

	public void setRMN_SCORE(Double RMN_SCORE) {
		this.RMN_SCORE = RMN_SCORE;
	}

	@Column(nullable = true)
	public Double getRMN_SCORE_PARTIAL() {
		return RMN_SCORE_PARTIAL;
	}

	public void setRMN_SCORE_PARTIAL(Double RMN_SCORE_PARTIAL) {
		this.RMN_SCORE_PARTIAL = RMN_SCORE_PARTIAL;
	}

	@Column(nullable = true)
	public Double getR_CONTENT_READ() {
		return R_CONTENT_READ;
	}

	public void setR_CONTENT_READ(Double R_CONTENT_READ) {
		this.R_CONTENT_READ = R_CONTENT_READ;
	}

	@Column(nullable = true)
	public String getR_ASSMT_SUB() {
		return R_ASSMT_SUB;
	}

	public void setR_ASSMT_SUB(String R_ASSMT_SUB) {
		this.R_ASSMT_SUB = R_ASSMT_SUB;
	}

	@Column(nullable = true)
	public Double getR_FORUM_POST() {
		return R_FORUM_POST;
	}

	public void setR_FORUM_POST(Double R_FORUM_POST) {
		this.R_FORUM_POST = R_FORUM_POST;
	}

	@Column(nullable = true)
	public Double getR_FORUM_READ() {
		return R_FORUM_READ;
	}

	public void setR_FORUM_READ(Double R_FORUM_READ) {
		this.R_FORUM_READ = R_FORUM_READ;
	}

	@Column(nullable = true)
	public Double getR_LESSONS_VIEW() {
		return R_LESSONS_VIEW;
	}

	public void setR_LESSONS_VIEW(Double R_LESSONS_VIEW) {
		this.R_LESSONS_VIEW = R_LESSONS_VIEW;
	}

	@Column(nullable = true)
	public Double getR_ASSMT_TAKE() {
		return R_ASSMT_TAKE;
	}

	public void setR_ASSMT_TAKE(Double R_ASSMT_TAKE) {
		this.R_ASSMT_TAKE = R_ASSMT_TAKE;
	}

	@Column(nullable = true)
	public Double getR_ASN_SUB() {
		return R_ASN_SUB;
	}

	public void setR_ASN_SUB(Double R_ASN_SUB) {
		this.R_ASN_SUB = R_ASN_SUB;
	}

	@Column(nullable = true)
	public Double getR_ASN_READ() {
		return R_ASN_READ;
	}

	public void setR_ASN_READ(Double R_ASN_READ) {
		this.R_ASN_READ = R_ASN_READ;
	}

	@Column(nullable = true)
	public Double getR_SESSIONS() {
		return R_SESSIONS;
	}

	public void setR_SESSIONS(Double R_SESSIONS) {
		this.R_SESSIONS = R_SESSIONS;
	}

	@Column(nullable = true)
	public String getACADEMIC_RISK() {
		return ACADEMIC_RISK;
	}

	public void setACADEMIC_RISK(String ACADEMIC_RISK) {
		this.ACADEMIC_RISK = ACADEMIC_RISK;
	}

	@Column(nullable = true)
	public Double getFAIL_PROBABILITY() {
		return FAIL_PROBABILITY;
	}

	public void setFAIL_PROBABILITY(Double FAIL_PROBABILITY) {
		this.FAIL_PROBABILITY = FAIL_PROBABILITY;
	}

	@Column(nullable = true)
	public Double getPASS_PROBABILITY() {
		return PASS_PROBABILITY;
	}

	public void setPASS_PROBABILITY(Double PASS_PROBABILITY) {
		this.PASS_PROBABILITY = PASS_PROBABILITY;
	}

	@Column(nullable = true)
	public String getMODEL_RISK_CONFIDENCE() {
		return MODEL_RISK_CONFIDENCE;
	}

	public void setMODEL_RISK_CONFIDENCE(String MODEL_RISK_CONFIDENCE) {
		this.MODEL_RISK_CONFIDENCE = MODEL_RISK_CONFIDENCE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ACADEMIC_RISK == null) ? 0 : ACADEMIC_RISK.hashCode());
		result = prime * result + ((AGE == null) ? 0 : AGE.hashCode());
		result = prime * result + ((ALTERNATIVE_ID == null) ? 0 : ALTERNATIVE_ID.hashCode());
		result = prime * result + ((APTITUDE_SCORE == null) ? 0 : APTITUDE_SCORE.hashCode());
		result = prime * result + ((COURSE_ID == null) ? 0 : COURSE_ID.hashCode());
		result = prime * result + ((ENROLLMENT == null) ? 0 : ENROLLMENT.hashCode());
		result = prime * result + ((FAIL_PROBABILITY == null) ? 0 : FAIL_PROBABILITY.hashCode());
		result = prime * result + ((GPA_CUMULATIVE == null) ? 0 : GPA_CUMULATIVE.hashCode());
		result = prime * result + ((GPA_SEMESTER == null) ? 0 : GPA_SEMESTER.hashCode());
		result = prime * result + ((MODEL_RISK_CONFIDENCE == null) ? 0 : MODEL_RISK_CONFIDENCE.hashCode());
		result = prime * result + ((ONLINE_FLAG == null) ? 0 : ONLINE_FLAG.hashCode());
		result = prime * result + ((PASS_PROBABILITY == null) ? 0 : PASS_PROBABILITY.hashCode());
		result = prime * result + ((PERCENTILE == null) ? 0 : PERCENTILE.hashCode());
		result = prime * result + ((R_ASN_READ == null) ? 0 : R_ASN_READ.hashCode());
		result = prime * result + ((R_ASN_SUB == null) ? 0 : R_ASN_SUB.hashCode());
		result = prime * result + ((R_ASSMT_SUB == null) ? 0 : R_ASSMT_SUB.hashCode());
		result = prime * result + ((R_ASSMT_TAKE == null) ? 0 : R_ASSMT_TAKE.hashCode());
		result = prime * result + ((R_CONTENT_READ == null) ? 0 : R_CONTENT_READ.hashCode());
		result = prime * result + ((R_FORUM_POST == null) ? 0 : R_FORUM_POST.hashCode());
		result = prime * result + ((R_FORUM_READ == null) ? 0 : R_FORUM_READ.hashCode());
		result = prime * result + ((R_LESSONS_VIEW == null) ? 0 : R_LESSONS_VIEW.hashCode());
		result = prime * result + ((R_SESSIONS == null) ? 0 : R_SESSIONS.hashCode());
		result = prime * result + ((RC_CLASS_CODE == null) ? 0 : RC_CLASS_CODE.hashCode());
		result = prime * result + ((RC_ENROLLMENT_STATUS == null) ? 0 : RC_ENROLLMENT_STATUS.hashCode());
		result = prime * result + ((RC_FINAL_GRADE == null) ? 0 : RC_FINAL_GRADE.hashCode());
		result = prime * result + ((RC_GENDER == null) ? 0 : RC_GENDER.hashCode());
		result = prime * result + ((RMN_SCORE == null) ? 0 : RMN_SCORE.hashCode());
		result = prime * result + ((RMN_SCORE_PARTIAL == null) ? 0 : RMN_SCORE_PARTIAL.hashCode());
		result = prime * result + ((SAT_MATH == null) ? 0 : SAT_MATH.hashCode());
		result = prime * result + ((SAT_VERBAL == null) ? 0 : SAT_VERBAL.hashCode());
		result = prime * result + ((STANDING == null) ? 0 : STANDING.hashCode());
		result = prime * result + ((SUBJECT == null) ? 0 : SUBJECT.hashCode());
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
		StudentStatistics other = (StudentStatistics) obj;
		if (ACADEMIC_RISK == null) {
			if (other.ACADEMIC_RISK != null)
				return false;
		} else if (!ACADEMIC_RISK.equals(other.ACADEMIC_RISK))
			return false;
		if (AGE == null) {
			if (other.AGE != null)
				return false;
		} else if (!AGE.equals(other.AGE))
			return false;
		if (ALTERNATIVE_ID == null) {
			if (other.ALTERNATIVE_ID != null)
				return false;
		} else if (!ALTERNATIVE_ID.equals(other.ALTERNATIVE_ID))
			return false;
		if (APTITUDE_SCORE == null) {
			if (other.APTITUDE_SCORE != null)
				return false;
		} else if (!APTITUDE_SCORE.equals(other.APTITUDE_SCORE))
			return false;
		if (COURSE_ID == null) {
			if (other.COURSE_ID != null)
				return false;
		} else if (!COURSE_ID.equals(other.COURSE_ID))
			return false;
		if (ENROLLMENT == null) {
			if (other.ENROLLMENT != null)
				return false;
		} else if (!ENROLLMENT.equals(other.ENROLLMENT))
			return false;
		if (FAIL_PROBABILITY == null) {
			if (other.FAIL_PROBABILITY != null)
				return false;
		} else if (!FAIL_PROBABILITY.equals(other.FAIL_PROBABILITY))
			return false;
		if (GPA_CUMULATIVE == null) {
			if (other.GPA_CUMULATIVE != null)
				return false;
		} else if (!GPA_CUMULATIVE.equals(other.GPA_CUMULATIVE))
			return false;
		if (GPA_SEMESTER == null) {
			if (other.GPA_SEMESTER != null)
				return false;
		} else if (!GPA_SEMESTER.equals(other.GPA_SEMESTER))
			return false;
		if (MODEL_RISK_CONFIDENCE == null) {
			if (other.MODEL_RISK_CONFIDENCE != null)
				return false;
		} else if (!MODEL_RISK_CONFIDENCE.equals(other.MODEL_RISK_CONFIDENCE))
			return false;
		if (ONLINE_FLAG == null) {
			if (other.ONLINE_FLAG != null)
				return false;
		} else if (!ONLINE_FLAG.equals(other.ONLINE_FLAG))
			return false;
		if (PASS_PROBABILITY == null) {
			if (other.PASS_PROBABILITY != null)
				return false;
		} else if (!PASS_PROBABILITY.equals(other.PASS_PROBABILITY))
			return false;
		if (PERCENTILE == null) {
			if (other.PERCENTILE != null)
				return false;
		} else if (!PERCENTILE.equals(other.PERCENTILE))
			return false;
		if (R_ASN_READ == null) {
			if (other.R_ASN_READ != null)
				return false;
		} else if (!R_ASN_READ.equals(other.R_ASN_READ))
			return false;
		if (R_ASN_SUB == null) {
			if (other.R_ASN_SUB != null)
				return false;
		} else if (!R_ASN_SUB.equals(other.R_ASN_SUB))
			return false;
		if (R_ASSMT_SUB == null) {
			if (other.R_ASSMT_SUB != null)
				return false;
		} else if (!R_ASSMT_SUB.equals(other.R_ASSMT_SUB))
			return false;
		if (R_ASSMT_TAKE == null) {
			if (other.R_ASSMT_TAKE != null)
				return false;
		} else if (!R_ASSMT_TAKE.equals(other.R_ASSMT_TAKE))
			return false;
		if (R_CONTENT_READ == null) {
			if (other.R_CONTENT_READ != null)
				return false;
		} else if (!R_CONTENT_READ.equals(other.R_CONTENT_READ))
			return false;
		if (R_FORUM_POST == null) {
			if (other.R_FORUM_POST != null)
				return false;
		} else if (!R_FORUM_POST.equals(other.R_FORUM_POST))
			return false;
		if (R_FORUM_READ == null) {
			if (other.R_FORUM_READ != null)
				return false;
		} else if (!R_FORUM_READ.equals(other.R_FORUM_READ))
			return false;
		if (R_LESSONS_VIEW == null) {
			if (other.R_LESSONS_VIEW != null)
				return false;
		} else if (!R_LESSONS_VIEW.equals(other.R_LESSONS_VIEW))
			return false;
		if (R_SESSIONS == null) {
			if (other.R_SESSIONS != null)
				return false;
		} else if (!R_SESSIONS.equals(other.R_SESSIONS))
			return false;
		if (RC_CLASS_CODE == null) {
			if (other.RC_CLASS_CODE != null)
				return false;
		} else if (!RC_CLASS_CODE.equals(other.RC_CLASS_CODE))
			return false;
		if (RC_ENROLLMENT_STATUS == null) {
			if (other.RC_ENROLLMENT_STATUS != null)
				return false;
		} else if (!RC_ENROLLMENT_STATUS.equals(other.RC_ENROLLMENT_STATUS))
			return false;
		if (RC_FINAL_GRADE == null) {
			if (other.RC_FINAL_GRADE != null)
				return false;
		} else if (!RC_FINAL_GRADE.equals(other.RC_FINAL_GRADE))
			return false;
		if (RC_GENDER == null) {
			if (other.RC_GENDER != null)
				return false;
		} else if (!RC_GENDER.equals(other.RC_GENDER))
			return false;
		if (RMN_SCORE == null) {
			if (other.RMN_SCORE != null)
				return false;
		} else if (!RMN_SCORE.equals(other.RMN_SCORE))
			return false;
		if (RMN_SCORE_PARTIAL == null) {
			if (other.RMN_SCORE_PARTIAL != null)
				return false;
		} else if (!RMN_SCORE_PARTIAL.equals(other.RMN_SCORE_PARTIAL))
			return false;
		if (SAT_MATH == null) {
			if (other.SAT_MATH != null)
				return false;
		} else if (!SAT_MATH.equals(other.SAT_MATH))
			return false;
		if (SAT_VERBAL == null) {
			if (other.SAT_VERBAL != null)
				return false;
		} else if (!SAT_VERBAL.equals(other.SAT_VERBAL))
			return false;
		if (STANDING == null) {
			if (other.STANDING != null)
				return false;
		} else if (!STANDING.equals(other.STANDING))
			return false;
		if (SUBJECT == null) {
			if (other.SUBJECT != null)
				return false;
		} else if (!SUBJECT.equals(other.SUBJECT))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentStatistics [ALTERNATIVE_ID=" + ALTERNATIVE_ID + ", COURSE_ID=" + COURSE_ID + ", SUBJECT="
				+ SUBJECT + ", ONLINE_FLAG=" + ONLINE_FLAG + ", ENROLLMENT=" + ENROLLMENT + ", RC_FINAL_GRADE="
				+ RC_FINAL_GRADE + ", PERCENTILE=" + PERCENTILE + ", SAT_VERBAL=" + SAT_VERBAL + ", SAT_MATH="
				+ SAT_MATH + ", APTITUDE_SCORE=" + APTITUDE_SCORE + ", AGE=" + AGE + ", RC_GENDER=" + RC_GENDER
				+ ", RC_ENROLLMENT_STATUS=" + RC_ENROLLMENT_STATUS + ", RC_CLASS_CODE=" + RC_CLASS_CODE
				+ ", GPA_CUMULATIVE=" + GPA_CUMULATIVE + ", GPA_SEMESTER=" + GPA_SEMESTER + ", STANDING=" + STANDING
				+ ", RMN_SCORE=" + RMN_SCORE + ", RMN_SCORE_PARTIAL=" + RMN_SCORE_PARTIAL + ", R_CONTENT_READ="
				+ R_CONTENT_READ + ", R_ASSMT_SUB=" + R_ASSMT_SUB + ", R_FORUM_POST=" + R_FORUM_POST + ", R_FORUM_READ="
				+ R_FORUM_READ + ", R_LESSONS_VIEW=" + R_LESSONS_VIEW + ", R_ASSMT_TAKE=" + R_ASSMT_TAKE
				+ ", R_ASN_SUB=" + R_ASN_SUB + ", R_ASN_READ=" + R_ASN_READ + ", R_SESSIONS=" + R_SESSIONS
				+ ", ACADEMIC_RISK=" + ACADEMIC_RISK + ", FAIL_PROBABILITY=" + FAIL_PROBABILITY + ", PASS_PROBABILITY="
				+ PASS_PROBABILITY + ", MODEL_RISK_CONFIDENCE=" + MODEL_RISK_CONFIDENCE + "]";
	}
}
