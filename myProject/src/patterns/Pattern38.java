package patterns;

public class Pattern38 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			char c=65;
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

}
