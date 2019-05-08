<%--
  Created by IntelliJ IDEA.
  User: alci
  Date: 5/8/19
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="topic1">
    <p>
        Hoe was de projectweek?
    </p>
    <ul id="topic1-comments"></ul>
    <ul>
        <li><input id="comment1" type="text" placeholder="Laat een comment achter "></li>
        <li><input id="naam1" type="text" placeholder="naam"></li>
        <li><input id="rating1" type="number" min="0" max="10" placeholder="rating" ></li>
        <button id="button1" onclick="send(1)">Commit</button>
    </ul>
</div>

<div id="topic2">
    <p>Wat ben je van plan om te doen vandaag</p>
    <ul id="topic2-comments"></ul>
    <ul>
        <li><input id="comment2" type="text" placeholder="Laat een comment achter"></li>
        <li><input id="naam2" type="text" placeholder="naam"></li>
        <li><input id="rating2" type="number" min="0" max="10" placeholder="rating" ></li>
        <button id="button2" onclick="send(2)">Commit</button>
    </ul>
</div>

<div id="topic3">
    <p>Naar welke muziek luister je</p>
    <ul id="topic3-comments"></ul>
    <ul>
        <li><input id="comment3" type="text" placeholder="Laat een comment achter"></li>
        <li><input id="naam3" type="text" placeholder="naam"></li>
        <li><input id="rating3" type="number" min="0" max="10" placeholder="rating" ></li>
        <button id="topic3-button" onclick="send(3)">Commit</button>
    </ul>
</div>

<div id="topic4">
    <p>Wat zijn de examen vragen van web4</p>
    <ul id="topic4-comments"></ul>
    <ul>
        <li><input id="comment4" type="text" placeholder="Laat een comment achter"></li>
        <li><input id="naam4" type="text" placeholder="naam"></li>
        <li><input id="rating4" type="number" min="0" max="10" placeholder="rating" ></li>
        <button id="button4" onclick="send(4)">Commit</button>
    </ul>
</div>

<div id="topic5">
    <p>Waarom zouden we best JavaScript als misdaad tegen de mensheid categoriseren</p>
    <ul id="topic5-comments" ></ul>
    <ul>
        <li><input id="comment5" type="text" placeholder="Laat een comment achter"></li>
        <li><input id="naam5" type="text" placeholder="naam"></li>
        <li><input id="rating5" type="number" min="0" max="10" placeholder="rating" ></li>
        <button id="button5" onclick="send(5)">Commit</button>
    </ul>
</div>
<script type="text/javascript" src="js/blog.js"></script>