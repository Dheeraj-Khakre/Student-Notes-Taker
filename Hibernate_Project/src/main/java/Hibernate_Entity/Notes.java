package Hibernate_Entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notes {
	@Id
	
	private int note_id;
	private String title;
	@Column(length = 2000)
	private  String content;
	private Date date;
	@ManyToOne
	private Student s;
	public int getNote_id() {
		return note_id;
	}
	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	
	public Notes( String title, String content,  Student s) {
		super();
		this.note_id=new Random().nextInt(10000);
		this.title = title;
		this.content = content;
		this.date = new Date();
		this.s = s;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
