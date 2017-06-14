<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<body>

	<%!
		String uname;
		String upwd;
	%>
	
	<%
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		if(uname.equals("Bhayyasaheb") && upwd.equals("SBK"))
		{
			out.println("Login Success!");
		}
		else
		{
			out.println("Login Failed! so try with valid username and password!");
		}
	%>
	
	Welcome User = <%=uname %>
	
</body>
</html>