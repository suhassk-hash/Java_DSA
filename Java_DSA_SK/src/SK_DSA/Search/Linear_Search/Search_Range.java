package SK_DSA.Search.Linear_Search;
import java.util.Scanner;
public class Search_Range {
public static void main(String []args ) {
	Scanner sc=new Scanner(System.in);
	int [] arr= {1,2,3,4,5,1,8,1,0,2,4,5,643,4,61,4};
	System.out.println("Enter the target value");
	int target=sc.nextInt();
	System.out.println("Enter the starting index");
	int start=sc.nextInt();
	System.out.println("Enter the ending index");
	int end=sc.nextInt();
	sc.close();
	boolean output=range_search(arr,target,start,end);
	System.out.println(output);
}
static boolean range_search(int []arr,int target,int start,int end) {
	if(arr.length==0) {
		return false;
	}
	else {
		if(end>arr.length) {
			System.out.println("Enter proper ending value");
			return false;
		}
		else {
		for(int i=start;i<=end;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		}
	}
	return false;
}
}
