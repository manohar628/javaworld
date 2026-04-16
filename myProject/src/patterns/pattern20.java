package patterns;

public class pattern20 {

	public static void main(String[] args) {
		int i, j, space =0, star = 9;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if(i<5) {
			space = space + 1;
			star = star - 2;
			
			}
			else {
				space=space-1;
				star=star+2;
			}
			System.out.println();
		}
	}

}
