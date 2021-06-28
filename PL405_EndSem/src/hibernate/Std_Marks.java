package hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Std_Marks {
	
	@Id @GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = { @Parameter(value = "student", name = "property")})
	private int student_id;
	
	@Column(name="COURSE_1_Marks",nullable=true)
	private String course1;
	
	@Column(name="COURSE_2_Marks",nullable=true)
	private String course2;
	
	@Column(name="COURSE_3_Marks",nullable=true)
	private String course3;
	
	@Column(name="COURSE_4_Marks",nullable=true)
	private String course4;
	
	@Column(name="COURSE_5_Marks",nullable=true)
	private String course5;
	
	@Column(name="COURSE_6_Marks",nullable=true)
	private String course6;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student_info student;
	
	public Student_info getStudent() {
		return student;
	}

	public void setStudent(Student_info student) {
		this.student = student;
	}

	public String getcourse1() {
		return course1;
	}

	public void setcourse1(String course1) {
		this.course1 = course1;
	}

	public String getcourse2() {
		return course2;
	}

	public void setcourse2(String course2) {
		this.course2 = course2;
	}

	public String getcourse3() {
		return course3;
	}

	public void setcourse3(String course3) {
		this.course3 = course3;
	}

	public String getcourse4() {
		return course4;
	}

	public void setcourse4(String course4) {
		this.course4 = course4;
	}

	public String getcourse5() {
		return course5;
	}

	public void setcourse5(String course5) {
		this.course5 = course5;
	}

	public String getcourse6() {
		return course6;
	}

	public void setcourse6(String course6) {
		this.course6 = course6;
	}

	

}

