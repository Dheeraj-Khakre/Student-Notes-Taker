package Servlets;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Hibernate_Entity.Student;
@WebServlet("/submit_student_form")
public class Std_Sign_Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Std_Sign_Data() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		     rp.setContentType("text/html");
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		   EntityManager em = emf.createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   Student s1 = new Student(rq.getParameter("email"), rq.getParameter("name"), Integer.parseInt(rq.getParameter("age")), rq.getParameter("pwd"),new Date(), rq.getParameter("areaofstudy"), null);
		try {
			  et.begin();
			  em.persist(s1);
			  et.commit();
			  em.close();
			  emf.close();
			  HttpSession session = rq.getSession();
			  session.setAttribute("email", rq.getParameter("email"));
			  session.setAttribute("pws", rq.getParameter("pws"));
			  
			  rp.sendRedirect("Home.jsp");
			
		} catch (Exception e) {
			rp.getWriter().print("something is wronge");
			RequestDispatcher rd= rq.getRequestDispatcher("index.jsp");
			rd.include(rq, rp);
		}
	}

}
