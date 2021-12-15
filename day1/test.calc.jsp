<%@ page contentType = "text/html;charset=utf-8" %>
<%	
    // request, response
    Integer score = Integer.parseInt(request.getParameter("score"));
    String res;
    if(score >= 90) {
        res = "A";
    }
    else if(score >= 80) {
        res = "B";
    }
    else if(score >= 70) {
        res = "C";
    }
    else if(score >= 60) {
        res = "D";
    }
    else {
        res = "F";
    }
    
    out.print(res +"학점을 받았습니다.");
%>

