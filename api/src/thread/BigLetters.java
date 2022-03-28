package thread;

/* 멀티스레드
 * 멀티스레드의 작성 이유, 장점
 * 1)cpu 사용률 향상
 * 2)자원 효율적으로 사용
 * 3)작업이 분리되어 코드가 간결
 * 
 * ex) 카카오톡 : 메세지 전송, 파일 주고 받기
 */
public class BigLetters {
	public static void main(String[] args) {
		// 대문자 A~Z 출력 + SmallLetter클래스 수행문 같이 수행 
		SmallLetters t1 = new SmallLetters();
		t1.start(); // smallLetter의 run()을 수행
		
		Runnable r = new NumPrint();
		Thread t2 = new Thread(r);
		t2.start();
		
		// 대문자 A~Z 까지 출력
		for(char ch='A'; ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		
		
	}
}
