package patterns;

public class Pt48 {
	public static void main(String[] args) {

		for (int i = 4; i >=1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			for (int j = i-1; j >=1; j--) {
				System.out.print(i);
			}

			System.out.println();

		}

	}
}
