<%@ page language="java" contentType="text/html; charset=UTF-16"
    pageEncoding="UTF-16"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
<style>
  #div1{
      background-color: wheat;
      width: 200px;
      margin:0px auto;
      height:200px;
      padding:10px;
  }
  #div1 a{
     text-decoration:none;
     padding:10px;
     background-color: red;
     box-shadow: 5px 5px 5px black;
     color:white;
  }
  #div1 a:hover{
     background-color: yellow;
     color:black;
  }
  ul{
    list-style: none
  }
  li{
    margin-bottom:30px;
  }
</style>
</head>
<body>
<h1 align="center">Home</h1>
<hr/>
<h2 align="center">Welcome to Hexaware</h2>
<div id="div1">
  <ul>
    <li><a href="taxfrm.htm">Calculat Tax</a></li>
    <li><a href="loanfrm.htm">Calculate EMI</a></li>
    <li><a href="viewall.htm">View All Employee</a></li>
    
  </ul>

</div>

</body>
</html>