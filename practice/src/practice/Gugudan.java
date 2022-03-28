package practice;

/*
	1 x 1 = 1		4 x 1 = 4		7 x 1 = 7
	1 x 2 = 2		4 x 2 = 8		7 x 2 = 14

*/

public class Gugudan {
	public static void main(String[] args) {
		for(int i=1;i<10;i += 2) {
			for(int j=1;j<10;j++) {
				System.out.print(i + " * " + j + " = " + i * j);
				System.out.print("\t");
				System.out.print(i + 1 + " * " + j + " = " + (i + 1) * j);
				System.out.println();
			}
			System.out.println();
		}
			
	}
}
