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
    String sql = "insert into student values('홍길동', 20)";
    try {
        conn = DriverManager.getConnection(oracleURL, id, pass);
        stmt = conn.createStatement();
        stmt.execute(sql);
        out.print("data 입력됨");
    }catch(Exception ex) {
        out.print("error :" + ex.getMessage());
    }finally{
        conn.close();
    }
%>