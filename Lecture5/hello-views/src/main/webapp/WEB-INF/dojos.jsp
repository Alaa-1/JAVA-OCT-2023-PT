<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JAVA</title>
    
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<div class="container">
   <h1>⛩Dojos: </h1>
   <hr />
   <table class="table">
   <thead>
   <tr>
   <th>Dojo Name: </th>
   </tr>
   </thead>
   <tbody>
   <c:forEach items = "${dojoList }" var ="dojoName">
   <tr>
   <td>${dojoName}</td>
   </tr>
   </c:forEach>
   </tbody>
   </table>
</div>
 </html>