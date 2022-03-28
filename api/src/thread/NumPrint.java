package thread;

public class NumPrint implements Runnable {
// 동일한 기능을 하는 것을 하나는 클래스로 , 하나는 인터페이스로 만들어 놓은 경우가 있음
	@Override
	public void run() {
		for(int i=1; i<=15;i++) {
			System.out.print(i+" ");
		}

	}

}
