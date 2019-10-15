<%@include file="Meta.jsp" %>
<html>
<%@include file="HeadSection.jsp" %>
<body>
<%@include file="Header.jsp" %>
<article>
  <h2>Department Details</h2>
  <c:if test="${param.dept ne null}">
     <h3 align="center">Department: ${param.dept}</h3>
  </c:if>
  <table>
   <thead>
      <tr>
        <th>Dept Name</th>
      </tr>
   </thead>
    <tbody>
       <c:forEach items="${dlist}" var="dept">
           <tr>
             <td>${dept.dname}</td>
           </tr>
       </c:forEach>
    
    </tbody>
  </table>
</article>


</body>
</html>