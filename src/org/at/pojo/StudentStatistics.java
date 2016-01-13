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
	
	private String alternative_id;
	private String course_id;
	private String subject;
	private String online_flag;
	private String enrollment;
	private Double rc_final_grade;
	private Integer percentile;
	private Integer sat_verbal;
	private Integer sat_math;
	private Integer aptitude_score;
	private Integer age;
	private Integer rc_gender;
	private String rc_enrollment_status;
	private String rc_class_code;
	private Double gpa_cumulative;
	private Double gpa_semester;
	private String standing;
	private Double rmn_score;
	private Double rmn_score_partial;
	private Double r_content_read;
	private String r_assmt_sub;
	private Double r_forum_post;
	private Double r_forum_read;
	private Double r_lessons_view;
	private Double r_assmt_take;
	private Double r_asn_sub;
	private Double r_asn_read;
	private Double r_sessions;
	private String academic_risk;
	private Double fail_probability;
	private Double pass_probability;
	private String model_risk_confidence;
	
	public StudentStatistics() {
	}

	public StudentStatistics(String alternative_id, String course_id, String subject, Integer age, Integer rc_gender,
			Double gpa_cumulative, Double rmn_score, Double r_content_read, Double r_forum_post,
			Double r_asn_sub, Double r_sessions, String model_risk_confidence) {

		this.alternative_id = alternative_id;
		this.course_id = course_id;
		this.subject = subject;
		this.age = age;
		this.rc_gender = rc_gender;
		this.gpa_cumulative = gpa_cumulative;
		this.rmn_score = rmn_score;
		this.r_content_read = r_content_read;
		this.r_forum_post = r_forum_post;
		this.r_asn_sub = r_asn_sub;
		this.r_sessions = r_sessions;
		this.model_risk_confidence = model_risk_confidence;
	}

	@Id
	@Column(nullable = false)
	public String getAlternative_id() {
		return alternative_id;
	}

	public void setAlternative_id(String alternative_id) {
		this.alternative_id = alternative_id;
	}

	@Column(nullable = true)
	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	@Column(nullable = true)
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(nullable = true)
	public String getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag(String online_flag) {
		this.online_flag = online_flag;
	}

	@Column(nullable = true)
	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	@Column(nullable = true)
	public Double getRc_final_grade() {
		return rc_final_grade;
	}

	public void setRc_final_grade(Double rc_final_grade) {
		this.rc_final_grade = rc_final_grade;
	}

	@Column(nullable = true)
	public Integer getPercentile() {
		return percentile;
	}

	public void setPercentile(Integer percentile) {
		this.percentile = percentile;
	}

	@Column(nullable = true)
	public Integer getSat_verbal() {
		return sat_verbal;
	}

	public void setSat_verbal(Integer sat_verbal) {
		this.sat_verbal = sat_verbal;
	}

	@Column(nullable = true)
	public Integer getSat_math() {
		return sat_math;
	}

	public void setSat_math(Integer sat_math) {
		this.sat_math = sat_math;
	}

	@Column(nullable = true)
	public Integer getAptitude_score() {
		return aptitude_score;
	}

	public void setAptitude_score(Integer aptitude_score) {
		this.aptitude_score = aptitude_score;
	}

	@Column(nullable = true)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(nullable = true)
	public Integer getRc_gender() {
		return rc_gender;
	}

	public void setRc_gender(Integer rc_gender) {
		this.rc_gender = rc_gender;
	}

	@Column(nullable = true)
	public String getRc_enrollment_status() {
		return rc_enrollment_status;
	}

	public void setRc_enrollment_status(String rc_enrollment_status) {
		this.rc_enrollment_status = rc_enrollment_status;
	}

	@Column(nullable = true)
	public String getRc_class_code() {
		return rc_class_code;
	}

	public void setRc_class_code(String rc_class_code) {
		this.rc_class_code = rc_class_code;
	}

	@Column(nullable = true)
	public Double getGpa_cumulative() {
		return gpa_cumulative;
	}

	public void setGpa_cumulative(Double gpa_cumulative) {
		this.gpa_cumulative = gpa_cumulative;
	}

	@Column(nullable = true)
	public Double getGpa_semester() {
		return gpa_semester;
	}

	public void setGpa_semester(Double gpa_semester) {
		this.gpa_semester = gpa_semester;
	}

	@Column(nullable = true)
	public String getStanding() {
		return standing;
	}

	public void setStanding(String standing) {
		this.standing = standing;
	}

	@Column(nullable = true)
	public Double getRmn_score() {
		return rmn_score;
	}

	public void setRmn_score(Double rmn_score) {
		this.rmn_score = rmn_score;
	}

	@Column(nullable = true)
	public Double getRmn_score_partial() {
		return rmn_score_partial;
	}

	public void setRmn_score_partial(Double rmn_score_partial) {
		this.rmn_score_partial = rmn_score_partial;
	}

	@Column(nullable = true)
	public Double getR_content_read() {
		return r_content_read;
	}

	public void setR_content_read(Double r_content_read) {
		this.r_content_read = r_content_read;
	}

	@Column(nullable = true)
	public String getR_assmt_sub() {
		return r_assmt_sub;
	}

	public void setR_assmt_sub(String r_assmt_sub) {
		this.r_assmt_sub = r_assmt_sub;
	}

	@Column(nullable = true)
	public Double getR_forum_post() {
		return r_forum_post;
	}

	public void setR_forum_post(Double r_forum_post) {
		this.r_forum_post = r_forum_post;
	}

	@Column(nullable = true)
	public Double getR_forum_read() {
		return r_forum_read;
	}

	public void setR_forum_read(Double r_forum_read) {
		this.r_forum_read = r_forum_read;
	}

	@Column(nullable = true)
	public Double getR_lessons_view() {
		return r_lessons_view;
	}

	public void setR_lessons_view(Double r_lessons_view) {
		this.r_lessons_view = r_lessons_view;
	}

	@Column(nullable = true)
	public Double getR_assmt_take() {
		return r_assmt_take;
	}

	public void setR_assmt_take(Double r_assmt_take) {
		this.r_assmt_take = r_assmt_take;
	}

	@Column(nullable = true)
	public Double getR_asn_sub() {
		return r_asn_sub;
	}

	public void setR_asn_sub(Double r_asn_sub) {
		this.r_asn_sub = r_asn_sub;
	}

	@Column(nullable = true)
	public Double getR_asn_read() {
		return r_asn_read;
	}

	public void setR_asn_read(Double r_asn_read) {
		this.r_asn_read = r_asn_read;
	}

	@Column(nullable = true)
	public Double getR_sessions() {
		return r_sessions;
	}

	public void setR_sessions(Double r_sessions) {
		this.r_sessions = r_sessions;
	}

	@Column(nullable = true)
	public String getAcademic_risk() {
		return academic_risk;
	}

	public void setAcademic_risk(String academic_risk) {
		this.academic_risk = academic_risk;
	}

	@Column(nullable = true)
	public Double getFail_probability() {
		return fail_probability;
	}

	public void setFail_probability(Double fail_probability) {
		this.fail_probability = fail_probability;
	}

	@Column(nullable = true)
	public Double getPass_probability() {
		return pass_probability;
	}

	public void setPass_probability(Double pass_probability) {
		this.pass_probability = pass_probability;
	}

	@Column(nullable = true)
	public String getModel_risk_confidence() {
		return model_risk_confidence;
	}

	public void setModel_risk_confidence(String model_risk_confidence) {
		this.model_risk_confidence = model_risk_confidence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((academic_risk == null) ? 0 : academic_risk.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((alternative_id == null) ? 0 : alternative_id.hashCode());
		result = prime * result + ((aptitude_score == null) ? 0 : aptitude_score.hashCode());
		result = prime * result + ((course_id == null) ? 0 : course_id.hashCode());
		result = prime * result + ((enrollment == null) ? 0 : enrollment.hashCode());
		result = prime * result + ((fail_probability == null) ? 0 : fail_probability.hashCode());
		result = prime * result + ((gpa_cumulative == null) ? 0 : gpa_cumulative.hashCode());
		result = prime * result + ((gpa_semester == null) ? 0 : gpa_semester.hashCode());
		result = prime * result + ((model_risk_confidence == null) ? 0 : model_risk_confidence.hashCode());
		result = prime * result + ((online_flag == null) ? 0 : online_flag.hashCode());
		result = prime * result + ((pass_probability == null) ? 0 : pass_probability.hashCode());
		result = prime * result + ((percentile == null) ? 0 : percentile.hashCode());
		result = prime * result + ((r_asn_read == null) ? 0 : r_asn_read.hashCode());
		result = prime * result + ((r_asn_sub == null) ? 0 : r_asn_sub.hashCode());
		result = prime * result + ((r_assmt_sub == null) ? 0 : r_assmt_sub.hashCode());
		result = prime * result + ((r_assmt_take == null) ? 0 : r_assmt_take.hashCode());
		result = prime * result + ((r_content_read == null) ? 0 : r_content_read.hashCode());
		result = prime * result + ((r_forum_post == null) ? 0 : r_forum_post.hashCode());
		result = prime * result + ((r_forum_read == null) ? 0 : r_forum_read.hashCode());
		result = prime * result + ((r_lessons_view == null) ? 0 : r_lessons_view.hashCode());
		result = prime * result + ((r_sessions == null) ? 0 : r_sessions.hashCode());
		result = prime * result + ((rc_class_code == null) ? 0 : rc_class_code.hashCode());
		result = prime * result + ((rc_enrollment_status == null) ? 0 : rc_enrollment_status.hashCode());
		result = prime * result + ((rc_final_grade == null) ? 0 : rc_final_grade.hashCode());
		result = prime * result + ((rc_gender == null) ? 0 : rc_gender.hashCode());
		result = prime * result + ((rmn_score == null) ? 0 : rmn_score.hashCode());
		result = prime * result + ((rmn_score_partial == null) ? 0 : rmn_score_partial.hashCode());
		result = prime * result + ((sat_math == null) ? 0 : sat_math.hashCode());
		result = prime * result + ((sat_verbal == null) ? 0 : sat_verbal.hashCode());
		result = prime * result + ((standing == null) ? 0 : standing.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		if (academic_risk == null) {
			if (other.academic_risk != null)
				return false;
		} else if (!academic_risk.equals(other.academic_risk))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (alternative_id == null) {
			if (other.alternative_id != null)
				return false;
		} else if (!alternative_id.equals(other.alternative_id))
			return false;
		if (aptitude_score == null) {
			if (other.aptitude_score != null)
				return false;
		} else if (!aptitude_score.equals(other.aptitude_score))
			return false;
		if (course_id == null) {
			if (other.course_id != null)
				return false;
		} else if (!course_id.equals(other.course_id))
			return false;
		if (enrollment == null) {
			if (other.enrollment != null)
				return false;
		} else if (!enrollment.equals(other.enrollment))
			return false;
		if (fail_probability == null) {
			if (other.fail_probability != null)
				return false;
		} else if (!fail_probability.equals(other.fail_probability))
			return false;
		if (gpa_cumulative == null) {
			if (other.gpa_cumulative != null)
				return false;
		} else if (!gpa_cumulative.equals(other.gpa_cumulative))
			return false;
		if (gpa_semester == null) {
			if (other.gpa_semester != null)
				return false;
		} else if (!gpa_semester.equals(other.gpa_semester))
			return false;
		if (model_risk_confidence == null) {
			if (other.model_risk_confidence != null)
				return false;
		} else if (!model_risk_confidence.equals(other.model_risk_confidence))
			return false;
		if (online_flag == null) {
			if (other.online_flag != null)
				return false;
		} else if (!online_flag.equals(other.online_flag))
			return false;
		if (pass_probability == null) {
			if (other.pass_probability != null)
				return false;
		} else if (!pass_probability.equals(other.pass_probability))
			return false;
		if (percentile == null) {
			if (other.percentile != null)
				return false;
		} else if (!percentile.equals(other.percentile))
			return false;
		if (r_asn_read == null) {
			if (other.r_asn_read != null)
				return false;
		} else if (!r_asn_read.equals(other.r_asn_read))
			return false;
		if (r_asn_sub == null) {
			if (other.r_asn_sub != null)
				return false;
		} else if (!r_asn_sub.equals(other.r_asn_sub))
			return false;
		if (r_assmt_sub == null) {
			if (other.r_assmt_sub != null)
				return false;
		} else if (!r_assmt_sub.equals(other.r_assmt_sub))
			return false;
		if (r_assmt_take == null) {
			if (other.r_assmt_take != null)
				return false;
		} else if (!r_assmt_take.equals(other.r_assmt_take))
			return false;
		if (r_content_read == null) {
			if (other.r_content_read != null)
				return false;
		} else if (!r_content_read.equals(other.r_content_read))
			return false;
		if (r_forum_post == null) {
			if (other.r_forum_post != null)
				return false;
		} else if (!r_forum_post.equals(other.r_forum_post))
			return false;
		if (r_forum_read == null) {
			if (other.r_forum_read != null)
				return false;
		} else if (!r_forum_read.equals(other.r_forum_read))
			return false;
		if (r_lessons_view == null) {
			if (other.r_lessons_view != null)
				return false;
		} else if (!r_lessons_view.equals(other.r_lessons_view))
			return false;
		if (r_sessions == null) {
			if (other.r_sessions != null)
				return false;
		} else if (!r_sessions.equals(other.r_sessions))
			return false;
		if (rc_class_code == null) {
			if (other.rc_class_code != null)
				return false;
		} else if (!rc_class_code.equals(other.rc_class_code))
			return false;
		if (rc_enrollment_status == null) {
			if (other.rc_enrollment_status != null)
				return false;
		} else if (!rc_enrollment_status.equals(other.rc_enrollment_status))
			return false;
		if (rc_final_grade == null) {
			if (other.rc_final_grade != null)
				return false;
		} else if (!rc_final_grade.equals(other.rc_final_grade))
			return false;
		if (rc_gender == null) {
			if (other.rc_gender != null)
				return false;
		} else if (!rc_gender.equals(other.rc_gender))
			return false;
		if (rmn_score == null) {
			if (other.rmn_score != null)
				return false;
		} else if (!rmn_score.equals(other.rmn_score))
			return false;
		if (rmn_score_partial == null) {
			if (other.rmn_score_partial != null)
				return false;
		} else if (!rmn_score_partial.equals(other.rmn_score_partial))
			return false;
		if (sat_math == null) {
			if (other.sat_math != null)
				return false;
		} else if (!sat_math.equals(other.sat_math))
			return false;
		if (sat_verbal == null) {
			if (other.sat_verbal != null)
				return false;
		} else if (!sat_verbal.equals(other.sat_verbal))
			return false;
		if (standing == null) {
			if (other.standing != null)
				return false;
		} else if (!standing.equals(other.standing))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentStatistics [alternative_id=" + alternative_id + ", course_id=" + course_id + ", subject="
				+ subject + ", online_flag=" + online_flag + ", enrollment=" + enrollment + ", rc_final_grade="
				+ rc_final_grade + ", percentile=" + percentile + ", sat_verbal=" + sat_verbal + ", sat_math="
				+ sat_math + ", aptitude_score=" + aptitude_score + ", age=" + age + ", rc_gender=" + rc_gender
				+ ", rc_enrollment_status=" + rc_enrollment_status + ", rc_class_code=" + rc_class_code
				+ ", gpa_cumulative=" + gpa_cumulative + ", gpa_semester=" + gpa_semester + ", standing=" + standing
				+ ", rmn_score=" + rmn_score + ", rmn_score_partial=" + rmn_score_partial + ", r_content_read="
				+ r_content_read + ", r_assmt_sub=" + r_assmt_sub + ", r_forum_post=" + r_forum_post + ", r_forum_read="
				+ r_forum_read + ", r_lessons_view=" + r_lessons_view + ", r_assmt_take=" + r_assmt_take
				+ ", r_asn_sub=" + r_asn_sub + ", r_asn_read=" + r_asn_read + ", r_sessions=" + r_sessions
				+ ", academic_risk=" + academic_risk + ", fail_probability=" + fail_probability + ", pass_probability="
				+ pass_probability + ", model_risk_confidence=" + model_risk_confidence + "]";
	}
	
}
