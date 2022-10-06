<%@page import="com.valtech.dao.Employeees"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> http://localhost:8080/valtechweb3/empCtlr?id=3</h2>
<% Employeees e = (Employeees)request.getAttribute("e"); %>
<table>
<tr>
    <td>Id</td><td><%= e.getId() %></td>
</tr>
<tr>    
    <td>Name</td><td><%= e.getName() %></td>
</tr>
<tr>
    <td>Age</td><td><%= e.getAge() %></td>
</tr>
<tr>
    <td>Gender</td><td><%= e.getGender() %></td>
</tr>
<tr>
    <td>Salary</td><td><%= e.getSalary() %></td>
</tr>
<%-- <tr>
    <td><a href =<%=prev%>>Previous</a></td>
    <td><a href=<%=next%>>Next</a></td>
</tr> --%>
</table>
</body>
</html>