package dsa;

public class BubbleSort {

	public static void main(String[] args) {
		int[] num = { 1, 40, 30, 15, 20, 5, 2 };
		int temp = 0;

		System.out.println("array before swapped : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		int count=0;
		for (int i = 0; i < num.length - 1; i++) {
			boolean swapped=false;
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					swapped=true;
					count++;
				}
			}
			if(swapped) {
				break;
			}
		}
	
	System.out.println();

	System.out.println("Array after Swap :");for(

	int n:num)
	{
		System.out.print(n + " ");
	}
	System.out.println("number of rotation : "+count);
}

}
