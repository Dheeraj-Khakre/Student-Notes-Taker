package mapping.ManyToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Employee {
	
	
	@Id
	@Column(name="empno")
	
	private int empid;
	@Column(name="Ename")
	private String ename;
	private String job;
	@Column(name="sal")
	private  float salary;
	@Temporal(TemporalType.DATE)
	private Date add_date;
//	@Lob
//	private byte[]image;
	@ManyToMany
	private List<Project> project;
	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int empid, String ename, String job, float salary, Date add_date) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
		this.add_date = add_date;
		//.image = image;
	}
	public Date getAdd_date() {
		return add_date;
	}public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", add_date="
				+ add_date + "]";
	}


//	public byte[] getImage() {
//		return image;
//	}
//	public void setImage(byte[] image) {
//		this.image = image;
//	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}


}

