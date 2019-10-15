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
	<h1 align="center">Emi Calculation</h1>
	<div style="width:80%; text-align:right">
	${initParam.slogan}
	  <a href="home.htm">home</a>
	</div>
	<hr />
	<table cellpadding="10" bgcolor="wheat" style="margin: 0px auto">
		<tr>
			<td>name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td><spring:message code="lamt"/></td>
			<td>${param.txtamt}</td>
		</tr>
		<tr>
			<td><spring:message code="years"/></td>
			<td>${param.txtyears}</td>
		</tr>
		<tr>
			<td><spring:message code="ci"/></td>
			<td>${ci}</td>
		</tr>
		<tr>
			<td><spring:message code="emi"/></td>
			<td>${emi}</td>
		</tr>
	</table>
</body>
</html>