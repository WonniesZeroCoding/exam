package member.action;

import java.util.Scanner;

import member.dto.MemberDTO;
import member.service.MemberAddService;
import member.utill.ConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception { //Action 인터페이스 구현해놨으므로 execute 무조건 갖고 옴
		// 사용자에게 입력화면 제시
		ConsoleUtil util = new ConsoleUtil();
		MemberDTO insertDto = util.getNewMember(sc);
		// 입력값을 받아서 서비스한테 전송
		MemberAddService service = new MemberAddService();
		boolean result = service.inserMember(insertDto);
		
		
		
		// 서비스의 처리결과를 화면제시
		if(result) {
			util.printAddSuccessMessage();
		}else {
			util.printAddFailMessage();
		}
		
		
	}

}
