package dk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mapping.ManyToMany.Employee;

public class Fetching_Data {

	
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		 //  for(int i=1;i<=6;i++) {
		  Employee e = (Employee)em.find(Employee.class, 3);
		      System.out.println(e.toString());
//		      for(int j=0;j<e.getImage().length;j++) {
//		    	  System.out.println(e.getImage()[j]);
//		      }
		  // } 
		      em.close();
		      emf.close();
	}
}
