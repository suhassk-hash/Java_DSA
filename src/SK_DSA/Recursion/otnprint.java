package SK_DSA.Recursion;

public class otnprint {
public static void main(String [] args) {
	printing(10);
}
public static void printingrev(int n) {
	if(n==1) {
		System.out.println(n);
		return;
	}
	System.out.println(n);
	printing(n-1);
}
public static void printing(int n) {
	if(n==1) {
		System.out.println(n);
		return;
	}
	printing(n-1);
	System.out.println(n);
}
}
