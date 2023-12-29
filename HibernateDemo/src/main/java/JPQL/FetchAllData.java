package JPQL;


import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import mapping.ManyToMany.Employee;

public class FetchAllData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();

		@SuppressWarnings("unchecked")
		List<Employee> employees = em.createQuery("from Employee").getResultList();

		for (Employee e : employees) {
			System.out.println(".......................");
			System.out.println(e.toString());
			System.out.println(e.getProject().toString());
		}

		Query q = em.createQuery("from Employee where Ename=:x");
		q.setParameter("x","reena" );

		@SuppressWarnings("unchecked")
		List<Employee> employees2 = q.getResultList();

		for (Employee e : employees2) {
			System.out.println(".......................");
			System.out.println(e.toString());
			System.out.println(e.getProject().toString());
		}
		
		Query joinQ = em.createQuery("select e.empid ,e.ename,p.p_id,p.p_name from Employee e inner join e.project p");
         @SuppressWarnings("unchecked")
		List<Object []> jion_r=joinQ.getResultList();
         for(Object[] ob:jion_r) {
        	 System.out.println("join Qury ..............");
        	 System.out.println(Arrays.toString(ob));
         }

	}

}
