package Mapping.OneToMany;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	private int acount_No;
	private String bankName;
	private String loc;
	private int deptno;
//	@ManyToOne
//	private User user;

	public int getAcount_No() {
		return acount_No;
	}

	public void setAcount_No(int acount_No) {
		this.acount_No = acount_No;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int acount_No, String bankName, String loc, int deptno) {
		super();
		this.acount_No = acount_No;
		this.bankName = bankName;
		this.loc = loc;
		this.deptno = deptno;
	//	this.user = user;
	}

}
