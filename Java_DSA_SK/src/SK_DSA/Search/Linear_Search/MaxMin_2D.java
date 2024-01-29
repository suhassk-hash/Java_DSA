package SK_DSA.Search.Linear_Search;

import SK_DSA.MaxMin_Value;

public class MaxMin_2D {
public static void main(String[] args) {
	int [][] arr= {{1,2,3},{4,5,1,8},{-17165252,10,2},{4,5,643,4},{6111,4}};
	MaxMin_Value mc=new MaxMin_Value();
	System.out.println(mc.Max2D(arr));
	System.out.println(mc.Min2D(arr));
}
}
