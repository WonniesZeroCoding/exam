package pattern.action;

public class ActionFactory {
	//SingleTon 객체 생성 : 객체를 여러개를 생성하지 말고 하나만 생성하겠다
	//default 생성자 = private && 다른 생성자는 제공 안함
	//getInstance() 메소드 생성
	private static ActionFactory af;
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		if(af == null) {
			af = new ActionFactory();		
		}
	return af;
	}
	
	Action action = null;
	public Action action(String cmd) {
		if(cmd.equals("/select.do")) {
			action = new SelectAction();
		} else if(cmd.equals("/insert.do")) {
			action = new insertAction();
		} else if(cmd.equals("/login.do")) {
			action = new LoginAction();
		}
		// 생성한 action 리턴
		return action;
	}	
	
}
