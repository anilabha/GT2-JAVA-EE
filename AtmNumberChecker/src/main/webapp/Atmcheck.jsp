<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
     String atm_no;
    
     String result1;

%>

<%
     atm_no  = request.getParameter("data");
     
     result1 = atm_no;

%>

<jsp:useBean id="atm1" class="com.atmchecker.Atm" scope="page" />

<jsp:setProperty name="atm1" property="atm_number" value="<%= result1 %>" />       

<b>ATM NO: </b> <jsp:getProperty name="atm1" property="atm_number" />

<br><br>
<b>Check Result: </b> <jsp:getProperty name="atm1" property="result" />


</body>
</html>