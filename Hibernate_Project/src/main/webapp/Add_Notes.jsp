<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add notes</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
	<div class="container">

		<%@include file="navBar.jsp"%>

		<h1>Please Fill your Note details</h1>

		<form action="saveNoteSevlet" method="post" style="width: 500px">
			<div class="mb-3" >
				<label for="title"class="form-label">Note Title</label>
				 <input
					 type="text" 
					 class="form-control"
					id="title"
					name="title"
					 required="required">
				
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea   class="form-control" style="height: 250px"
				 id="content"
				 name="content"
				 placeholder="Enter your content here"
				required="required"
				
				></textarea>
			</div>
			
			<div class ="container text-center"><button type="submit" class="btn btn-primary">Add Note</button></div>
			
		</form>
	</div>

</body>
</html>