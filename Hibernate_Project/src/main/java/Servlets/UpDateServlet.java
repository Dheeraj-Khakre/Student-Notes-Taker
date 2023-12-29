package Servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hibernate_Entity.Notes;
@WebServlet("/updateNoteSevlet")
public class UpDateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		 Notes n= (Notes)em.find(Notes.class,Integer.parseInt(request.getParameter("note_id")));
		 n.setTitle(request.getParameter("title"));
		 n.setContent(request.getParameter("content"));
		    et.begin();
		    em.persist(n);
		    et.commit();
		    em.close();
		    emf.close();
		    response.sendRedirect("user_Notes_View.jsp");
	}

}
