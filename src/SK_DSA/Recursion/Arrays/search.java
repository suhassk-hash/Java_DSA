package SK_DSA.Recursion.Arrays;

import java.util.ArrayList;

public class search {
public static void main(String [] args) {
	int arr[]= {1, 1, 2, 2, 3, 4, 4, 5, 7, 11, 62, 65, 5632};
	findindexmultiple(arr,0,4);
	System.out.println(list);
}
static ArrayList<Integer> list = new ArrayList<>();
public static boolean find(int[] arr,int i,int target) {
	if(i==arr.length) {
		return false;
	}
	return (target==arr[i]) || (find(arr,i+1,target));
}
public static int findindex(int[] arr,int i,int target) {
	if(i==arr.length) {
		return -1;
	}
	if(target==arr[i]) {
		return i;
	}
	else {
		return findindex(arr,i+1,target);
	}
}
public static void findindexmultiple(int[] arr,int i,int target) {
	if(i==arr.length) {
		return;
	}
	if(target==arr[i]) {
		list.add(i);
	}
		findindexmultiple(arr,i+1,target);
}
}
