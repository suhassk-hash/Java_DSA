package SK_DSA.Sort;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        int x=low;
        int y=high;
        if(x >=y){return;}
            int pi =arr[x+(y-x)/2]; // pivot element
            while(arr[x]<pi){
                x++;
            }
            while(arr[y]>pi){
                y--;
            }
            if(x<=y){
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
            quickSort(arr, low,y);
            quickSort(arr, high, x);
    }
}
