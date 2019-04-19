package patterns;

public class Pt44 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print((char)(j+65));
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+65));
			}

			System.out.println();

		}

	}
}
