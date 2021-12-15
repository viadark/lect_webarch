<%@ page contentType = "text/html;charset=utf-8" %>

<%
    out.print("<h1>"+s1+"</h1>");
    out.print(fn());
%>
<%!
    // 선언문
    String s1 = "Hello";
    String fn() {
        return "string fn";
    }
%>
<h2>
    <%=s1 %>
</h2>