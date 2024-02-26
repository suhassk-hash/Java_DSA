package SK_DSA.Recursion;

public class reverse{
static int sum=0;
public static void main(String [] args) {
	System.out.println(sd(1000987545));
	System.out.println(check_palin(12321));
}
public static String sd(int n) {
	if(n<=0) {
		return "";
	}
	return (n%10)+sd(n/10);
	//return sd(n/10)+(n%10);  gives the same number so the order of placement of function call matters!!! 
	}
public static void rev(int n) {
	if(n==0) {
		return ;
	}
	int rem=n%10;
	sum=sum*10+rem;
	rev(n/10);
	
}
public static boolean check_palin(int n){
	rev(n);
	return n==sum;
}
}
