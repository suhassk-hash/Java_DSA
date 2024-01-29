package SK_DSA;

public class Frequency {
public static void main(String[] args) {
	System.out.println("Hi hello");
	
}
public void Frequency_arr(int [] arr,int target){
	int max=0,freq=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=Integer.MAX_VALUE) {
		int count=0;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				arr[j]=Integer.MAX_VALUE;
			}
			if(count>freq) {
				freq=count;
				max=arr[i];
			}
		}
		}
	}
	System.out.println("Maximum value is "+max);
	System.out.println("Its frequency is "+freq+1);
}
}
