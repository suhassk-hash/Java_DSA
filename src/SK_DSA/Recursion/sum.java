package SK_DSA.Recursion;

public class sum {
public static void main(String [] args) {
	System.out.println(s(10));
}
public static int s(int n) {
	if(n<=1) {
		return 1;
	}
	return n+s(n-1);
	}
}
