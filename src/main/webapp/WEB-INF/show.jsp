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
		<h1>Title: <c:out value="${book.title}"/> </h1>
		<h3>Description: <c:out value="${book.description}"/></h3>
		<h3>Language: <c:out value="${book.language}"/> </h3>
		<h3>Number of Pages: <c:out value="${book.numberOfPages}"/> </h3>
	</div>
</body>
</html>