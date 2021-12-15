<%@ page contentType = "text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>title</title>
    </head>
    <body>
        <h1>
            보기
        </h1>
        <table>
            <thead><tr><th>제품명</th><th>수량</th><th>생산일</th></tr></thead>
            <tbody>
                <c:forEach var="std" items="${stdArr}">
                    <tr><td>${std.name}</td><td>${std.quantity}</td><td>${std.prod}</td></tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="./test_main.html" target="_parent">Go To Main</a>
    </body>
</html>