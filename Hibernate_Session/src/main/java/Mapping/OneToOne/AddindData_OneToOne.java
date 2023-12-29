package Mapping.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddindData_OneToOne {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setSname("allen");
		s1.setAge(21);
		Course c1 = new Course(107, "DSA", "Vishwadip", s1);
		s1.setCourse(c1);

		session.save(c1);
		session.save(s1);

		tx.commit();
		session.close();
		factory.close();
	}
}
