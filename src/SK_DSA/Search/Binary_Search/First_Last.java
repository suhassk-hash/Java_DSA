package SK_DSA.Search.Binary_Search;

public class First_Last {
	public static int[] main(String[]args) {
		int[] arr = null; int target = 0;
		int []ans= {-1,-1};
		ans[0]=search(arr,target,true);
        if(ans[0]!=-1){
		ans[1]=search(arr,target,false);}
		return ans;
	}
	 static int search(int[]arr,int target,boolean StartIndex) {
		 int ans=-1;
		 int start=0,end=arr.length-1;
		 while(start<=end) {
			 int middle=start+(end-start/2);
		 if(target<arr[middle]) {//in case of descending ordered array
				end=middle-1;		//changes to start=middle+1;
			}
			else if(target>arr[middle]) {
				start=middle+1;		//changes to end=middle-1;
			}
			else if(target==arr[middle]) {
				ans=middle;
				if(StartIndex) {
					end=middle-1;
				}
				else {
					start=middle+1;
				}
			}
		 } 
		 return ans;
	 }
}
