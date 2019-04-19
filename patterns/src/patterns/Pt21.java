package patterns;

public class Pt21 {
	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
//int j = 0; j < i; j++
			for (int i = 5; i > j; i--) {
//(char) (j + 65)
				System.out.print(i);

			}
			System.out.println();

		}
	}
}
