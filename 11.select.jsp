<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="java.sql.*" %>
<%	
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        out.print("driversuccess");
    } catch(Exception ex) {
        out.print("error :" + ex.getMessage());
    }
    String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe";
    String id="goorm";
    String pass="goorm";
    Connection conn = null;
    Statement stmt = null;
    //PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "select * from student";
    try {
        conn = DriverManager.getConnection(oracleURL, id, pass);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        out.print("<table>");
        out.print("<thead>");
        out.print("<tr><th>이름</th><th>나이</th></tr>");
        out.print("</thead>");
        out.print("<tbody>");
        while(rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            //String s = String.format("<h1> 이름 : %s, 나이 : %d </h1>", name, age);
            String s = String.format("<tr><td>%s</td><td>%d</td></h1>", name, age);
            out.print(s);
        }
        out.print("</tbody>");
        
    }catch(Exception ex) {
        out.print("error :" + ex.getMessage());
    }finally{
        conn.close();
    }
%>