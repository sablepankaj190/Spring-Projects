<%@include file="Meta.jsp" %>
<html>
<%@include file="HeadSection.jsp" %>
<body>
<%@include file="Header.jsp" %>
<article>
  <h2>Employee Details</h2>
  <c:if test="${param.dept ne null}">
     <h3 align="center">Department: ${param.dept}</h3>
  </c:if>
  <table>
   <thead>
      <tr>
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
             <td name="empid">${emp.empId}</td>
             <td>${emp.empName}</td>
             <td>${emp.empSal}</td>
             <td>${emp.dept}</td>
             <td>${emp.doj}</td>
             <td><a href="">edit</a></td>
             <td><a href="removeemp/empid">remove</a></td>
           </tr>
       </c:forEach>
    
    </tbody>
  </table>
</article>


</body>
</html>




