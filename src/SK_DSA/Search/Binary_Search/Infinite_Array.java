package SK_DSA.Search.Binary_Search;

public class Infinite_Array {
	public static void main(String [] args) {
		int [] arr= {2,3,4,5,6,7,8,10,11,13,14,1,5,16,17,19,20,21,23,24,26,27,28,29,30};
		search(arr,9);
	}
	public static void search(int []arr,int target) {
		int start=0,end=1;
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;	
			start=temp;
		}
		System.out.println(Binary__Search(arr,target,start,end));
	}
	public static int Binary__Search(int []arr,int target,int start,int end) {
		 while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                // ans found
	                return mid;
	            }
	        }
	        return -1;
	}
}
