<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Package</title>
</head>
<body>

${hellosmg}



<%-- <form  action="trackForm" method="post">
	<label for="tnum" >Enter Your Tracking Number: </label><br>
	<input type="text" id="tnum" name="tnum" ><br>
	
	
	<input type="submit" value="Track">
	
	</form> --%>
	
	<form:form method="post" action="createPack" modelAttribute="createPackage">
		<table>
			<tr>
				<td><form:label path="sender">
						Sender: 
					</form:label></td>
				<td><form:input path="sender" /></td>
			</tr>
			<tr>
				<td><form:label path="receiver">
						Receiver
					</form:label></td>
				<td><form:input path="receiver" /></td>
			</tr>
			<tr>
				<td><form:label path="address">
						Address: 
					</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>



</body>
</html>