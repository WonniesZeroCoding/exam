package emp.ui;

import java.util.Scanner;

public class EmpUiRe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag)	{
			System.out.println("======================");
			System.out.println("1. EmpRe 사원 정보 조회");
			System.out.println("2. EmpRe 사원 정보 수정");
			System.out.println("3. EmpRe 사원 탈퇴");
			System.out.println("4. EmpRe 사원 추가");
			System.out.println("5. 종료");
			System.out.println("======================");
			System.out.println();
			
			System.out.print("메뉴 선택 >> ");
			int a = Integer.parseInt(sc.nextLine());
			
			Action action = null;
			
			switch (a) {
			case value:
				
				break;

			default:
				break;
			}
		}
	}

}
