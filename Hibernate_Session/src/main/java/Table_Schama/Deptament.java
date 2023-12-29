package Table_Schama;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dept")
public class Deptament {
	@Id
	@Column(name ="dept_id")
	private int dept_No;
	
	private String dName;
	private String loc;
	public Deptament(int dept_No, String dName, String loc) {
		super();
		this.dept_No = dept_No;
		this.dName = dName;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Deptament [dept_No=" + dept_No + ", dName=" + dName + ", loc=" + loc + "]";
	}
	public Deptament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDept_No() {
		return dept_No;
	}
	public void setDept_No(int dept_No) {
		this.dept_No = dept_No;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
