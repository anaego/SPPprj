<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 28.04.2017
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test DB connection</title>
</head>
<body>
<form  name="LoginForm" action="${pageContext.request.contextPath}/MainController" id="test" method="POST">
    <input type="hidden" name="command" value="test" />
    <input type="submit" id="submit" value="test"/>
</form>

<table>
    <TH>Id</th>
    <TH>Login</th>
    <!--<TH>Name</th>
    <TH>Surname</th>
    <TH>Fathersname</th>
    <TH>Passport number</th>
    <TH>email</th>-->
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}" /><td>
            <td><c:out value="${user.login}" /><td>
            <!--<td><c:out value="${user.name}" /><td>
            <td><c:out value="${user.surname}" /><td>
            <td><c:out value="${user.fathersName}" /><td>
            <td><c:out value="${user.passportNumber}" /><td>
            <td><c:out value="${user.email}" /><td>-->
        </tr>
    </c:forEach>
</table>

</body>
</html>
