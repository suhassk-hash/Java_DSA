package SK_DSA.Recursion;

public class countzeroes {
public static void main(String [] args) {
	System.out.println(countzero(10000100,0));
}
public static int countzero(int n,int count) {
	if(n==0) {
		return count;
	}
	if(n%10==0) {
		return countzero(n/10,count+1);
	}
	return countzero(n/10,count);
}
}
