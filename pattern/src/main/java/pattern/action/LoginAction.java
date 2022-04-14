package pattern.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.service.LoginService;

public class LoginAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("LoginAction");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");

		//db작업 -> service
		LoginService service = new LoginService();
		if(service.login(userid, password)) {
			// 페이지 이동
			//path = "index.jsp";
		} else {
			//path = "loginForm.jsp";
		}
		// 각 액션에서 일이 끝난 후 path, 어떤 방식(forward, sendRedirect)으로 움직일 것인지 리턴
		return new ActionFoward("path", false);
		
	}

}






