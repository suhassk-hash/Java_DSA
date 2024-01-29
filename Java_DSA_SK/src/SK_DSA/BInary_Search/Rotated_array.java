package SK_DSA.BInary_Search;

public class Rotated_array {
public static void main(String[]args) {
	
}
public static int check(int [] arr,int target) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(mid==end&&arr[mid]>arr[mid+1]) {
			return mid;
		}
		else if(arr[mid]<arr[mid-1]) {
			return mid-1;
		}
		else if(arr[mid]<=arr[start]) {
			end=mid-1;
		}
		else {
			start=mid+1;
		}
	}
	return -1;
}
}
