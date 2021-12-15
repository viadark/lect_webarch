package dbhandle;
import java.sql.*;
import javax.sql.DataSource;

public class StudentDAO {
    
    DataSource dataSource;
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    public StudentDAO()
    {
        try{
            DataSourceManager mgr = DataSourceManager.getInstance();
            this.dataSource = mgr.getDataSource(); //dbpool
            //dbpool 로부터 사용하지 않는 connection을 반환받는다..
            conn = dataSource.getConnection(); 
        }catch( Exception ex){
            
        }
    }
    
    public String insertData( String name, int age){
        try{
            String sql="insert into student values(?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString( 1,name);
            pstmt.setInt( 2,age);
            pstmt.execute();
            conn.close(); //db pool에 connection 반환..
            return "insert success";
        }catch( Exception ex){
            return "error:"+ ex.getMessage();
        }            
    }    
}