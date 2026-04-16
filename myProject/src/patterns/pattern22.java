package patterns;

public class pattern22 {

	public static void main(String[] args) {
	int i,j,k,space=3,star=1;
		for( i=1;i<=7;i++) {
			for( j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for( k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<4) {
				space=space-1;
				star=star+1;
			}
			else {
				space=space+1;
				star=star-1;
			}
			System.out.println();
		}

	}

}
