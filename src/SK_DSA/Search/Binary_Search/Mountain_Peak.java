package SK_DSA.Search.Binary_Search;

public class Mountain_Peak {
public static void main(String[]args) {
	int [] arr= {2,3,4,5,6,5,3,2,1};
	System.out.println(peakIndexInMountainArray(arr));
}	
public static int peakIndexInMountainArray(int[] arr) {
    int start=0;
    int end=arr.length-1;
    while(start<end) {
    	int middle=start+(end-start)/2;
    	if(arr[middle]>arr[middle+1]) {
    		end=middle;
    	}
    	else {
    		start=middle+1;
    	}
    }
    return start;
}
}
