package patterns;

public class Pt27 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print((char)(i+64));
			}
			System.out.println();

		}

	}
}
