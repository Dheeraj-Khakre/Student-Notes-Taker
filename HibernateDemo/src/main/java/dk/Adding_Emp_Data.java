package dk;

import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Adding_Emp_Data {
	public static void main(String[] args) throws IOException {
		
		EntityManagerFactory etf= Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = etf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		 mapping.ManyToMany.Employee e1 = new mapping.ManyToMany.Employee();
	       e1.setEname("akki  khakre");
	       e1.setJob("Ag developer");
	       e1.setSalary(104320.3f);
	       FileInputStream fi = new FileInputStream("G:\\dheeraj khakre dk\\ak.webp");
	       byte[]data= new byte[fi.available()];
	       fi.read(data);
	       
	      // e1.setImage(data);
	    //   e1.setAdd_date(new java.util.Date());
	       et.begin();
	       em.persist(e1);
	       et.commit();
	       em.close();
	       etf.close();
	}

}
