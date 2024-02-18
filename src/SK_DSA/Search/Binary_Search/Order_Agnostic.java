package SK_DSA.Search.Binary_Search;

import java.util.Arrays;

import SK_DSA.Frequency;

public class Order_Agnostic {
public static void main(String[] args) {
	int [] arr= {11,1,1,1,1,1,1,1,431,1,1,1,2,3,4,5,1,8,1,0,2,4,5,643,4,61,4};
	Binary_Search.Asort(arr);//Sorting array for binary search
	Binary_Search.Dsort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(Binary_Search.Binary__Search(arr, 431));
	Frequency fc=new Frequency();
	fc.Frequency_arr(arr, 1);
}
}
