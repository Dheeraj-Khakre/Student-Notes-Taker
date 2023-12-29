package mapping.ManyToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Inserting_Data {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		// p1......
		Project p1 = new Project();
		p1.setP_id(1020);
		p1.setP_name("Library -managment");
		p1.setP_domen("Front_End");
		// p2.....
		Project p2 = new Project();
		p2.setP_id(1030);
		p2.setP_name("Library -managment");
		p2.setP_domen("Back_end");
		// project list
		List<Project> pList = new ArrayList<Project>();
		pList.add(p1);
		pList.add(p2);

		// creating Emp////
		Employee e1 = new Employee(100201, "dk", "Front-End developer", 42230.23f, new Date());
		Employee e2 = new Employee(100202, "pranali", "Back-End developer", 40230.23f, new Date());
		Employee e3 = new Employee(100203, "reena", " Full stack developer", 60230.23f, new Date());
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(e1);

		eList.add(e2);
		eList.add(e3);

		p1.setEmp(eList);
		p2.setEmp(eList);

		e1.setProject(pList);
		e2.setProject(pList);
		e3.setProject(pList);
		et.begin();
		    em.persist(p1);
		    em.persist(p2);
		    em.persist(e1);
		    em.persist(e2);
		    em.persist(e3);
		
		et.commit();
		em.close();
		emf.close();
	}

}
