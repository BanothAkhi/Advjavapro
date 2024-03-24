import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batchprocessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager");
		Statement statement=connection.createStatement();
		
		statement.addBatch("create table stu1(id number,name varchar2(20))");
		statement.addBatch("insert into stu1 values(111,'akhil')");
		statement.addBatch("insert into stu1 values(222,'akhi')");
		statement.addBatch("delete from stu1 where id in (111,222)");
		statement.addBatch("drop table stu1");
		int[] results=statement.executeBatch();
		for(int result:results) {
			System.out.println(result);
		}
		connection.close();

	}

}
