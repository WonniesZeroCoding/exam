package member.action;

import java.util.Scanner;

import member.service.MemberModifyService;
import member.utill.ConsoleUtil;

public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 주소, 이메일 수정
		// 어떤 부분을 수정할 것인지 사용자에게 질문하는 화면을 제시
		ConsoleUtil util = new ConsoleUtil();
		int no = util.printModifyMessage(sc); // 1(주소), 2(이메일)
		int id = util.printModifyIdMessage(sc);
		//변경할 값에 대해서 사용자에게 입력 받는 화면 제시
		String input = util.printModifyValueMessage(sc);
		
		//서비스에 작업 요청
		MemberModifyService service = new MemberModifyService();
		boolean result = service.update(no, input, id);
		
		if(result) {
			util.printModifySuccessMessage();
		}else {
			util.printModifyFailMessage();
		}
	}

}
