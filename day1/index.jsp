<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="example.*" %> 
<%
    HelloWorld h = new HelloWorld();
%>
<html>
<body>
    Goorm = <%=h.hello() %>
    <h1>
        test
    </h1>
</body>	
</html>
