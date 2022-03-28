package java_and_sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectRe {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결성공");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
