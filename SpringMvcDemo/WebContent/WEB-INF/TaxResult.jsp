<%@ page language="java" contentType="text/html; charset=UTF-16"
    pageEncoding="UTF-16"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Tax Result</title>
</head>
<body>
<h1 align="center">Tax Calculation</h1>
	<div style="width:80%; text-align:right">
	    ${initParam.slogan}
	    <a href="home.htm">home</a>
	</div>
	<hr />
	<table cellpadding="10" bgcolor="wheat" style="margin: 0px auto">
		<tr>
			<td>Customer name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>Loan amount</td>
			<td>${param.txtincome}</td>
		</tr>
		<tr>
			<td>Tax to be paid</td>
			<td>${tax}</td>
		</tr>
		
	</table>
</body>
</html>