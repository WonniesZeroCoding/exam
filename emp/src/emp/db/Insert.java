package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.ResultSet;

public class Insert {
	public static void main(String[] args) {
		Connection con = null;
//		ResultSet rs = null; sql insert 문은 result 문이 안들어감
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url, user, password);
			if(con!=null) {
				String sql= "insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
				sql += "values(7209,'TEST_USER9','MANAGER',7201,'2016-03-10',1400,NULL,80)"; //SQL 구문에서 문자는 홑따옴표. java에서 넣어줄 떄도 똑같이 집어넣을것
				
				pstmt = con.prepareStatement(sql);
				
				// insert, update, delete 작업은 executeUpdate. executeQuerry쓰면 안됨
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println("삽입 성공");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
