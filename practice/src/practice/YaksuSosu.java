package practice;

import java.util.Scanner;

public class YaksuSosu {

	public static void main(String[] args) {
		// 약수와 소수 구하기
		// 약수 따로 소수 따로 메소드 만들 것

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		for(int i=0; i<=s; i++) {
			sosu(i);
			}
	}
		public static void yaksu()
	
	
		public static void sosu(int number) {
			if(number<2) {
			System.out.println("0과 1은 소수가 아닙니다");
			return;
			}
			if(number == 2) {
			System.out.println("소수입니다");
			return;	
			}
		
			for(int i =2; i<number; i++) {
			if(number%i==0) {
			System.out.println("소수가 아닙니다");
			return;
			} 
		}
		System.out.print("소수 입니다");
		return;
	}
	
		
}
