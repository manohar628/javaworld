package dsa;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {18,14,5,13,90,9};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
