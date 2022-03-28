package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;
//CRUD 담당 객체
public class MemberDAO {
	
	private Connection con;

	public MemberDAO(Connection con) {
		super();
		this.con = con;
	}
    
	//C 담당 메소드
	public boolean insert(MemberDTO insertDto) {
		String sql = "insert into member(id, name, addr, email, age) values(member_seq.nextval,?,?,?,?)";
		PreparedStatement pstmt = null;
		
		
		try {
			pstmt = con.prepareStatement(sql); // sql 전송
			//? 하나씩 처리
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getAddr());
			pstmt.setString(3, insertDto.getEmail());
			pstmt.setInt(4, insertDto.getAge());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return false;
	
	
	}
	// R담당 메소드 (Read) - select
	// select - 행이 나오는경우 -DTO
	// 			행이 여러개 나오는 경우 List<~DTO>
	// 리스트 조회
	public List<MemberDTO> getList() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql = "Select * from member";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				MemberDTO dto = new MemberDTO(id, name, addr, email, age);

//				MemberDTO dto = new MemberDTO();
//				dto.setId(rs.getInt("id"));
//				dto.setName(rs.getString("name"));
//				dto.setAddr(rs.getString("addr"));
//				dto.setEmail(rs.getString("email"));
//				dto.setAge(rs.getInt("age"));
//				
//				list.add(new MemberDTO(id, name, addr, email, age));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	// U(Update)담당 메소드
	public boolean updateMember(int no, String input, int id) {
		PreparedStatement pstmt = null;
		String sql = "";
		try {
			if(no==1) {
			sql="update MEMBER set addr =? where id = ?";
			}else {
				sql = " update MEMBER set email = ? where id = ?";
			}
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, input);
			pstmt.setInt(2, id);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return false;
	}
	
	//D(delete)담당 메소드
	public boolean removeMember(int id) {
		PreparedStatement pstmt = null;
		String sql = "delete from member where id =?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return false;
	}
}
