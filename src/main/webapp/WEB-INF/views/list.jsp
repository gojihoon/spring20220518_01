<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>list.jsp</h2>
    <c:forEach var="people" items="${peopleList}">
        <!-- items에 쓴것이 반복 대상이다-->
        ${people.name}<br>
        ${people.age}<br>
    </c:forEach>
</body>
</html>
