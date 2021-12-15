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
    //Statement stmt = null;
    PreparedStatement pstmt = null;
    String sql = "insert into student values(?, ?)";
    try {
        conn = DriverManager.getConnection(oracleURL, id, pass);
        //stmt = conn.createStatement();
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "임꺽정");
        pstmt.setInt(2, 50);
        pstmt.execute();
        out.print("data 입력됨");
    }catch(Exception ex) {
        out.print("error :" + ex.getMessage());
    }finally{
        conn.close();
    }
%>