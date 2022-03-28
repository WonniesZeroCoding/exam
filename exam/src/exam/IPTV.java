package exam;

public class IPTV extends ColorTV {
	
	String IP;
	
	public IPTV(int size, int color, String IP) {
		super(size, color);
		this.IP = IP;
	}

	public void printProperty() {
		System.out.println("나의 IPTV는 "+IP+"주소의");
		super.printProperty();
	}
}
