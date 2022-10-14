<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Cars</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body  align="center"  class="w-75" class="bg-success p-2 text-dark bg-opacity-25" >
    <center>
        <h2>List of Cars</h2>
    <div  class="shadow p-3 mb-5 bg-body rounded container-fluid" >
   <table class="table table-success table-striped">
          <thead class="thead-dark">
            <tr>
                <td>ID</td>
                <td>Make</td>
                <td>Model</td>
                <td>Year</td>
                <td>Color</td>
                <td>Kms</td>
                <td>Price</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${cars}" var="car">
                <tr>
            <td><a href="updateCar/${car.id}">${car.id}</a></td>
                    
                    <td>${car.make}</td>
                    <td>${car.model}</td>
                    <td>${car.yearManufactured}</td>
                    <td>${car.color}</td>
                    <td>${car.kms}</td>
                    <td>${car.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
    </center>
</body>
</div>
</html>