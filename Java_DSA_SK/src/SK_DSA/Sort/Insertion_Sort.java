package SK_DSA.Sort;

import java.util.Arrays;

public class Insertion_Sort {
public static void main(String[]args) {
	int arr []= {2,3,1,4,5,62,11,65,7,1,2,3,4,5632};
	sort(arr);
	System.out.println(Arrays.toString(arr));
}
static void sort(int [] arr) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j>0;j--) {
			if(arr[j]<arr[j-1]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
			else {
				break;
			}
		}
	}
}
}
