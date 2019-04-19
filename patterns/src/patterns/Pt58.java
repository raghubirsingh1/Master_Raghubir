package patterns;

public class Pt58{
	public static void main(String[] args) {

		for (int i = 3; i >= 0; i--) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 3; j++) {
				System.out.print((char)(j+65));
			}

			System.out.println();

		}
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 3; j++) {
				System.out.print((char)(j+65));
			}

			System.out.println();

		}
	}
}
