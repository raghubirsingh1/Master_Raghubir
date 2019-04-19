package patterns;

public class Pt24 {
	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {

			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

//int j = 0; j < i; j++
			for (int j = 6; j > i; j--) {
//(char) (j + 65)
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
