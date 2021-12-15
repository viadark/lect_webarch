<%@ page contentType = "text/html;charset=utf-8" %>
<%	
    // request, response
    Integer y = Integer.parseInt(request.getParameter("year"));
    if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
        out.print("윤년입니다.");
    }
    else {
        out.print("윤년이 아닙니다.");
    }
%>

