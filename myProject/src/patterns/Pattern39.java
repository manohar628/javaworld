package patterns;

public class Pattern39 {

	public static void main(String[] args) {
		char c=65;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+c);
			}
			c++;
			System.out.println();
		}
	}

}
