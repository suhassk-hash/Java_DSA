package SK_DSA.Recursion.Arrays;

public class Cheksort {
public static void main(String [] args) {
int arr[]= {1, 1, 2, 2, 3, 4, 4, 5, 7, 11, 62, 65, 5632};
System.out.println(check(0,arr));
}
public static boolean check(int i,int [] arr) {
	if(i<arr.length-1) {
		if(arr[i]<=arr[i+1]) {
			return check(i+1,arr);
		}
		else {
		return false;
		}
	}
	return true;
}
}
