package Table_Schama;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Employee {
	
	
	@Id
	@Column(name="empno")
	@GeneratedValue
	private int empid;
	@Column(name="Ename")
	private String ename;
	private String job;
	@Column(name="sal")
	private  float salary;
	@Temporal(TemporalType.DATE)
	private Date add_date;
	@Lob

	@OneToOne
	@JoinColumn(name ="deptNo")
	private Deptament dept;
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
		
	}
	public Deptament getDept() {
		return dept;
	}


	public void setDept(Deptament dept) {
		this.dept = dept;
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
