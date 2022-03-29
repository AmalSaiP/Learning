<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>
<h1 style="align-content: center;">Product Dashboard</h1>

	<form action="/Sample_Mini_Project/ProductServlet">
	<button type="submit" name="action" value="add" >Add Product</button>
	<button type="submit" name="action" value="update"  >Update Product</button>
	<button type="submit" name="action" value="get"  >Get Product</button>
	<button type="submit" name="action" value="delete" >Delete Product</button>
	<button type="submit" name="action" value="getall" >Get All Product</button>
	
	

</body>


<br/>
<br/>

<%@ include file="footer.jsp" %>

</html>