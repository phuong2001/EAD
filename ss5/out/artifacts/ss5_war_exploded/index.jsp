<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 24/04/2021
  Time: 2:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Index</title>
    <style>
       table{
         font-family: Arial, sans-serif;
         border-collapse: collapse;
         width: 50%;
       }
      td, th{
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
      }
      tr:nth-child(even){
        background-color: #dddddd;
      }
    </style>
  </head>
  <body>
  <table>
    <tr>
      <th>Id</th>
      <th>name</th>
      <th>price</th>
      <th>quantity</th>
    </tr>
    <c:forEach var="item" items="${requestScope.products}">
      <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.price}</td>
        <td>${item.quantity}</td>
      </tr>
    </c:forEach>

    ${requestScope.message}
  </table>
  </body>
</html>
