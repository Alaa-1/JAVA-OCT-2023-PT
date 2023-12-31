<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JAVA</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
<body>
	<div class="container">
		<!-- Display Table of Books -->
		<h1>All the books!</h1>
		<hr />
		${allDaBooks }

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>title</th>
					<th>Author</th>
					<th>pages</th>
					<th>actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books }" var="b">

					<tr>
						<td>${b.getId()}</td>
						<td><a href="/books/${b.getId() }"> ${b.getTitle() } </a></td>
						<td>${b.author }</td>
						<td>${b.pages }</td>
						<td><a href="/edit/${b.id }">edit</a> |

							<form action="/books/${b.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<!-- 		Display Create Book Form -->

		<h1>New Book</h1>
		<form:form action="/books" method="post" modelAttribute="book">
			<div class="container">
				<form:errors style="color: red" path="*" />
			</div>
			<p>
				<form:label path="title">Title</form:label>
				<form:input path="title" />
			</p>
			<p>
				<form:label path="author">author</form:label>
				<form:input path="author" />
			</p>
			<p>
				<form:label path="pages">Pages</form:label>
				<form:input type="number" path="pages" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
</body>
</html>