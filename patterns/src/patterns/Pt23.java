package patterns;

public class Pt23 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
//int j = 0; j < i; j++
			for (int j = 5; j >i; j--) {
//(char) (j + 65)
				System.out.print((char) (j+ 64));

			}
			System.out.println();

		}
	}
}
