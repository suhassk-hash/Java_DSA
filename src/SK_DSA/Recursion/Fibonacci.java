package SK_DSA.Recursion;

public class Fibonacci {
public static void main(String [] args) {
	System.out.println(fiboc(7)); 
}
public static int fiboc(int n) {
	if(n<2) {
		return n;
	}
	return fiboc(n-1)+fiboc(n-2);
}







public static void fibonac(int n,int i ,int j,int k) {
	if(k<n) {
		System.out.println(i);
		int temp=j;
		j=i;
		i=temp+j;k++;
		fibonac(n,i,j,k);
	}
}
}
