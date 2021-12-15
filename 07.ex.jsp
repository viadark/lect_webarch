<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="java.sql.*" %>
<%	
    String name = request.getParameter("myname");
    String age = request.getParameter("myage");
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // out.print("driversuccess");
    } catch(Exception ex) {
        out.print("error :" + ex.getMessage());
    }
    String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe";
    String id="goorm";
    String pass="goorm";
    Connection conn = null;
    Statement stmt = null;
    String sql = String.format("insert into student values('%s', %s)", name, age);
    try {
        conn = DriverManager.getConnection(oracleURL, id, pass);
        stmt = conn.createStatement();
        stmt.execute(sql);
        out.print("추가되었습니다<br>");
    }catch(Exception ex) {
        out.print("error :" + ex.getMessage());
    }finally{
        conn.close();
    }
%>