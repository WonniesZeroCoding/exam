package java_and_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRe {
	public static void main(String[] args) {
		
		PreparedStatement pstmt =null;
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				String sql = "update exam_emp set deptno=70 where empno=7902 ";
				pstmt = con.prepareStatement(sql);
				
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println("업데이트 성공");
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
