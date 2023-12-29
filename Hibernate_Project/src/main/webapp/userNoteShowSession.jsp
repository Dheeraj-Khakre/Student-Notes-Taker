<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
<div class="container">

		<%@include file="navBar.jsp"%>
	<%   
if((String)session.getAttribute("email")!=null) {
	   
	   
	 response.sendRedirect("user_Notes_View.jsp");
	 
}else { %>
 <form action="login_std_info" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="psw">
  </div>
 
  <button type="submit" class="btn btn-primary text-alin-center">Submit</button>
</form>
     

<%} %>
</div>
</body>
</html>