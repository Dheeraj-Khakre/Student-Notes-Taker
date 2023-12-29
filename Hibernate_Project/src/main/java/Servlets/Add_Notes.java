package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import Hibernate_Entity.Notes;
import Hibernate_Entity.Student;

@WebServlet("/saveNoteSevlet")
public class Add_Notes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Add_Notes() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		try {
			String email = (String) session.getAttribute("email");
			Student s = (Student)em.find(Student.class, email);
			
			//System.out.println(email);
			 Notes notes = new Notes(request.getParameter("title"), request.getParameter("content"), s);
			 List<Notes> notesL= new ArrayList<Notes>();
			 notesL.add(notes);
			 s.setNotes(notesL);
			 et.begin(); 
			
			 em.persist(notes);
			 em.merge(s);
			 et.commit();
			 em.close();
			 emf.close();
			 response.getWriter().print("<h2 style='text-align:center'>Notes added seccessfully ..</h2>");
			 response.getWriter().print("<h2 style='text-align:center'><a href='all_Notes_View.jsp' >View All notes</a></h2>");
		} catch (Exception e) {
			response.getWriter().print("you enter wronge input....\n plsea enter right information");
			RequestDispatcher rd= request.getRequestDispatcher("Add_Notes.jsp");
			rd.include(request, response);
			
		}
		 
		
	}

}
