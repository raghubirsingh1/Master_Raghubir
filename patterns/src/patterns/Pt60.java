package patterns;

public class Pt60{
	public static void main(String[] args) {

		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j >= i; j--) {
				System.out.print(j);
			}

			System.out.println();

		}
		for (int i = 1; i <=3; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 3; j >= i; j--) {
				System.out.print(j);
			}

			System.out.println();

		}
	}
}
