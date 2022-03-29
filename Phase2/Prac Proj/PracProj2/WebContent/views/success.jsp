<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>
<jsp:useBean id="product" class="com.simplilearn.ecommerce.entity.Product" 
scope="session">
</jsp:useBean>

<jsp:setProperty  name="product"   property="*"   />




<jsp:getProperty property="id" name="product"/>
<jsp:getProperty property="name" name="product"/>

<sql:setDataSource  var="conn" 
  driver="com.mysql.cj.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/pracproj2"
  user="root"   password="1234" /> 
 
  
Database connection object : ${conn}   <br>




<sql:query dataSource="${conn}" var="rs">

	 SELECT * FROM eproduct WHERE id=3;
	
<%-- <sql:param value="${product.id}"></sql:param> --%>

</sql:query>
<table border="1" style="background-color: yellow;">
<c:forEach var="pro"  items="${rs.rows}"> 

<tr><td>${pro.id}</td> <td>${pro.name }</td> <td>${pro.price }</td> </tr>
</c:forEach>
</table>
<br>

<h1>${count} : Record Effected Successfully ..</h1>

<br/>
<br/>




</body>
</html>