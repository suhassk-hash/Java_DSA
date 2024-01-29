package SK_DSA;

public class MaxMin_Value {
public static void main(String[] args) {
	System.out.println("Hi hello");
}
public int Max2D(int arr[][]) {
	int max=arr[0][0];
	if(arr.length==0) {
		return -1;
	}
	else {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
	}
	return max;
}
public int Max(int arr[]) {
	int max=arr[0];
	if(arr.length==0) {
		return -1;
	}
	else {
		for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				
			}
		}
	}
	return max;
}
public int Min2D(int arr[][]) {
	int min=arr[0][0];
	if(arr.length==0) {
		return -1;
	}
	else {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
		}
	}
	return min;
}
public int Min(int arr[]) {
	int min=arr[0];
	if(arr.length==0) {
		return -1;
	}
	else {
		for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
			}
		}
	}
	return min;
}
}
