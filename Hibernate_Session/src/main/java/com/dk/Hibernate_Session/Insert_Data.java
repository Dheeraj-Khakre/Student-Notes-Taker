package com.dk.Hibernate_Session;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Table_Schama.Deptament;
import Table_Schama.Employee;

public class Insert_Data 
{
    public static void main( String[] args ) throws IOException
    {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
     //  System.out.println(factory);
       Session session = factory.openSession();
       
        session.beginTransaction();
       Employee e1 = new Employee();
       e1.setEname("somati  khakre");
       e1.setJob("home Maker");
       e1.setSalary(18432.23f);
       e1.setAdd_date(new Date());
       Deptament d = new Deptament(20, "software developer", "banglore");
       e1.setDept( d);
       
       
//       FileInputStream fi = new FileInputStream("G:\\dheeraj khakre dk\\ai.jpg");
//       byte[]data= new byte[fi.available()];
//       fi.read(data);
//       
      // e1.setImage(data);
       e1.setAdd_date(new java.util.Date());
       session.save(e1);
       session.save(d);
       session.getTransaction().commit();
       session.close();
       
         
       
       
       
       factory.close();
       
    }
}
