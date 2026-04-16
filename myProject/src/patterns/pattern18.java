package patterns;

public class pattern18 {

	public static void main(String[] args) {
//	for(int i=6;i>=1;i--) {
//		for(int j=1;j<=6-i;j++) {
//			System.out.print(" ");
//		}
//		for(int k=1;k<=(2*i-1);k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//
//	}
		int i, j, space = 0, star = 9;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			space = space + 1;
			star = star - 2;
			System.out.println();
		}
	}
}
