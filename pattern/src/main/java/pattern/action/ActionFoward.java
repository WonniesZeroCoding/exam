package pattern.action;

public class ActionFoward {
	// path, 이동방식
	private String path;
	private boolean redirect; // true(sendRedirect), false(forward)
	
	public ActionFoward() {
		super();
	}
	public ActionFoward(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
	
	
}
