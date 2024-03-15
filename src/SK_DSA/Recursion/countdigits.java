package SK_DSA.Recursion;
public class countdigits {
public static void main(String[] args) {
	int c=0;
	System.out.println(returnd(100,c));
	
}
public static int returnd(int n,int count) {
	int c=count;
	if(n==0) {
		return c;
	}
	if(n%10==n) {
		return returnd(n/10,c+1);
	}
	else {
		return returnd(n/10,c);
	}
}
}
