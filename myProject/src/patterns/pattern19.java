package patterns;

public class pattern19 {

	public static void main(String[] args) {

		int i, j, space =4, star = 1;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if(i<5) {
			space = space - 1;
			star = star + 2;
			
			}
			else {
				space=space+1;
				star=star-2;
			}
			System.out.println();
		}
	}
}
