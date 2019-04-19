package patterns;

public class Pt41 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= k; j++) {
				System.out.print((char) (j + 64));
			}
			k += 2;
			System.out.println();

		}

	}
}
