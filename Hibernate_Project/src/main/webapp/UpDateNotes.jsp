<%@page import="Hibernate_Entity.Notes"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE NOTES</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
	<div class="container">

		<%@include file="navBar.jsp"%>

		<H2>this is UpDate Notes Page</H2>

		<%
                
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		      Notes n=  (Notes) em.find(Notes.class, Integer.parseInt(request.getParameter("note_id")));
		       
		%>
		<h1>Please Fill your Note details</h1>

		<form action="updateNoteSevlet" method="post" style="width: 500px">
		
		<input value="<%=n.getNote_id()%>" name="note_id" type="hidden">
		    
			<div class="mb-3" >
			    
				<label for="title"class="form-label">Note Title</label>
				 <input
					 type="text" 
					 class="form-control"
					id="title"
					name="title"
					 required="required"
					 value="<%=n.getTitle() %>"
					 >
				
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea   class="form-control" style="height: 250px"
				 id="content"
				 name="content"
				 placeholder="Enter your content here"
				required="required"
				
				> <%=n.getContent() %></textarea>
			</div>
			
			<div class ="container text-center"><button type="submit" class="btn btn-success">Save your Note</button></div>
			
		</form>



	</div>


</body>
</html>