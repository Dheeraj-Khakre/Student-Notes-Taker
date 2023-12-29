package Servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Hibernate_Entity.Student;

@WebServlet("/login_std_info")
public class loginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		   	throws ServletException, IOException {
		response.setContentType("text/html");
	        
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		try {
//			Query q = em.createQuery("from Student where email=:x and pas=:y");
//			q.setParameter("x", request.getParameter("email"));
//			q.setParameter("y", request.getParameter("pws"));
//			Student s = (Student)q.getSingleResult();
			Student s = (Student) em.find(Student.class,request.getParameter("email"));

			//if ( s.getPas().equalsIgnoreCase(request.getParameter("pws"))) {
				 HttpSession session = request.getSession();
				  session.setAttribute("email", request.getParameter("email"));
				  session.setAttribute("pws", request.getParameter("pws"));
				  RequestDispatcher rd= request.getRequestDispatcher("Home.jsp");
					rd.forward(request, response);
//		//	}else {
//				response.getWriter().print("you enter wronge input....\n plsea enter right information");
//				RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
//				rd.include(request, response);
//			}
			em.clear();
			emf.close();
			
		} catch (Exception e) {
			response.getWriter().print("you enter wronge input....\n plsea enter right information");
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.include(request, response);

		}

	}

}
