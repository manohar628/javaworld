package patterns;

public class Pattern40 {

	public static void main(String[] args) {
		char c = 65;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 4; k >= i; k--) {
				System.out.print(c);

			}
			c++;
			System.out.println();
		}

	}

}
