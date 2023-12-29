package dk;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
class Student {
	
	@Id 
	 private	int id;
	 private	String name;
	 private	String moblieNo;
	 private	int age;
	 public Student(int id, String n, String m,int a) {
		  this.id=id;
		  name=n;
		  moblieNo=m;
		  age=a;
				  
	}
	 public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public String getMoblieNo() {
		return moblieNo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class EstablishedConnection {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s1 = new Student(101,"dkmid night skt","123456789",21);
		Student s2 = new Student();
		System.out.println("enter id ");
		s2.setId(sc.nextInt());
		System.out.println("enter name");
		s2.setName(sc.next());
		System.out.println("enter number");
		s2.setMoblieNo(sc.next());
		System.out.println("enter age");
		s2.setAge(sc.nextInt());
     	et.begin();
		em.persist(s2);
		et.commit();
//	    Student ans  =	em.find( null, s2.getId());
//	     System.out.println(ans);
		System.out.println("data enter sucessefully");
	}

}
