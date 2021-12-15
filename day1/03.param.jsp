<%@ page contentType = "text/html;charset=utf-8" %>
<%	
    // request, response
    String name = request.getParameter("myname");
    String age = request.getParameter("myage");
    String s = String.format("<h1> 이름: %s </h1>", name);
    out.print(s);
%>

