  
<nav class="navbar navbar-expand-lg navbar-dark purple">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Student notes taker</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="all_Notes_View.jsp">show all notes</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Notes operation
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="loginSession.jsp">add notes</a></li>
             <li><a class="dropdown-item" href="userNoteShowSession.jsp">show only your notes</a></li>
            <li><a class="dropdown-item" href="#">update notes</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">delete the notes</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="#" tabindex="-1" ></a>
        </li>
      </ul>
      <form class="d-flex"  action="Searchnig_Notes.jsp" method="post">
        <input class="form-control me-2" type="search" placeholder="Search any notes here  " aria-label="Search" name ="searchInput">
        <button class="btn btn-outline-light" type="submit">Search</button>
      </form>
     
     <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
    Student Info
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    <li><a class="dropdown-item" href="#">Login info</a></li>
    <li><a class="dropdown-item" href="logoutservlet">logOut</a></li>
    <li><a class="dropdown-item" href="#">Account</a></li>
  </ul>
</div>
     
     
      
    </div>
  </div>
</nav>
  