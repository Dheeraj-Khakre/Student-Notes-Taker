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

@WebServlet("/deleteNote")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			Notes n = (Notes) em.find(Notes.class, Integer.parseInt(request.getParameter("note_id")));
			et.begin();
			em.remove(n);
			et.commit();
			em.clear();
			emf.close();
			response.sendRedirect("user_Notes_View.jsp");
		} catch (Exception e) {
			response.sendRedirect("user_Notes_View.jsp");
		}
	}

}
