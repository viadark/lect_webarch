<%@ page contentType = "text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>title</title>
    </head>
    <body>
        <table>
            <thead><tr><th>이름</th><th>나이</th></tr></thead>
            <tbody>
                <c:forEach var="std" items="${stdArr}">
                    <tr><td>${std.name}</td><td>${std.age}</td></tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>