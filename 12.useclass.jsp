<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="mylib.*"%>
<%	
    MyTest obj = new MyTest();
    out.print("<h1>"+ obj.myfn() + "</h1>");
%>

<h1>
    <%= obj.myfn() %>
</h1>