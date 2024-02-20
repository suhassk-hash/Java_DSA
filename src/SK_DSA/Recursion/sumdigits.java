package SK_DSA.Recursion;

public class sumdigits {
public static void main(String [] args) {
	System.out.println(sd(132));
}
public static int sd(int n) {
	if(n<=0) {
		return 0;
	}
	return (n%10)+sd(n/10);
	}
}
