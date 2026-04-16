package patterns;

public class pattern23 {

	public static void main(String[] args) {
		int i, j, space = 4, star = 1, ash = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= ash; l++) {
				System.out.print("#");
			}
			space = space - 1;
			star = star + 1;
			ash = ash + 1;
			System.out.println();
		}

	}

}
