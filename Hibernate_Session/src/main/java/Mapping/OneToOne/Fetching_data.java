package Mapping.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetching_data {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s1 = ( Student)session.get(Student.class, 1);
		System.out.println(s1.toString() );
		System.out.println(s1.getCourse().toString());
	
		

		tx.commit();
		session.close();
		factory.close();
	}
}
