<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Employee</h1>
<hr>
<form action="./updatecustm" method="post">
<table>
   <tr>
   		<td>Cid : </td>
   		<td><input type="text" name="cid" value="${customer.cid}" readonly="readonly"></td>
   </tr>
   <tr>
   		<td>Cname : </td>
   		<td><input type="text" name="cname" value="${customer.cname}"></td>
   </tr>
	<tr>
   		<td>Ptype : </td>
   		<td><input type="text" name="ptype" value="${customer.ptype}"></td>
   </tr>
   <tr>
   		<td>Pcost : </td>
   		<td><input type="text" name="pcost" value="${customer.pcost}"></td>
   </tr>
   <tr>
   		<td><input type="submit" value="Update"></td>
   		<td><input type="reset" value="Reset"></td>
   </tr>
</table>
<a href="./findallcustm">All Customers</a>
</form>
</body>
</html>