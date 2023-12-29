package Mapping.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Adding_Data_OneToMany {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		/// user data ...
        User u1=new User();
        u1.setEmail("abc@gmail.com");
        u1.setNumber("9934554321");
        u1.setUserName("abc");
        
        List<Account> account=new ArrayList<Account>();
        
        // account details...
        Account a1= new Account();
        a1.setAcount_No(1221);
        a1.setBankName("SBI");
        a1.setDeptno(20);
        a1.setLoc("banglore");
      //  a1.setUser(u1);
        Account a2= new Account();
        a2.setAcount_No(1234);
        a2.setBankName("CBI");
        a2.setDeptno(30);
        a2.setLoc("Betul");
      //  a2.setUser(u1);
        account.add(a1);
        account.add(a2);
        u1.setAcount(account);
          session.save(u1);
          session.save(a2);
          session.save(a1);

		tx.commit();
		session.close();
		factory.close();
	}
}
