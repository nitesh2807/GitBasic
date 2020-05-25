package Day2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String str =sc.next();
String org_str=str;
String rev="";

int len=str.length();
for(int i=len-1;i>=0;i-- ) {
	rev=rev+str.charAt(i);
}
if(org_str.equals(rev)) {
	System.out.println("String is Palindrome : "+org_str);
}else {
	System.out.println("String is not Palindrome : "+org_str);
}

	}

}
