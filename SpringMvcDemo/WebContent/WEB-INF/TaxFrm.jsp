<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Tax Form</h1>
	<div style="width:80%; text-align:right">
	  ${initParam.slogan}
	  <a href="home.htm">home</a>
	</div>
	<hr />
	<form action="tax.htm" method="post">
		<table cellpadding="10" bgcolor="cyan" style="margin: 0px auto">
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="txtname"/></td>
			</tr>
			<tr>
				<td>Annual Income</td>
				<td><input type="text" name="txtincome"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				   <input type="submit" value="calc tax"/>
				</td>
				
			</tr>
		</table>
	</form>
</body>
</html>