package patterns;

public class Pt22 {
	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {
//int j = 0; j < i; j++
			for (int j = 0; j < i; j++) {
//(char) (j + 65)
				System.out.print((char) (i + 64));

			}
			System.out.println();

		}
	}
}
