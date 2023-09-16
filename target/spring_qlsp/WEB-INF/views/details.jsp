<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Detail</title>
</head>
<body>
	<h1>Product Detail</h1>
	<h2>${product.code}</h2>
	<h2>${product.name}</h2>
	<p>Price: ${product.price}</p>
	<td><img alt="" src="${product.image}"></td>
	<a href="${pageContext.request.contextPath}/products">Back to
		Product List</a>
</body>
</html>
