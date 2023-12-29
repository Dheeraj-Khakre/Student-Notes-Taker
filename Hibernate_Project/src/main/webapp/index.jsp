<!doctype html>
<html lang="en">
  <head>
   
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    
    <title>Student notes taker home</title>
   
       <%@include file="all_css_Script.jsp" %>
    
  </head>
  <body>
    <div class = "container">
    
       <%@include file="navBar.jsp" %>
       </div>
       
  
<div class="container">
<!-- Trigger/Open The Modal -->
<button id="signInBtn">Sign In</button>
<button id="loginBtn">Login</button>

<!-- The Modal -->
<div id="signInModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close"></span>
    
<h2>Student Form</h2>

<form action="submit_student_form" method="post">
  <label for="email">Email:</label><br>
  <input type="email" id="email" name="email" placeholder="enter email here" required="required"><br>
  <label for="pwd">Password:</label><br>
  <input type="password" id="pwd" name="pwd" placeholder="enter password here " required="required"><br>
   <label for="name">full name</label><br>
  <input type="text" id="name" name="name"><br>
  <label for="areaofstudy">Area of Study:</label><br>
  <input type="text" id="areaofstudy" name="areaofstudy" placeholder="example   B.Tech" required="required"><br>
  <label for="age">Age:</label><br>
  <input type="number" id="age" name="age"><br><br>
  <input type="submit" value="Submit">
</form> 
    
  </div>

</div>

<div id="loginModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content" >
    <span class="close">Login page</span>
<form action="login_std_info" method="post">
  <label for="email">Email:</label><br>
  <input type="email" id="email" name="email" placeholder="enter email here" required="required"><br>
  <label for="pwd">Password:</label><br>
  <input type="password" id="pwd" name="pwd" placeholder="enter password here " required="required"><br>
 
  <input type="submit" value="Submit">
</form> 
      </div>

</div>
   

  </div>



   
<script>
// Get the modals
var signInModal = document.getElementById("signInModal");
var loginModal = document.getElementById("loginModal");

// Get the buttons that open the modals
var signInBtn = document.getElementById("signInBtn");
var loginBtn = document.getElementById("loginBtn");

// Get the <span> elements that close the modals
var spans = document.getElementsByClassName("close");

// When the user clicks the button, open the modal 
signInBtn.onclick = function() {
  signInModal.style.display = "block";
}

loginBtn.onclick = function() {
  loginModal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
for (let i = 0; i < spans.length; i++) {
  spans[i].onclick = function() {
    signInModal.style.display = "none";
    loginModal.style.display = "none";
  }
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == signInModal) {
    signInModal.style.display = "none";
  }
  if (event.target == loginModal) {
    loginModal.style.display = "none";
  }
}
</script>
    
  </body>
</html>