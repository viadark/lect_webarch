<%@ page contentType = "text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="name" value="홍길동" />
<c:set var="age" value="20" />

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>title</title>
    </head>
    <body>
        <h1> ${name} </h1>
        <h1> ${age} </h1>
        <hr>
        <h1> ${k1} </h1>
        <h1> ${k2} </h1>
    </body>
</html>