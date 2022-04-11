package practice;

public class CreateDiamond2 {

	public static void main(String[] args) {
		for(int i=0; i<14; i++) {
			for(int j=7; j>0; j--) {
				if(i>=j) {
					System.out.print(" * ");
				}   else if(i>=j) {
					System.out.print("   ");
				}
			} 
			System.out.println();
		}
		System.out.println();
	}
}

/*
public class Diamond {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int lim;
   boolean flag;
   do {
      System.out.println("홀 수 정 수 : ");
      lim = sc.nextInt();
      if(lim % 2 == 1 && lim > 0) {
         flag = false;
      }else {
         System.out.println("잘못된 수입니다.");
         flag = true;
      }
   }while(flag);
   int center = lim / 2;
   for(int i = 0; i < lim; i++) {
      for(int j = 0; j < lim; j++) {
         if(i <= center) {
            if(j < ( center - i ) || j > ( center + i )) {
               System.out.print("   ");
            }else {
               System.out.print(" ○ ");
            }
         }else {
            if(j < ( i - center ) || j > ( lim - ( i - (( lim / 2 ) - 1 )))) {
               System.out.print("   ");
            }else {
               System.out.print(" ○ ");
            }
         }
      }
      System.out.println();
   }
   System.out.println(center);
   sc.close();
}
}
*/