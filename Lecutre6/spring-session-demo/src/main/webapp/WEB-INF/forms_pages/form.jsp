<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JAVA</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
<body>
   <div class="container">
   <h1>Login Form</h1>
   <hr />
   <p class="badge bg-danger">${error }</p>
   <form action="/processForm" method="POST">
   
   <label for="">Email</label>
   <input type="email"  name="email"/>
   
   
    <label for="">Pa@ssword</label>
   <input type="password" name="password"/>
  
   <button>Login</button>
   </form>
   </div>
</body>
</html>