
    <%@ page import="first.Amazon" %>

<jsp:useBean id="obj" class="first.Amazon"/>

<%
 
 obj.setUsername(request.getParameter("usr"));
 obj.setEmail(request.getParameter("inputEmail3"));
 obj.setPassword(request.getParameter("inputPassword3"));
 
 int num = obj.insert();
 if(num>0)
	 out.println(num + " rows inserted!");
 else
	out.println("Insertion failed..");
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no,width=device-width">
<title> A S A </title>
<script src="login.js"></script>
<link rel="stylesheet" href="css/sign.css">
<link rel="shortcut icon" type="image/jpg" href="images/favicon.ico">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
</head>
<body>
<section role="main" class="container-fluid">
 <nav class="navbar navbar-inverse navbar-fixed-top">
 <div class="container">
 <h1 style="color:white; font-size:36px;">N A S A</h1>
 </div>
 <div class="container left">
 <a href="Amazon.html"><span style="color:#ccc; width:100px; height:100px;"class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></a>
 </div>		     
 </nav>
 
<div class="container loginf">
  <form class="form-horizontal" action="Amazon.jsp">
  <div class="form-group">
				  <label for="usr" class="col-sm-2 control-label">Username</label>
				  <div class="col-sm-10">
				  <input type="text" class="form-control" id="usr" placeholder="User Name">
				  </div> 
				  </div>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit"  onclick="call();" class="btn btn-default"/>submit</button>
    </div>
    
  </div>
</form>
</div>
 <div class="row2"></div>
 <footer class="footer">
  <div class="container">
   <p class="text-muted">www.NASA.com</p>
  </div>
  </footer>
 </section>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</body>
</html>