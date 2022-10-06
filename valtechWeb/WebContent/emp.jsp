<%@page import="com.valtech.dao.Employeees"%>
<%@page import="com.valtech.dao.EmployeeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 EmployeeeDAO dao = new EmployeeeDAO();
int id = Integer.parseInt(request.getParameter("id"));  // gives the arguments
Employeees e = dao.getEmployee(1);
String prev = "emp.jsp?id="+dao.getPreviousId(id);
String next = "emp.jsp?id="+dao.getNextId(id);

%>
<table>

<tr>   
   <td> id</td><td><%= e.getId() %></td>
  </tr>
  <tr>
   <td> name</td><td><%= e.getName() %></td>
   </tr>
   <tr>
   <td> age </td><td><%= e.getAge() %></td>
   </tr>
   <tr>
   <td> gender</td><td><%= e.getGender() %></td>
   </tr>
<tr>
   <td> salary</td><td><%= e.getSalary() %></td>
</tr>

<tr>
<td> <a href=<%=prev%>>Previous</a></td>
<td> <a href=<%=next%>>Next</a></td>
</tr>
</table>

<form action ="empCtlr" method="post">
<input type="submit" name="submit" value="New Employee"/>
</form>
</body>
</html>