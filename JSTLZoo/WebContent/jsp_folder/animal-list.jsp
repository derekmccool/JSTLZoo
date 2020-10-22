<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal List</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
	crossorigin="anonymous">
</head>
<body>
	<div class="container col-12">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
			    <h1 class="display-4">Animal List</h1>
			  	<p class="lead">Information for all animals listed below</p>
			</div>
		</div>
		<c:forEach var="animal" items="${ allAnimals }">
		
			<p> <c:out value="${ animal }" /> </p>
			<p> <c:out value="${ animal.name }"/> </p>
			<p> <c:out value="${ animal.population }"/> </p>
		
		</c:forEach>
	</div>
</body>
</html>