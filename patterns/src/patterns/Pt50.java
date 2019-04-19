package patterns;

public class Pt50 {
	public static void main(String[] args) {

		int k = 7;
		for (int i = 4; i >= 1; i--) { 
			for (int j = 4; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= k; j++) {
				System.out.print(j);
			}
//			for (int j = i - 1; j >= 1; j--) {
//				System.out.print(k);
//			}
			k -= 2;
			System.out.println();

		}

	}
}
