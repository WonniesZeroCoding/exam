package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private User users[] = new User[2];
	private Product products[] = new Product[5];
	private Product[] carts = new Product[10]; // 카트(장바꾸니) 배열 선언
	
	private Scanner sc = new Scanner(System.in);
	
	// selUser 변수 선언 - 계정 선택에서 선택한 사용자 정보를 담기 위한 변수
	private int selUser;
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// User 객체를 이용해서 2명 생성
		// User 생성 후 배열에 담기
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// 핸드폰 --> 3개 생성, 스마트 TV --> 2개 생성
		// 5개 배열로 처리
		products[0] = new CellPhone("갤럭시 S20", 100000, "SKT");
		products[1] = new CellPhone("아이폰", 200000, "LGU+");
		products[2] = new CellPhone("갤럭시 S21", 300000, "KT");
		products[3] = new SmartTV("삼성 QLED", 500000, "4K");
		products[4] = new SmartTV("LG OLED", 1000000, "2048p");
		
	}

	@Override
	public void start() {
		System.out.println(title +" : 메인 화면 - 계정선택");
		System.out.println("==========================");
		
		int i=0;
		for(User user:users ) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}		
		
		System.out.println("[X] 종료 ");
		System.out.println("선택 : ");
		String input = sc.nextLine();
		

		// input : 0, 1, x
		// switch 구문
		switch (input) {
		case "0":case "1" :
			// System.out.println("### "+input+" 선택 ###");
			// 0, 1=> product list 메소드 호출
			System.out.println("### "+input+" 선택 ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "x":case "X":
			// x(X) => 프로그램 종료
			// 이외에 다른 것이 입력되면 => 입력 값을 확인해주세요 메세지 띄우고
			System.out.println("프로그램을 종료합니다");
			break;
		default:
			// 계정선택 화면
			System.out.println("입력값을 확인해주세요");
			start();
			break;
		}
//		for(int i=0;i<users.length;i++) {
//			System.out.printf("[%d %s(%s)\n",i,users[i].getName(),users[i].getPayType());
//		}
//	
	}
	
	public void productList() {
		System.out.println(title +" : 상품 목록 - 상품선택");
		System.out.println("==========================");
	
	int i=0;
	for(Product p:products) {
		System.out.printf("[%d]",i++);
		p.printDetail();
	}
	System.out.println("[h] 메인화면");
	System.out.println("[c] 체크아웃");
	System.out.print("선택 : ");
	String input = sc.nextLine();	
	
	// input : 0~4 상품, h : 계정선택, c: 체크아웃(checkOut호출)
	// 0~4 상품(장바구니에 담고 다시 한번 상품 목록 보여주기
	
	switch (input) {
	case "0": case"1": case "2" : case "3" : case "4":
		
		for(int j=0;j<carts.length;j++) {
			if(carts[j] == null) {
				carts[j] = products[Integer.parseInt(input)];
				break;
			}
		}
		productList();
		break;
	case "h": //start()호출
		start();
		break;
	case "c": // checkOut()호출
		checkOut();
		break;
	default: // productList()호출
		System.out.println("메뉴를 확인해주세요");
		productList();
		break;
	}
	}
	
	public void checkOut() {
		System.out.println(title +" : 체크 아웃");
		System.out.println("=============================");
	
	
	int i=0;
	int sum=0;
	for(Product p:carts) {
		if(p!=null) {
			System.out.printf("[%d] %s(%d)\n",i++,p.getName(),p.getPrice());
			sum+=p.getPrice();
		}
	}
	System.out.println("결제 방법 : "+users[selUser].getPayType());
	System.out.println("합계 : "+sum+"원 입니다");
	System.out.println("[p] 이전,[q] 결제 완료");
	System.out.print("선택 : ");
	String input = sc.nextLine();	
	
	// input : p, q
	// p : 이전화면 productList()
	// q : 결제가 완료되었습니다. 감사합니다 [출력]
	switch (input) {
	case "p":
		productList();
		break;
	case "q" :
		System.out.println("결제가 완료되었습니다 감사합니다");
	default:
		checkOut();
		break;
	}
	
	}
	
}
