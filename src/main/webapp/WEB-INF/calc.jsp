<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calc</title>
    <link rel="stylesheet" href="css/main.css">
    <link href="https://www.w3schools.com/w3css/4/w3.css" rel="stylesheet">
</head>
<body>
<div class="w3-display-container" style="min-height: 100%">
    <div class="w3-display-middle w3-card" style="width: 40%">
        <form class="w3-container w3-padding-large" method="get" action="calc">

            <c:if test="${incorrectResult}">
            <div class="w3-panel w3-red w3-display-container">
                <span onclick="this.parentElement.style.display='none'" class="w3-button w3-display-topright">&times;</span>
                <h3>Incorrect!</h3>
                <h4>The correct answer is:</h4>
                <p>${number1} + ${number2} = ${sum}</p>
            </div>
            </c:if>

            <h1>Do the math:</h1>
            <h1>${number1} + ${number2} = </h1>
            <input id="userResult" name="result" type="number" value="userResult">
            <button type="submit" class="w3-button w3-large w3-black w3-round-large" href="calc1" value="${userResult}">Check</button>
        <%--<a class="w3-button w3-large w3-black w3-round-large" onclick="" href="sum">Check</a>--%>
        </form>
    </div>
</div>

</body>
</html>
