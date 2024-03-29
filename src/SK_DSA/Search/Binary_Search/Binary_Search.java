package SK_DSA.Search.Binary_Search;

public class Binary_Search {
public static void main(String [] args) {
	int [] arr= {11,1,1,1,1,1,1,1,1,1,1,1,2,3,4,5,1,8,1,0,2,4,5,643,4,61,4};
	Asort(arr);//Sorting array for binary search
	System.out.println(Binary__Search(arr,643));
}
public static int Binary__Search(int []arr,int target) {
	int start=0,end=arr.length-1;
	while(start<=end) {
		int middle=start+(end-start)/2;

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
	return-1;
//			if(target<arr[middle]) {//in case of descending ordered array
//				start=middle+1;		//changes to start=middle+1;
//			}
//			else if(target>arr[middle]) {
//				end=middle-1;		//changes to end=middle-1;
//			}
//			else if(target==arr[middle]) {
//				return middle;
//			}
//
}
static void Asort(int[]arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
//	System.out.println(Arrays.toString(arr));Printing the sorted array
}
static void Dsort(int[]arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
//	System.out.println(Arrays.toString(arr));Printing the sorted array
}
}
