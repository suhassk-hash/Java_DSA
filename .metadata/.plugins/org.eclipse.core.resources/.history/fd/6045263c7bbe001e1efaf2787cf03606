package SK_DSA.BInary_Search;

public class CeilofNum {
public static void main(String[] args) {
	int []arr= {1,2,4,876,325436,67,11,232,333331};
	Binary_Search.Asort(arr);
	System.out.println(Binary__Search(arr,5));
}
public static int Binary__Search(int []arr,int target) {
	boolean isAO=arr[0]<arr[arr.length-1];
	int start=0,end=arr.length-1;
	while(start<=end) {
		int middle=start+(end-start/2);
		if(isAO==true) {

			if(target<arr[middle]) {//in case of descending ordered array
				end=middle-1;		//changes to start=middle+1;
			}
			else if(target>arr[middle]) {
				start=middle+1;		//changes to end=middle-1;
			}
			else if(target==arr[middle]) {
				return middle;
			}

		}
		else {

			if(target<arr[middle]) {//in case of descending ordered array
				start=middle+1;		//changes to start=middle+1;
			}
			else if(target>arr[middle]) {
				end=middle-1;		//changes to end=middle-1;
			}
			else if(target==arr[middle]) {
				return middle;
			}

		}
			}
	return arr[ start];
}
}
