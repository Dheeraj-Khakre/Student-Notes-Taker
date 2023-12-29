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
		
	
		try {
			@SuppressWarnings("unchecked")
			List<Notes> notes = em.createQuery("from Notes").getResultList();
			

			for (Notes n : notes) {
		%>

		<div class="card mt-3">
		  <p class="text-primary"> Created by  : <b> <%=n.getS().getSname() %></b></p>
			<img src="image/th.jpeg" style = "max-width:100px " class="card-img-top m-4 mx-auto" alt="...">
			<div class="card-body">
				<h5 class="card-title"><%=n.getTitle()%></h5>
				<p class="card-text"><%=n.getContent() %></p>
				<p class="text-primary"> Last Update : <b> <%=n.getDate() %></b></p>
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