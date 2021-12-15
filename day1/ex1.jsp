<%@ page contentType = "text/html;charset=utf-8" %>
<%	
    // request, response
    Integer h = Integer.parseInt(request.getParameter("height"));
    Integer w = Integer.parseInt(request.getParameter("weight"));
    Double r = w / ((h - 100) * 0.85);
    r = r * 100;
    out.println("키 : " + h + "<br>");
    out.println("몸무게 : " + w + "<br>");
    String res;
    String imagePath;
    if(r >= 120) {
        res = "비만";
        imagePath = "obese";
    }
    else if(r >= 110) {
        res = "과체중";
        imagePath = "over";
    }
    else if(r >= 90) {
        res = "정상";
        imagePath = "normal";
    }
    else {
        res = "저체중";
        imagePath = "under";
    }
    out.println("결과 : " + res);
    out.println("<image src='./image/" + imagePath + ".png'>");
%>

