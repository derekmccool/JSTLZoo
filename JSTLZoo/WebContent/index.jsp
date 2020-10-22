<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zoo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
	crossorigin="anonymous">
</head>
<body>
	<div class="container col-12">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
			    <h1 class="display-4">Zoo Home Page</h1>
			  	<p class="lead">Welcome, please check links below for information on our zoo animals and exhibits.</p>
			</div>
		</div>
		<form action="AnimalServlet" method="post">
			<input type="submit" value="Zoo Animals" class="btn btn-lg btn-dark btn-block">
		</form>		
		<br>
		<form action="ExhibitServlet" method="post">
			<input type="submit" value="Exhibits" class="btn btn-lg btn-secondary btn-block">
		</form>
	</div>

</body>
</html>