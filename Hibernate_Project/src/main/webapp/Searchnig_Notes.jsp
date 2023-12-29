<%@page import="Hibernate_Entity.Notes"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Searching Notes ..</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>

	<div class="container">

		<%@include file="navBar.jsp"%>

		<%
		String search = request.getParameter("searchInput");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dkmidnight");
		EntityManager em = emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Notes> notes = em.createQuery("from Notes").getResultList();
		 
		  String searching[] = search.split(" ");
		  
		  for(Notes n:notes){
			  
			     // searchnig ... here 
			    if( isMached(searching, n.getTitle().split(" "))){ %>
			    	
			    	<div class="card mt-3">
		  <p class="text-primary"> Created by  : <b> <%=n.getS().getSname() %></b></p>
			<img src="image/th.jpeg" style = "max-width:100px " class="card-img-top m-4 mx-auto" alt="...">
			<div class="card-body">
				<h5 class="card-title"><%=n.getTitle()%></h5>
				<p class="card-text"><%=n.getContent() %></p>
				<p class="text-primary"> Last Update : <b> <%=n.getDate() %></b></p>
			</div>
		</div>
			 <%   } }%>
		<%! boolean isMached(String []s1,String[] s2){
			    int x=0;
			    for(int i=0;i<s2.length;i++){
			    	for(int j=0;j<s1.length;j++){
			    		if(s1[j].equalsIgnoreCase(s2[i])){
			    			x++;
			    		}
			    	}
			    }
			    
			    
			return x!=0;  
			
		}%>

	</div>

</body>
</html>