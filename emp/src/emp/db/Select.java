package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		// 데이터베이스 서버와 연결 
		Connection con = null;
		PreparedStatement pstmt=null; // sql 쿼리문 전송하는데 사용
		ResultSet rs=null; // 쿼리문 결과를 담는 객체
		try {
			
			// 1)드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//문자열 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				
				String sql = "select * from emp where empno=7369"; // java에서 쿼리문은 전부 문자열 String
				
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery(); // <== 실제로 쿼리문을 실행하는 부분
				
				// rs 담긴 결과를 화면 출력
				if(rs.next()) { // if(rs.next()) resultset에 결과가 담겨 있는지 확인
					//컬럼 하나씩 가져오기
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					int mgr = rs.getInt("mgr");
					String hiredate = rs.getString("hiredate");
					int sal = rs.getInt("sal");
					int comm = rs.getInt("comm");
					int deptno = rs.getInt("deptno");
				
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n",empno,ename,job,mgr,hiredate,sal,comm,deptno);	
				}	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
