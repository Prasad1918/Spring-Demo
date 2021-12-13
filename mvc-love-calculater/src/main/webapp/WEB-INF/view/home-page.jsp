
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Welcome Love Calculater Game</h1>


<form:form action="proces-next"  method="get" modelAttribute="info">  
        Your name: <form:input path="UserName" />         
        <br><br>  
        Crush name: <form:input path="CrushName" />  
        <br><br>  
        <input type="submit" value="Submit" />      
    </form:form>  
</body>
</html>