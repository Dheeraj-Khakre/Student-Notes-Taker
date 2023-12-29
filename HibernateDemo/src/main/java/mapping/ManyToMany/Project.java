package mapping.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Override
	public String toString() {
		return "Project [p_id=" + p_id + ", p_name=" + p_name + ", p_domen=" + p_domen + "]";
	}
	@Id
	private int p_id;
	private String p_name;
	private String p_domen;
	@ManyToMany(mappedBy = "project")
	private List<Employee> emp;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_domen() {
		return p_domen;
	}
	public void setP_domen(String p_domen) {
		this.p_domen = p_domen;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

}
