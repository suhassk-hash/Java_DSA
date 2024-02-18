package SK_DSA.Sort;

import java.util.Arrays;

public class Bubble_Sort {
public static void main(String[] args) {
	int arr []= {2,3,1,4,5,62,11,65,7,1,2,3,4,5632}; 
	Sort(arr);
	
}
public static void Sort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		boolean swapped=false;
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				swapped=true;
			}
		}
		if(!swapped) { //checking for first swap if not swapped the program ends then and there itself
			break;
		}
	}
	System.out.println(Arrays	.toString(arr));
}
}
