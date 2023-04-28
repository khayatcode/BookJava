<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1>All Books</h1>
		<table class="table table-hover">
		    <thead>
		        <tr>
		            <th scope="col">ID</th>
		            <th scope="col">Title</th>
		            <th scope="col">Language</th>
		           	<th scope="col">Number of Pages</th>
		        </tr>
		    </thead>
		    <tbody>
		         <!-- loop over all the books to show the details as in the wireframe! -->
		         <c:forEach var="book" items="${books}">
			         <tr>
				        <td> <c:out value="${book.id}"/></td>
			         	<td> 
			         		<a href="/books/${book.id}">
			         			<c:out value="${book.title}"/>
			         		</a> 
			         	</td>
			         	<td> <c:out value="${book.language}"/></td>
			         	<td> <c:out value="${book.numberOfPages}"/></td>
			         </tr>
		         </c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>