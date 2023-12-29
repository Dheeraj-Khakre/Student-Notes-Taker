package Mapping.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	private String email;
    @Column(name = "U-Name")
	private String userName;
    private String number;
    @OneToMany
    private List<Account> acount;
	public User(String email, String userName, String number, List<Account> acount) {
		super();
		this.email = email;
		this.userName = userName;
		this.number = number;
		this.acount = acount;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public List<Account> getAcount() {
		return acount;
	}
	public void setAcount(List<Account> acount) {
		this.acount = acount;
	}
    

}
