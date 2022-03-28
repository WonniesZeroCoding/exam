package java_and_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRe {
	public static void main(String[] args) {
		
			Connection con = null;
			PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver"); 
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				String sql = "insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
					sql += "values(7209,'TEST_USER0','MANAGER',7201,'2015-08-02',2000,NULL,40)";
					
					pstmt = con.prepareStatement(sql);
					
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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
