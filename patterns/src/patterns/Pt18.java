package patterns;

public class Pt18 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = 5; j > i; j--) {

				System.out.print((char) (i + 65));

			}
			System.out.println();

		}
	}
}
