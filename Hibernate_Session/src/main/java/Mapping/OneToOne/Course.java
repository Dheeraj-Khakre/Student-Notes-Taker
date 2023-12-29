package Mapping.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	private String teachingBy;
	@OneToOne(mappedBy = "course")
	private Student student;

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", teachingBy=" + teachingBy + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, String teachingBy, Student student) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teachingBy = teachingBy;
		this.student = student;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getTeachingBy() {
		return teachingBy;
	}

	public void setTeachingBy(String teachingBy) {
		this.teachingBy = teachingBy;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
