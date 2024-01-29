package SK_DSA.Search.Linear_Search;

public class Linear_Search {
public static void main(String []args) {
	int[] arr= {1,2,4,1,67,235,487,98,23,7,65};
	System.out.println(LinearSearch(arr,100));
	}
 static int LinearSearch(int [] arr,int n) {
	if(arr.length==0) {
		return Integer.MAX_VALUE;
	}
	else {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
//				return i;
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
}
}
