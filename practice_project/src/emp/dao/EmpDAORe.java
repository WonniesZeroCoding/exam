package emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import emp.dto.EmpDTORe;

public class EmpDAORe {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Connection getConnetion () {
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public List<EmpDTORe> getList() {
		List<EmpDTORe> list = new ArrayList<EmpDTORe>();
		con = getConnetion();
		String sql = "Select * from exam_emp";
		try {
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				EmpDTORe dto = new EmpDTORe(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	// 사원 정보 조회
	public EmpDTORe getRow(int empno) {
		
		EmpDTORe dto = null;
		String sql = "select empno, ename, job, hiredate, deptno from exam_emp where empno=?";
		try {
			con = getConnetion();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new EmpDTORe();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	// 정보 업데이트
	public boolean update(int empno, int mgr) {
		String sql = "update exam_emp set mgr=? where empno=?";
	
		try {
			con = getConnetion();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mgr);
			pstmt.setInt(2, empno);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
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
		return false;
	}
	
	// 사원 정보 삭제
	
	public boolean delete(int empno) {
		String sql = "delete from exam_emp where empno=?";
		
		try {
			con = getConnetion();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	// 사원 추가
	public boolean insert(EmpDTORe insertDto) {
		String sql = "insert into exam_emp(empno, ename,job,mgr, hiredate,sal,comm,deptno";
		sql += "values(?,?,?,?,sysdate,?,?,?)";
		
		try {
			con = getConnetion();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, insertDto.getEmpno());
			pstmt.setString(2, insertDto.getEname());
			pstmt.setString(3, insertDto.getJob());
			pstmt.setInt(4, insertDto.getMgr());
			pstmt.setInt(5, insertDto.getSal());
			pstmt.setInt(6, insertDto.getComm());
			pstmt.setInt(7, insertDto.getDeptno());
			
			int result = pstmt.executeUpdate();
					if(result>0) {
						return true;
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
		return false;
	}
	
}
