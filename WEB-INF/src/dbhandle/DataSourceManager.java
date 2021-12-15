package dbhandle;

import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

// DataSourceManager mg = new DataSourceManager();
//싱글톤 패턴
// 1.static 객체생성
// 2.private 생성자.
public class DataSourceManager 
{
    private static DataSourceManager instance = new DataSourceManager();
    private DataSource dataSource;
    
    private DataSourceManager()
    {
        BasicDataSource dbcp = new BasicDataSource();
        
		dbcp.setDriverClassName("oracle.jdbc.OracleDriver");
		dbcp.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		dbcp.setUsername("goorm");
		dbcp.setPassword("goorm");
		
		//setInitialSize( ) : 처음 로드될 떄 생성할 connection 개수 설정
		dbcp.setInitialSize(3);
		//setMaxTotal( ) : 사용할 최대 connection 개수 설정
		dbcp.setMaxTotal(10);    
        this.dataSource = dbcp;
    }
    
    public static DataSourceManager getInstance() {
		return instance;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
}
