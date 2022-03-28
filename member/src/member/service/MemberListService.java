package member.service;
import java.sql.Connection;
import java.util.List;
import static member.dao.JdbcUtil.*;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberListService {
	// 비즈니스 로직 호출

	public List<MemberDTO> list() {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		List<MemberDTO> memberlist = dao.getList();
		//비즈니스 로직이 select 라면 commit(), rollback() 등 안함
		close(con);
		
		return memberlist;
	}
}
