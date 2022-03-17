<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post"> 
Enter Id:<input type="text" name="id"/><br/>
Enter Product:<input type="text" name="product"/><br/>
Enter Model:<input type="text" name="model"/><br/>
Enter Price:<input type="text" name="price"/><br/>
<input type="submit" name="register" value="Register Details"/>



</form>
<%
		if(request.getParameter("register")!=null){%>
		<jsp:useBean id="user" class="com.user" scope="request"></jsp:useBean>
		<jsp:setProperty property="*" name="user"/>	
		<jsp:forward page="product"></jsp:forward>	
			
		 <%}
	%>

</body>
</html>