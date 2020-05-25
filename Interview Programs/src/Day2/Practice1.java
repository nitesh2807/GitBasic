package Day2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int org_num =num;
		int rev=0;
		while(num!=0) {
			rev= rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(" Num is Palindrome :" +org_num);
		}else {
			System.out.println(" Num is not Palindrome : "+org_num);
		}
	}

}
