<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 09.09.2020
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="controller" method="post">

    <input type="hidden" name="Time" value="${System.currentTimeMillis()}"/>
    <input type="submit" name="Submit" value="touch me"/>
</form>
</body>
</html>
