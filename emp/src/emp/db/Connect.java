package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) {
		// 1) 데이터 베이스 서버와 연결하는 작업 // 해당 작업 package는 전부 java.sql로 연결(import)
		
		
		try {
			// 서버와 연결하기 위해 가장 우선 - 드라이버 로드 // 예전 연결 드라이버 "oracle.jdbc.driver.OracleDriver"
			Class.forName("oracle.jdbc.OracleDriver");
			// 데이터 베이스 연결을 위한 문자열 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // url은 정해져 있음 
			String user = "scott"; 
			String password = "TIGER";
			//드라이버 매니저를 통해 연결 시도
			Connection con=DriverManager.getConnection(url, user, password);
			if(con!=null) {
				System.out.println("연결 성공"); // java.lang.ClassNotFoundException: oracle.driver.oracledriver --> 못찾겠다는 의미
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
