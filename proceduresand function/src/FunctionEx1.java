import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager");
	CallableStatement callableStatement=connection.prepareCall("{?=call getAvg(?,?)}");
	// set the input
	callableStatement.setInt(2, 1111);
	callableStatement.setInt(3, 2222);
	// Register one variable to store the output 
	callableStatement.registerOutParameter(1, Types.FLOAT);
	//Execute the procedure the output will be stored in register form
	callableStatement.executeUpdate();
	System.out.println(callableStatement.getFloat(1));
	connection.close();

	
	
	}
}
