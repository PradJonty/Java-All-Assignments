<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC</title>
</head>
<body>
<form action="newCar" method="post">
  <table>
   <tr>
     <td>Make</td>
     <td><input type="text" name="make" />
     </tr>
    <tr>
     <td>Model</td>
     <td><input type="text" name="model" />
  </tr>
  <tr>
     <td>Year</td>
     <td><input type="text" name="yearManufactured" />
     </tr>
     <tr>
     <td>Color</td>
     <td><input type="text" name="color" />
     </tr>
     <tr>
     <td>Kms</td>
     <td><input type="text" name="kms" />
   </tr>
    <tr>
     <td>Price</td>
     <td><input type="text" name="price" />
   </tr>
   <tr>
     
     <td><input type="submit" name="submit" value="Save" />
        <td><input type="submit" name="submit" value="Cancel" />
     
   </tr>
</table>
</form>


</body>
</html>