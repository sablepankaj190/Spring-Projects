<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
</head>
<body>
<article>
  <h2 align="center">Employee Details</h2>
  <div style="width:80%; text-align:right">
	  ${message}<br/>
	  <a href="home.htm">home</a>
	</div>
	<hr />
  <table cellpadding="10" bgcolor="wheat" cellspacing="0" style="margin:0px auto">
   <thead>
      <tr bgcolor="red" style="color:white">
        <th>Emp ID</th>
        <th>Emp Name</th>
        <th>Salary</th>
        <th>Dept</th>
        <th>DOJ</th>
        <th></th>
        <th></th>
      </tr>
   </thead>
    <tbody>
       <c:forEach items="${elist}" var="emp">
           <tr>
             <td>${emp.eid}</td>
             <td>${emp.ename}</td>
             <td>${emp.sal}</td>
             <td>${emp.dept}</td>
             <td>${emp.doj}</td>
             
           </tr>
       </c:forEach>
    
    </tbody>
  </table>
</article>


</body>
</html>




