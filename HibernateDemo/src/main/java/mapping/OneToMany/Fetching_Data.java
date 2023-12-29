package mapping.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetching_Data {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Question q1= (Question)em.find(Question.class, 101);
		System.out.println(q1.getQ_id()+","+q1.getQue());
		for(Answer a:q1.getAnswer()) {
			System.out.println(a.getAns());
		}
		Question q2= (Question)em.find(Question.class, 102);
		System.out.println(q1.getQ_id()+","+q1.getQue());
		for(Answer a:q1.getAnswer()) {
			System.out.println(a.getAns());
		}
	}

}
