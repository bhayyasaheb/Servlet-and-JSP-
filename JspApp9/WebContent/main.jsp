<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<body>

<!-- We are getting data from form page here form.html -->
	<%!
		int eid;
		String ename;
		double esal;
	%>
	
	<%
		eid = Integer.parseInt(request.getParameter("eid"));
		ename = request.getParameter("ename");
		esal =Double.parseDouble(request.getParameter("esal"));
	%>
	
	<!-- Configuration of Bean class -->
	
	<jsp:useBean id="eb" class="com.sbk.EmpBean" scope="application"/>
	
	<!-- Setting the data to bean class -->
	
	<jsp:setProperty property="eid" name="eb" value="<%=eid %>"/>
	<jsp:setProperty property="ename" name="eb" value="<%=ename %>"/>
	<jsp:setProperty property="esal" name="eb" value="<%=esal %>"/>
	
	<h5>*****************Employee Details****************</h5>
	
	<!-- Getting data from Bean class -->
	
	Employee Id : <jsp:getProperty property="eid" name="eb"/><br>
	Employee Name : <jsp:getProperty property="ename" name="eb"/><br>
	Employee Salary : <jsp:getProperty property="esal" name="eb"/>

</body>
</html>