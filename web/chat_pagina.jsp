<%--
  Created by IntelliJ IDEA.
  User: alci
  Date: 4/29/19
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h3>Je bent nu : <b id="statusoutput"></b></h3>
<form>
    <label for="statusinput">je nieuwe status : </label>
    <input id="statusinput">
    <button id="statusbutton">change your status</button>
</form>
<h3>Vriendenlijst</h3>
    <ul>
    <c:forEach items="${user.vrienden}" var="vriend">
        <li>${vriend.firstName} ${vriend.lastName} : ${vriend.status}</li>
    </c:forEach>
    </ul>

</body>
</html>