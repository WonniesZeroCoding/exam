package practice;

public class CreateDiamond {
	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
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
				for(int k=0; k<7; k++) {
					if(k<=i) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				} for(int l=7; l>0; l--) {
					if(l<=i) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				}
	System.out.println();
			}
		System.out.println();
		}
}
/*
 * for(int i = 0; i < x ; i++){}
 * for(int i = x; i >=0; i--){}
 */
