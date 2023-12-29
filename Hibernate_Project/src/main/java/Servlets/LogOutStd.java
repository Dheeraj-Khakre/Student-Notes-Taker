package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logoutservlet")
public class LogOutStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LogOutStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
		   HttpSession session = request.getSession(false);
		   session.invalidate();
		   response.sendRedirect("Home.jsp");
		
	}

	

}
