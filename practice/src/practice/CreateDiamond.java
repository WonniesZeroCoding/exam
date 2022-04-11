package practice;

public class CreateDiamond {
	public static void main(String[] args) {
		boolean flag = true;
		
			
		
		for(int i=0; i<14; i++) {
			if(i == 7) {
				flag = !flag;
				continue;
			}
			if(flag) { 
				for(int j=7; j>0; j--) {
					if(i>=j) {
						System.out.print(" * ");
					}   else  {
						System.out.print("   ");
					}
				} for(int j=0; j<7; j++ ) {
					if(i<j) {
						System.out.print("   ");
					}else {
						System.out.print(" * ");
					}
				} 
				System.out.println();
			}else {
					
				for(int k=7; k<14; k++) {
					if(k<=i) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				} for(int l=14; l>7; l--) {
					if(l<=i) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				}
				System.out.println();
			}
		}
	}
}
/*
 * for(int i = 0; i < x ; i++){}
 * for(int i = x; i >=0; i--){}
 */


/*
public class Diamond {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("3이상의 홀수값을 입력해주세요.");
      int limit = sc.nextInt();
      if((limit % 2) == 1 && limit >= 3) {
             int c = (limit / 2) + 2;
             for(int i = 1; i <= limit; i++) {
                    for(int j = 1; j <= limit; j++) {
                          if(j <= (limit + 1) - c || j >= c) {
                                 System.out.print("   ");
                          }else {
                                 System.out.print(" ■ ");
                          }
                    }
                    System.out.println();
                    if(i <= (limit / 2)) {
                          c = c + 1;
                    }else {
                          c = c - 1;
                    }
             }
             sc.close();
      }else {
             System.out.println("Wrong");
             sc.close();
      }
}
}
*/