package dbhandle;
import java.sql.*;
import java.util.jar.Attributes.Name;

import javax.sql.DataSource;

import sun.util.calendar.BaseCalendar.Date;
import java.util.ArrayList;

import dto.*;

public class ProductionPoolDAO {
    
    DataSource dataSource;
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    public ProductionPoolDAO()
    {
        try{
            DataSourceManager mgr = DataSourceManager.getInstance();
            this.dataSource = mgr.getDataSource(); //dbpool
            //dbpool 로부터 사용하지 않는 connection을 반환받는다..
            conn = dataSource.getConnection(); 
        }catch( Exception ex){
            
        }
    }
    
    public String insertData( String name, int quantity, String prod){
        try{
            String sql="insert into product values(?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString( 1,name);
            pstmt.setInt( 2,quantity);
            pstmt.setString(3, prod);
            pstmt.execute();
            conn.close(); //db pool에 connection 반환..
            return "insert success";
        }catch( Exception ex){
            return "error:"+ ex.getMessage();
        }            
    }
    public String deleteData(String name)
    {
        try{
            String sql="delete from product where pname=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString( 1,name);
            pstmt.execute();
            return "delete success";
        }catch( Exception ex){
            return "error:"+ ex.getMessage();
        }            
    }
    public ArrayList<ProductionDTO> searchData(String name)
    {
        ArrayList<ProductionDTO> arr = new ArrayList<ProductionDTO>();
        String sql=String.format("select * from product where pname like '%%%s%%'", name);
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery( sql );
            while( rs.next())
            {
                String pname=rs.getString("pname");
                int quantity=rs.getInt("pcnt");
                String prod=rs.getString("pubdate");
                arr.add( new ProductionDTO(pname, quantity, prod) );
            }
            rs.close();
            return arr;
        }catch( Exception ex){
            return null;
        }
    }
    public String modifyData( String name, int quantity, String prod){
        try{
            String sql="update product set pcnt=?, pubdate=? where pname=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt( 1,quantity);
            pstmt.setString( 2,prod);
            pstmt.setString(3, name);
            pstmt.execute();
            conn.close(); //db pool에 connection 반환..
            return "modify success";
        }catch( Exception ex){
            return "error:"+ ex.getMessage();
        }            
    }
    public ArrayList<ProductionDTO> selectData()
    {
        ArrayList<ProductionDTO> arr = new ArrayList<ProductionDTO>();
        String sql="select * from product";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery( sql );
            while( rs.next())
            {
                String name=rs.getString("pname");
                int quantity=rs.getInt("pcnt");
                String prod=rs.getString("pubdate");
                arr.add( new ProductionDTO(name, quantity, prod) );
            }
            rs.close();
            return arr;
        }catch( Exception ex){
            return null;
        }        
    }
}
