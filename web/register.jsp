<%--
  Created by IntelliJ IDEA.
  User: alci
  Date: 5/25/19
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="header.jsp"></jsp:include>
<body>
<c:if test="${errors.size()>0 }">
    <div class="danger">
        <ul>
            <c:forEach var="error" items="${errors }">
                <li>${error }</li>
            </c:forEach>
        </ul>
    </div>
</c:if>
<form method="post" action="Controller?action=CreatePerson">
    <p>
        <label for="firstname">Voornaam </label>
        <input type="text" id="firstName" name="firstName">
    </p>
    <p>
        <label for="lastname">Naam </label>
        <input type="text" id="lastName" name="lastName">
    </p>
    <p>
        <label for="userId">Email </label>
        <input type="text" id="userId" name="userId">
    </p>
    <p>
        <label for="gender">Geslacht </label>
        <select id="gender" name="gender">
            <option value="male">Man</option>
            <option value="female">Vrouw</option>
        </select>
    </p>
    <p>
        <label for="age">Leeftijd </label>
        <input type="number" id="age" name="age">
    </p>
    <p>
        <label for="password">Wachtwoord </label>
        <input type="password" id="password" name="password">
    </p>
    <p>
        <label for="passwordrepeat">Herhaal wachtwoord </label>
        <input type="password" id="passwordrepeat" name="passwordrepeat">
    </p>
    <p>
        <input type="submit" id="register" value="Registreer uw account">
    </p>
</form>
</body>
</html>