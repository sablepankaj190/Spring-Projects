<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Loan Form</h1>
	<div style="width:80%; text-align:right">
	  ${message}<br/>
	  <a href="home.htm">home</a>
	</div>
	<hr />
	<form action="loan.htm" method = "post">
		<table cellpadding="10" bgcolor="wheat" style="margin: 0px auto">
			<tr>
				<td><spring:message code="name"/></td>
				<td><input type="text" name="txtname" /></td>
			</tr>
			<tr>
				<td><spring:message code="lamt"/></td>
				<td><input type="text" name="txtamt" /></td>
			</tr>
			<tr>
				<td><spring:message code="years"/></td>
				<td><select name="txtyears">
						<option value="5" selected>5</option>
						<option value="10" selected>10</option>
						<option value="15" selected>15</option>
						<option value="20" selected>20</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				  <input type="submit" value="calc emi"/>
				 </td>
				
			</tr>
		</table>
	</form>
</body>
</html>