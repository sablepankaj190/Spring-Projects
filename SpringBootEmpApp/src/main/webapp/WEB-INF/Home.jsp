<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
<%@include file="Header.jsp"%>
<article>
<h2>Home</h2>

<nav>
   <a href="viewall"><div>View All Employee</div></a>
   <a href="viewdepts"> <div>View Departments</div></a>
   <a href="viewbyid"> <div>View By ID</div></a>
   <a href="add"><div>Add Employee</div></a>
</nav>
<div style="text-align:center">
    ${msg}
</div>

</article>
</body>
</html>