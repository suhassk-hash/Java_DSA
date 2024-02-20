package SK_DSA.Recursion;

public class proddigits {
public static void main(String [] args) {
	System.out.println(pd(1234));
}
public static int pd(int n) {
	if(n<=1) {
		return 1;
	}
	return (n%10)*pd(n/10);
	}
}
