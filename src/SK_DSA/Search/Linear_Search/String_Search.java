package SK_DSA.Search.Linear_Search;
import java.util.Scanner;
public class String_Search {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	System.out.println("Enter the target character");
	char target=sc.next().charAt(0);
	boolean output=String_search(s,target);
	System.out.println(output);
	sc.close();
}
static boolean String_search(String str,char target) {
	if(str.length()==0) {
		return false;
	}
	else {
		for(int i=0;i<str.length();i++) {//for(char ch:str.toCharArray() --> Enhanced for loop 
			if(str.charAt(i)==target) {//str.toLowerCase().charAt(i) --> For checking irrespective of cases
				return true;
			}
		}
	}
	return false;
}
}
