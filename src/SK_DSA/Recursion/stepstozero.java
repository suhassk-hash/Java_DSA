package SK_DSA.Recursion;

public class stepstozero {
	public static void main(String[] args) {
	System.out.println(check(14,0));
	}
public static int check(int n,int count) {
	if(n==0) {
		return count;
	}
	if(n%2==0) {
		return check(n/2,count+1);
	}
	return check((n-1),count+1);
}
}
