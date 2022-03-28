package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpModifyService;
import emp.util.ConsoleUtil;

public class EmpModifyAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		// 없는 것 입력 받기 - empno, mgr <-------------- console util한테 시킬 거임
		ConsoleUtil util = new ConsoleUtil();
		EmpDTO updateDto = util.getUpdateEmp(sc);
		EmpModifyService service = new EmpModifyService();
		boolean updateResult = service.modifyEmp(updateDto.getEmpno(), updateDto.getMgr());

		if(updateResult) {
			util.printUpdateSuccessMessage(updateDto);
		}else {
			util.printUpdateFailMessage(updateDto);
		}
	}

}
