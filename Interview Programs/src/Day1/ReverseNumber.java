package Day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num =sc.nextInt();
		
	/*	int rev=0;
		/*while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();*/
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
System.out.println("Reverse a Number:" +rev);
	}

}
