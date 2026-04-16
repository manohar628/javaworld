package patterns;

public class Pattern41 {

	public static void main(String[] args) {
		char c=65;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(c);
				c++;
			}
			for(int k=i;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
