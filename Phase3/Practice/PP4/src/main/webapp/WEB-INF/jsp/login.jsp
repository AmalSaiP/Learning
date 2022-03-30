<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
	<body>
        <c:choose>
    		<c:when test="${param.error}}">
       			Invalid username and password.
    		</c:when>
    		<c:when test="${param.logout}">
        		You have been logged out.
    		</c:when>
    		<c:otherwise>
        		<form action="login" method="post">
            		<div><label> User Name : <input type="text" name="username"/> </label></div>
            		<div><label> Password: <input type="password" name="password"/> </label></div>
            		<div><input type="submit" value="Sign In"/></div>
        		</form>
    		</c:otherwise>
		</c:choose>
    </body>
</html>
