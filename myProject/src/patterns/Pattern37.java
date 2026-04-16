package patterns;

public class Pattern37 {

	public static void main(String[] args) {
		char c=65;
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			
			System.out.println();
		}

	}

}
