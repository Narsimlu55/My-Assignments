package myDao;

import java.sql.Connection;
import java.sql.SQLException;





import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

public class JdbcUtils {
    private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
    public static Connection getConnection() throws SQLException{
    	return dataSource.getConnection();
    }
    public static DataSource getDataSource(){
    	return dataSource;
    }
    
}
