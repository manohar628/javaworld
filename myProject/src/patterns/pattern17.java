package patterns;

public class pattern17 {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=(2*i-1);k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int i, j, space = 4, star = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			space = space - 1;
			star = star + 2;
			System.out.println();
		}
	}

}
