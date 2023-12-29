package Hibernate_Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	 @Id
	 private String email;
	 private String sname;
	 private int age;
	 private  String pas;
	 private Date date;
	 private String areaOfStudy;
	 @OneToMany(mappedBy = "s")
	private List<Notes> notes;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPas() {
		return pas;
	}
	public void setPas(String pas) {
		this.pas = pas;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
	public List<Notes> getNotes() {
		return notes;
	}
	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAreaOfStudy() {
		return areaOfStudy;
	}

	public void setAreaOfStudy(String areaOfStudy) {
		this.areaOfStudy = areaOfStudy;
	}

	public Student(String email, String sname, int age, String pas, Date date, String areaOfStudy, List<Notes> notes) {
		super();
		this.email = email;
		this.sname = sname;
		this.age = age;
		this.pas = pas;
		this.date = date;
		this.areaOfStudy = areaOfStudy;
		this.notes = notes;
	}


	
	
	 
	

}
