package java_and_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectRe {
	public static void main(String[] args) {
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				String sql = " select * from emp where empno=7369";
				
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					int mgr = rs.getInt("mgr");
					String hiredate = rs.getString("hiredate");
					int sal = rs.getInt("sal");
					int comm = rs.getInt("comm");
					int deptno = rs.getInt("deptno");
					
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n", empno,ename,job,mgr,hiredate,sal,comm,deptno);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
