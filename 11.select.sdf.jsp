<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
          <meta charset="utf-8">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
          <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>        
        <title>
            title
        </title>
    </head>
    <body>
        <div class="container">
<%	
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //out.print("driver load success");
    }catch( Exception ex){
        out.print("error:"+ ex.getMessage() );
    }
    String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe";
    String id="goorm";
    String pass="goorm";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql="select * from student";
    try{
        conn = DriverManager.getConnection( oracleURL, id, pass) ;      
        stmt = conn.createStatement();
        rs = stmt.executeQuery( sql );
        out.print("<table class='table table-striped'>");
        out.print("<thead>");
        out.print("<tr><th>이름</th><th>나이</th></tr>");
        out.print("</thead>");
        out.print("<tbody>");
        while( rs.next())
        {
            String name=rs.getString("name");
            int age=rs.getInt("age");
            //String s = String.format("<h1>이름:%s 나이:%d</h1>",name,age);
            String s = String.format("<tr><td>%s</td><td>%d</td></tr>",name,age);
            out.print(s);
        }
        out.print("</tbody>");
        out.print("</table>");
        rs.close();
    }catch( Exception ex){
        out.print("error:"+ ex.getMessage() );
    }finally{
        conn.close();
    }
%>
        </div>
    </body>
</html>