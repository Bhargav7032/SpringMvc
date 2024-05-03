<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All CUSTOMER</h1>
<hr>
	<table border="1px;">
		<tr>
			<th>Cid</th>
			<th>Cname</th>
			<th>Ptype</th>
			<th>Pcost</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		
		<c:forEach items="${customers}" var="customer">
		<tr>
			<td><c:out value="${customer.cid}"></c:out></td>
			<td><c:out value="${customer.cname}"></c:out></td>
			<td><c:out value="${customer.ptype}"></c:out></td>
			<td><c:out value="${customer.pcost}"></c:out></td>
			<td><a href="./deletecustmbyid?cid=${customer.cid}">Delete</a></td>
			<td><a href="./updatecustmbyid?cid=${customer.cid}">Update</a></td>
		</tr>
	
		
		</c:forEach>

	</table>
	<a href="./addCustomer">Add Customer</a> 
</body>
</html>