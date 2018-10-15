<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2 style="color:red">Welcome to User Registration Page...!</h2>
<form:form action="insert" method="post" modelAttribute="user">
<pre>
<h3>

Enter UserName :<form:input path="userName"/>
Enter UserEmail :<form:input path="userEmail"/>
Enter UserMobile :<form:input path="userMobile"/>
Enter UserAddress :<form:textarea path="userAddress"/>
<input type="submit" value="Register">
</h3>
</pre>
</form:form>
</center>
</body>
</html>