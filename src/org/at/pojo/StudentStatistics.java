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
	private double rc_final_grade;
	private int percentile;
	private int sat_verbal;
	private int sat_math;
	private int aptitude_score;
	private int age;
	private int rc_gender;
	private String rc_enrollment_status;
	private String rc_class_code;
	private double gpa_cumulative;
	private double gpa_semester;
	private String standing;
	private double rmn_score;
	private double rmn_score_partial;
	private double r_content_read;
	private String r_assmt_sub;
	private double r_forum_post;
	private double r_forum_read;
	private double r_lessons_view;
	private double r_assmt_take;
	private double r_asn_sub;
	private double r_asn_read;
	private double r_sessions;
	private String academic_risk;
	private double fail_probability;
	private double pass_probability;
	private String model_risk_confidence;
	
	public StudentStatistics() {
	}

	public StudentStatistics(String alternative_id, String course_id, String subject, int age, int rc_gender,
			double gpa_cumulative, double rmn_score, double r_content_read, double r_forum_post,
			double r_asn_sub, double r_sessions, String model_risk_confidence) {

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
	@Column
	public String getAlternative_id() {
		return alternative_id;
	}

	public void setAlternative_id(String alternative_id) {
		this.alternative_id = alternative_id;
	}

	@Column
	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	@Column
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column
	public String getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag(String online_flag) {
		this.online_flag = online_flag;
	}

	@Column
	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	@Column
	public double getRc_final_grade() {
		return rc_final_grade;
	}

	public void setRc_final_grade(double rc_final_grade) {
		this.rc_final_grade = rc_final_grade;
	}

	@Column
	public int getPercentile() {
		return percentile;
	}

	public void setPercentile(int percentile) {
		this.percentile = percentile;
	}

	@Column
	public int getSat_verbal() {
		return sat_verbal;
	}

	public void setSat_verbal(int sat_verbal) {
		this.sat_verbal = sat_verbal;
	}

	@Column
	public int getSat_math() {
		return sat_math;
	}

	public void setSat_math(int sat_math) {
		this.sat_math = sat_math;
	}

	@Column
	public int getAptitude_score() {
		return aptitude_score;
	}

	public void setAptitude_score(int aptitude_score) {
		this.aptitude_score = aptitude_score;
	}

	@Column
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column
	public int getRc_gender() {
		return rc_gender;
	}

	public void setRc_gender(int rc_gender) {
		this.rc_gender = rc_gender;
	}

	@Column
	public String getRc_enrollment_status() {
		return rc_enrollment_status;
	}

	public void setRc_enrollment_status(String rc_enrollment_status) {
		this.rc_enrollment_status = rc_enrollment_status;
	}

	@Column
	public String getRc_class_code() {
		return rc_class_code;
	}

	public void setRc_class_code(String rc_class_code) {
		this.rc_class_code = rc_class_code;
	}

	@Column
	public double getGpa_cumulative() {
		return gpa_cumulative;
	}

	public void setGpa_cumulative(double gpa_cumulative) {
		this.gpa_cumulative = gpa_cumulative;
	}

	@Column
	public double getGpa_semester() {
		return gpa_semester;
	}

	public void setGpa_semester(double gpa_semester) {
		this.gpa_semester = gpa_semester;
	}

	@Column
	public String getStanding() {
		return standing;
	}

	public void setStanding(String standing) {
		this.standing = standing;
	}

	@Column
	public double getRmn_score() {
		return rmn_score;
	}

	public void setRmn_score(double rmn_score) {
		this.rmn_score = rmn_score;
	}

	@Column
	public double getRmn_score_partial() {
		return rmn_score_partial;
	}

	public void setRmn_score_partial(double rmn_score_partial) {
		this.rmn_score_partial = rmn_score_partial;
	}

	@Column
	public double getR_content_read() {
		return r_content_read;
	}

	public void setR_content_read(double r_content_read) {
		this.r_content_read = r_content_read;
	}

	@Column
	public String getR_assmt_sub() {
		return r_assmt_sub;
	}

	public void setR_assmt_sub(String r_assmt_sub) {
		this.r_assmt_sub = r_assmt_sub;
	}

	@Column
	public double getR_forum_post() {
		return r_forum_post;
	}

	public void setR_forum_post(double r_forum_post) {
		this.r_forum_post = r_forum_post;
	}

	@Column
	public double getR_forum_read() {
		return r_forum_read;
	}

	public void setR_forum_read(double r_forum_read) {
		this.r_forum_read = r_forum_read;
	}

	@Column
	public double getR_lessons_view() {
		return r_lessons_view;
	}

	public void setR_lessons_view(double r_lessons_view) {
		this.r_lessons_view = r_lessons_view;
	}

	@Column
	public double getR_assmt_take() {
		return r_assmt_take;
	}

	public void setR_assmt_take(double r_assmt_take) {
		this.r_assmt_take = r_assmt_take;
	}

	@Column
	public double getR_asn_sub() {
		return r_asn_sub;
	}

	public void setR_asn_sub(double r_asn_sub) {
		this.r_asn_sub = r_asn_sub;
	}

	@Column
	public double getR_asn_read() {
		return r_asn_read;
	}

	public void setR_asn_read(double r_asn_read) {
		this.r_asn_read = r_asn_read;
	}

	@Column
	public double getR_sessions() {
		return r_sessions;
	}

	public void setR_sessions(double r_sessions) {
		this.r_sessions = r_sessions;
	}

	@Column
	public String getAcademic_risk() {
		return academic_risk;
	}

	public void setAcademic_risk(String academic_risk) {
		this.academic_risk = academic_risk;
	}

	@Column
	public double getFail_probability() {
		return fail_probability;
	}

	public void setFail_probability(double fail_probability) {
		this.fail_probability = fail_probability;
	}

	@Column
	public double getPass_probability() {
		return pass_probability;
	}

	public void setPass_probability(double pass_probability) {
		this.pass_probability = pass_probability;
	}

	@Column
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
		result = prime * result + age;
		result = prime * result + ((alternative_id == null) ? 0 : alternative_id.hashCode());
		result = prime * result + aptitude_score;
		result = prime * result + ((course_id == null) ? 0 : course_id.hashCode());
		result = prime * result + ((enrollment == null) ? 0 : enrollment.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fail_probability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gpa_cumulative);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gpa_semester);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model_risk_confidence == null) ? 0 : model_risk_confidence.hashCode());
		result = prime * result + ((online_flag == null) ? 0 : online_flag.hashCode());
		temp = Double.doubleToLongBits(pass_probability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + percentile;
		temp = Double.doubleToLongBits(r_asn_read);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(r_asn_sub);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((r_assmt_sub == null) ? 0 : r_assmt_sub.hashCode());
		temp = Double.doubleToLongBits(r_assmt_take);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(r_content_read);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(r_forum_post);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(r_forum_read);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(r_lessons_view);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(r_sessions);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rc_class_code == null) ? 0 : rc_class_code.hashCode());
		result = prime * result + ((rc_enrollment_status == null) ? 0 : rc_enrollment_status.hashCode());
		temp = Double.doubleToLongBits(rc_final_grade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rc_gender;
		temp = Double.doubleToLongBits(rmn_score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rmn_score_partial);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sat_math;
		result = prime * result + sat_verbal;
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
		if (age != other.age)
			return false;
		if (alternative_id == null) {
			if (other.alternative_id != null)
				return false;
		} else if (!alternative_id.equals(other.alternative_id))
			return false;
		if (aptitude_score != other.aptitude_score)
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
		if (Double.doubleToLongBits(fail_probability) != Double.doubleToLongBits(other.fail_probability))
			return false;
		if (Double.doubleToLongBits(gpa_cumulative) != Double.doubleToLongBits(other.gpa_cumulative))
			return false;
		if (Double.doubleToLongBits(gpa_semester) != Double.doubleToLongBits(other.gpa_semester))
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
		if (Double.doubleToLongBits(pass_probability) != Double.doubleToLongBits(other.pass_probability))
			return false;
		if (percentile != other.percentile)
			return false;
		if (Double.doubleToLongBits(r_asn_read) != Double.doubleToLongBits(other.r_asn_read))
			return false;
		if (Double.doubleToLongBits(r_asn_sub) != Double.doubleToLongBits(other.r_asn_sub))
			return false;
		if (r_assmt_sub == null) {
			if (other.r_assmt_sub != null)
				return false;
		} else if (!r_assmt_sub.equals(other.r_assmt_sub))
			return false;
		if (Double.doubleToLongBits(r_assmt_take) != Double.doubleToLongBits(other.r_assmt_take))
			return false;
		if (Double.doubleToLongBits(r_content_read) != Double.doubleToLongBits(other.r_content_read))
			return false;
		if (Double.doubleToLongBits(r_forum_post) != Double.doubleToLongBits(other.r_forum_post))
			return false;
		if (Double.doubleToLongBits(r_forum_read) != Double.doubleToLongBits(other.r_forum_read))
			return false;
		if (Double.doubleToLongBits(r_lessons_view) != Double.doubleToLongBits(other.r_lessons_view))
			return false;
		if (Double.doubleToLongBits(r_sessions) != Double.doubleToLongBits(other.r_sessions))
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
		if (Double.doubleToLongBits(rc_final_grade) != Double.doubleToLongBits(other.rc_final_grade))
			return false;
		if (rc_gender != other.rc_gender)
			return false;
		if (Double.doubleToLongBits(rmn_score) != Double.doubleToLongBits(other.rmn_score))
			return false;
		if (Double.doubleToLongBits(rmn_score_partial) != Double.doubleToLongBits(other.rmn_score_partial))
			return false;
		if (sat_math != other.sat_math)
			return false;
		if (sat_verbal != other.sat_verbal)
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
