package Day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Palindrome Number :");
		int num =sc.nextInt();
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num+ " Palindrome");
		}else {
			System.out.println(org_num+ " NotPalindrome");
			
		}
	}

}
