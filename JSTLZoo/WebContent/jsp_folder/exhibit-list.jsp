<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exhibits</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
	crossorigin="anonymous">
	
	<style>
		.exhibit-container{
			border-style: solid;
			border-color: grey;
			border-width: 1px;
			margin: 1em;
			text-align: center;
			min-height: 400px;
			box-shadow: 10px 10px 8px #888888;
			
		}
		
		.exhibit-image{
			height: 300px;
		}
		
		.jumbotron{
			background-color:green;
			color: white;
		}
		
		.exhibit-status{
		  animation: blink-animation 1.5s steps(5, start) infinite;
		}
		
		@keyframes blink-animation {
		  to {
		    visibility: hidden;
		  }
		}

	
	</style>
</head>
<body>
	<div class="container col-12 align-items-center">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
			    <h1 class="display-4">Exhibit List</h1>
			  	<p class="lead">Information for all exhibits listed below</p>
			</div>
		</div>
		<c:forEach var="exhibit" items="${ allExhibits }" varStatus="theCount">
		
				<c:if test= "${theCount.count % 2 != 0 }">
					<div class="row justify-content-center">
						<div class="col-5 exhibit-container">
							<h2> <c:out value="${ exhibit.name }"/> </h2>
							<br>
							<img class="exhibit-image" src="${ exhibit.picture }" alt="image of exhibit ${exhibit.name }"/>
							
							<c:if test= "${ exhibit.open }" >
								<h3 class="exhibit-status" style="color:green;">Now Open</h3>
							</c:if>
								<c:if test= "${ !exhibit.open }" >
								<h3 class="exhibit-status" style="color:red;">Closed</h3>
							</c:if>
						</div><!-- exhibit container div -->
					</c:if>
					<c:if test= "${theCount.count % 2 == 0 }">
							<div class="col-5 exhibit-container">
								<h2> <c:out value="${ exhibit.name }"/> </h2>
								<br>
								<img class="exhibit-image" src="${ exhibit.picture }" alt="image of exhibit ${exhibit.name }"/>
								<c:if test= "${ exhibit.open }" >
									<h3 class="exhibit-status" style="color:green;">Now Open</h3>
								</c:if>
									<c:if test= "${ !exhibit.open }" >
									<h3 class="exhibit-status" style="color:red;">Closed</h3>
								</c:if>
							</div><!-- exhibit container div -->
						</div><!-- closing row div -->
					</c:if>
				<c:if test= "${theCount.count % 2 != 0 && theCount.last}">
					</div><!-- closing row div if last item is not even-->
				</c:if>		
		</c:forEach>
	</div><!-- main container div -->
</body>
</html>