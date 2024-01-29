package SK_DSA.Search.Linear_Search;

public class Minimum_number {
public static void main(String [] args) {
	int [] arr= {1,2,3,4,5,1,8,1,-8,2,4,5,643,4,61,4};
	int output=minimum(arr);
	System.out.println(output);
}
static int minimum(int [] arr) {
	int min=arr[0];
	for(int i:arr) {
		if(i<min) {
			min=i;
		}
	}
	return min;
}
}
