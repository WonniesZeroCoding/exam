package emp.service;

import java.sql.Connection;
import static emp.dao.JdbcUtil.*;
import emp.dao.EmpDAO;

public class EmpRemoveService {
	public boolean empRemove(int empno) {
		boolean isRemoveSuccess = false;
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean removeResult = dao.delete(empno);
		
		if(removeResult) {
			commit(con);
			isRemoveSuccess = true;
		}else {
			rollback(con);
		
		}
		return isRemoveSuccess;
	}
}
