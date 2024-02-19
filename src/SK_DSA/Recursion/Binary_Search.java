package SK_DSA.Recursion;

import SK_DSA.Sort.Bubble_Sort;

public class Binary_Search {
@SuppressWarnings("static-access")
public static void main(String [] args) {
	int []arr= {1,2,3,1,2,4,5,6,7,8,15,97,4,10};
	Bubble_Sort bs=new Bubble_Sort();
	bs.Sort(arr); // also prints the sorted array! function was defined in such a way! 
	System.out.println(search (arr,15,0,arr.length));
}
static int search(int [] arr,int target,int start,int end){
	if(start>end) {
		return -1;
	}
	int m= start+(end-start)/2;
	if(arr[m]==target) {
		return m;
	}
	if(arr[m]>target) {
		return search(arr,target,start,m-1);
	}
		return search(arr,target,m+1,end);
}
}
