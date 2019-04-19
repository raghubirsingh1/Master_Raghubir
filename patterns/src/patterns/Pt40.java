package patterns;

public class Pt40 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = k; j >= 1; j--) {
				System.out.print(j);
			}
			k += 2;
			System.out.println();

		}

	}
}
