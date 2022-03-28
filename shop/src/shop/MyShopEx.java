package shop;

public class MyShopEx {

	public static void main(String[] args) {
		
		//IShop shop = new MyShop(); 다형성 개념 적용
		MyShop shop = new MyShop();
		//상호 지정
		shop.setTitle("MyShop");
		//고객(User) 생성
		shop.genUser();
		//제품(product) 생성
		shop.genProduct();
		// shop 시작
		shop.start();
	}

}
