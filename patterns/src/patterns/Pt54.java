package patterns;

public class Pt54 {
	public static void main(String[] args) {

		int k = 7;
		for (int i = 1 ; i <= 4; i++) { 
			for (int j = 1; j <= 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			
			
			System.out.println();

		}
		for (int i = 1 ; i <= 4; i++) { 
			for (int j = 1; j <= 2; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
