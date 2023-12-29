<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Hibernate_Entity.Notes"%>
<%@page import="java.util.List"%>
<%@page import="Hibernate_Entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View all notes</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
	<div class="container">

		<%@include file="navBar.jsp"%>

		<h1 class="text-uppercase">All Notes:</h1>
		<%
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();

		session = request.getSession(false);
		response.setContentType("text/html");
		try {
			String email = (String) session.getAttribute("email");
			Student s = (Student) em.find(Student.class, email);

			for (Notes n : s.getNotes()) {
		%>


		<div class="card mt-3">
		  <p class="text-primary"> Created by  : <b> <%=n.getS().getSname() %></b></p>
		<div class ="container text-center">
		
			<img src="image/th.jpeg" style="max-width: 100px"
				class="card-img-top m-4 mx-auto" alt="..."></div>
			<div class="card-body">
				<h5 class="card-title"> Title :- <%=n.getTitle()%></h5>
				<p class="card-text"><%=n.getContent()%></p>
				<p class="text-primary"> Last Update : <b> <%=n.getDate() %></b></p>
				<div class ="container text-center">
					<a href="deleteNote?note_id=<%=n.getNote_id()  %>" class="btn btn-danger">Delete</a>
					 <a href="UpDateNotes.jsp?note_id=<%=n.getNote_id()  %>"class="btn btn-primary">update</a>
				 </div>
			</div>
		</div>

		<%
		}

		} catch (Exception e) {

		}
		%>

	</div>

</body>
</html>