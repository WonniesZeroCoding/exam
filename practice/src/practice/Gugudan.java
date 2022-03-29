package practice;

/*
	1 x 1 = 1		4 x 1 = 4		7 x 1 = 7
	1 x 2 = 2		4 x 2 = 8		7 x 2 = 14

*/

public class Gugudan {
	public static void main(String[] args) {
		for(int i=1;i<4;i ++) {
			for(int j=1;j<10;j++) {
				System.out.print(i + " * " + j + " = " + i * j);
				System.out.print("\t");
				System.out.print(i + 3 + " * " + j + " = " + (i + 3) * j);
				System.out.print("\t");
				System.out.print(i + 6 + " * " + j + " = " + (i + 6) * j);
				System.out.println();
			} 
			System.out.println();
		}
		
//		public class MultiplicationTable {
//		       public static void main(String[] args) {
//		             for(int i = 1; i <= 3; i++) {
//		                    for (int j = 1; j <= 9; j++) {
//		                           for(int q = i;q <= i + 6 ; q = q + 3) {
//		                                 System.out.printf("     %d * %d = %d     ", q,j,q*j);
//		                           }
//		                           System.out.println();
//		                    }
//		                    System.out.println();
//		             }
//		       }
//		}
	}
}
