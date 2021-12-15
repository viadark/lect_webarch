package dbhandle;

import java.sql.*;
import java.util.ArrayList;
import dto.*;

public class PizzaDAO {
    
    String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe";
    String id="goorm";
    String pass="goorm";
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    public PizzaDAO()
    {
       try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection( oracleURL, id, pass) ;      
        }catch( Exception ex){
            System.out.println("error:"+ ex.getMessage() );
        }        
    }
    
    public String insertData(String name, String telno, String email, String pizza_size, String topping_list, String deliver_time, String req)
    {
        try{
            String sql="insert into pizza values(?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString( 1,name);
            pstmt.setString( 2,telno);
            pstmt.setString( 3,email);
            pstmt.setString( 4,pizza_size);
            pstmt.setString( 5,topping_list);
            pstmt.setString( 6,deliver_time);
            pstmt.setString( 7,req);
            pstmt.execute();
            return "insert success";
        }catch( Exception ex){
            return "error:"+ ex.getMessage();
        }            
    }
    
    public ArrayList<PizzaDTO> selectData()
    {
        ArrayList<PizzaDTO> arr = new ArrayList<PizzaDTO>();
        String sql="select * from pizza";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery( sql );
            while( rs.next())
            {
                String name=rs.getString("name");
                String telno=rs.getString("telno");
                String email=rs.getString("email");
                String pizzasize=rs.getString("pizzasize");
                String topping=rs.getString("topping");
                String time=rs.getString("time");
                String req=rs.getString("req");
                arr.add( new PizzaDTO(name, telno, email, pizzasize, topping, time, req) );
            }
            rs.close();
            return arr;
        }catch( Exception ex){
            return null;
        }        
    }
}

