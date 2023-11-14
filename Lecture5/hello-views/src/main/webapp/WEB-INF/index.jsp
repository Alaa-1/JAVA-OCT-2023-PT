<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<head>
<title>JAVA</title>
</head>
<body>
   <h1>Welcome ${name } 👋👋	</h1>
   <hr />
   
   <div>This your message: <c:out value="${test }"></c:out> </div>
</body>
</html>