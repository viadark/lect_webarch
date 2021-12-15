<%@ page contentType = "text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>피자주문리스트</title>
    </head>
    <body>
        <table>
            <thead><tr><th>이름</th><th>전화번호</th><th>이메일</th><th>피자크기</th><th>토핑</th><th>주문시간</th><th>요청사항</th></tr></thead>
            <tbody>
                <c:forEach var="std" items="${stdArr}">
                    <tr><td>${std.name}</td><td>${std.telno}</td><td>${std.email}</td><td>${std.getPizzaSize()}</td><td>${std.getToppingList()}</td><td>${std.getDeliverTime()}</td><td>${std.req}</td></tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>