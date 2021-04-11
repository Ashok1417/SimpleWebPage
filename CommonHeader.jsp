<%@ page language="java" contentType="text/html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="SignUp.css" type="text/css"/>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
</style>

</head>
<body>

<h1 style="color:Red;font-weight:bold;font-style: italic;font-size:xx-large;text-align:center;text-shadow:2px 2px ;">CUSTOMER DETAILS</h1>

<ul>
  <li><a class="active" href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Sign In</a></li>
  <li><a href="Register.jsp">Sign Up</a></li>
  <li><a href="About.jsp">About</a></li>
</ul>



</body>
</html>