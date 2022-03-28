package shop;

public class User {
	private String name; // 고객명
	private PayType payType;   // 결제 방법 ( 현금 또는 카드)
	
	
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}
	
	
	
	public String getName() {
		return name;
	}
	public PayType getPayType() {
		return payType;
	}
	
	
	
}
