<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD CUSTOMER</h1>
<hr>
<form action="./savecustm" method="post">
<table>
   <tr>
   		<td>Cid : </td>
   		<td><input type="text" name="cid"></td>
   </tr>
   <tr>
   		<td>Cname : </td>
   		<td><input type="text" name="cname"></td>
   </tr>
	<tr>
   		<td>Ptype : </td>
   		<td><input type="text" name="ptype"></td>
   </tr>
   <tr>
   		<td>Pcost : </td>
   		<td><input type="text" name="pcost"></td>
   </tr>
   <tr>
   		<td><input type="submit" value="Save"></td>
   		<td><input type="reset" value="Reset"></td>
   </tr>
</table>
<a href="./findallcustm">All Customer</a>
 </form>


</body>
</html>
