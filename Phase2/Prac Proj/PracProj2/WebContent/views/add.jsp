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

<form  action="success.jsp" method="post">

ID : <input type="text" name="id" /><br>
NAME : <input type="text" name="name" /><br>
PRICE <input type="text" name="price" /><br>
<button type="submit" >Add Product</button>

</form>


</body>

<jsp:include page="footer.jsp"></jsp:include>

</html>