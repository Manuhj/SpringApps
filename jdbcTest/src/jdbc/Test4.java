package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println(con);
	}

}
