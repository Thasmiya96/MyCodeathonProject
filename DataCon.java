import java.sql.*;

public class DataCon
{
	public static Connection con;
	
	static
	{
	try{
	      Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","thasmiya");
	      }catch(Exception e){}
        }

	}