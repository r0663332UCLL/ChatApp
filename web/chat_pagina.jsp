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
    <label for="statusinput">je nieuwe status : </label>
    <input id="statusinput">
    <button id="statusbutton">change your status</button>
<h3>Vriendenlijst</h3>
    <ul id="vrienden"></ul>
<h3>Voeg een vriend toe</h3>
    <label for="vriendinput">e-mail van je vriend : </label>
    <input id="vriendinput">
    <button id="addvriendbutton">voeg vriend toe</button>

<script type="text/javascript" src="js/status.js"></script>
<script type="text/javascript" src="js/addfriend.js"></script>
<script type="text/javascript" src="js/getfriends.js"></script>