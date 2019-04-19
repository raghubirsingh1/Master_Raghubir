package patterns;

public class Pt35 {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= k; j++) {
				System.out.print(i);
			}
			k += 2;
			System.out.println();

		}

	}
}
