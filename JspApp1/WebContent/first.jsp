<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<!-- Basic Application -->
	
	<!-- Declaration -->
	<%!
		Date d=null;
	%>
	
	<!-- Scriptlets -->
	<%
		d= new Date();
	%>
	
	<!-- Expression -->
	Today Date is =<%=d %>

</body>
</html>