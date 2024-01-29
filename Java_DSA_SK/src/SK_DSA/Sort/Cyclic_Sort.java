package SK_DSA.Sort;

import java.util.Arrays;

public class Cyclic_Sort {
	public static void main(String[] args) {
		int arr []= {1,2,5,3,4,6};
		cyc(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void cyc(int[]arr) {
		int i=0;
		while(i<arr.length){
			int crctin=arr[i]-1;
			if(arr[i]!=arr[crctin]) {
				swap(arr,i,crctin);
			}
			else {
				i++;
			}
		}
	}
public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
