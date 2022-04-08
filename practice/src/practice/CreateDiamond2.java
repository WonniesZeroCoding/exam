package practice;

public class CreateDiamond2 {

	public static void main(String[] args) {
		for(int i=0; i<14; i++) {
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
		}
		System.out.println();
	}
}
