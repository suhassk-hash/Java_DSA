package SK_DSA.Sort;

import java.util.Arrays;

public class MergeInPlace_Sort {

    public static void main(String[] args) {
        int arr []= {1,2,5,3,4,6};
        mergeinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeinplace(int []arr,int start,int end){
        if((start-end)==0){
            return;
        }
       else{
            int mid = (start+end)/2;
            mergeinplace(arr,start,mid);
            mergeinplace(arr,mid+1,end);
            merger(arr,start,mid,end);
        }
    }

    public static void merger(int [] arr,int start,int mid,int end){
        int x=start;
        int y=mid;
        int z=end;
        while(x<=mid && y<=end){
            if(arr[x]<=arr[y]){
                x++;
            }
            else{
                int temp = arr[y];
                int index = y;
                while(index!=x){
                    arr[index]=arr[index-1];
                    index--;
                }
                arr[x]=temp;
                x++;
                mid++;
                y++;
            }
        }
    }
}
