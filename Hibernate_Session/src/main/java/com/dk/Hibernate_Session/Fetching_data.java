package com.dk.Hibernate_Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Table_Schama.Employee;

public class Fetching_data {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Employee e = (Employee) session.get(Employee.class, 1);
//	    System.out.println(e.toString());
	
	    Employee e1=(Employee)session.get(Employee.class, 1);
	    System.out.println(e1.toString());
	    System.out.println(e1.getDept().toString());

//		Employee e2 = (Employee) session.load(Employee.class, 1);
//		 System.out.println(e2.toString());
		 
//		 Employee e3= (Employee) session.load(Employee.class, 4);
//		 System.out.println(e3.toString());

		session.close();
		factory.close();
	}

}
