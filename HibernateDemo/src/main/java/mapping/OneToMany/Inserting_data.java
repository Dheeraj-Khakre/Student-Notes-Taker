package mapping.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Inserting_data {

	public static void main(String[] args) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		  EntityManager em = emf.createEntityManager();
		  EntityTransaction et = em.getTransaction();
		        Question q1 =new Question();
		        q1.setQ_id(102);
		        q1.setQue("what is hibernate ?");
		        //
		        
		        Answer a1=new Answer(12,"hibenate is ORM tool", q1);
		        Answer a2= new Answer(23, "hibernate is usrd to perform operstion on database", q1);
		        Answer a3 = new Answer(34, "hibernate is have interfaces to manupulate the databse", q1);
		        List<Answer> ansList = new ArrayList<Answer>();
		        ansList.add(a1);
		        ansList.add(a2);
		        ansList.add(a3);
		        q1.setAnswer(ansList);
		        et.begin();
		        
		            em.persist(q1);
		            em.persist(a1);
		            em.persist(a2);
		            em.persist(a3);
		        et.commit();
		        em.close();
		        emf.close();
	}
}
 