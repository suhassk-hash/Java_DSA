package SK_DSA.Sort;

import java.util.Arrays;

public class Selection_Sort {
public static void main(String[] args) {
	int arr []= {2,3,1,4,5,62,11,65,7,1,2,3,4,5632};
	selsort(arr);
	System.out.println(Arrays.toString(arr));
}
static void selsort(int [] arr) {
	for(int i=0;i<arr.length;i++) {
	int last=arr.length-i-1;
	int maxIndex=Max(arr,0,last);
	swap(arr,maxIndex,last);
	}	
}
static int Max(int [] arr,int start,int end) {
	int max=start;
	for(int i=start;i<=end;i++) {
	if(arr[max]<arr[i]) {
		max=i;
		}
	}
	return max;
}
static void swap(int []arr,int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
