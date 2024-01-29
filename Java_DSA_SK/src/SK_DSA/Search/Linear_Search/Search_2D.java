package SK_DSA.Search.Linear_Search;

import java.util.Arrays;

public class Search_2D {
public static void main(String[] args) {
	int [][] arr= {{1,2,3},{4,5,1,8},{1,0,2},{4,5,643,4},{61,4}};
	int[] output = search(arr,8);
	System.out.println(Arrays.toString(output));
}
static int[] search(int arr[][],int target) {
	if(arr.length==0) {
		return new int[] {-1,-1};
	}
	else {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int[]{i,j};
				}
			}
		}
	}
	return new int[] {-1,-1};
}
}
