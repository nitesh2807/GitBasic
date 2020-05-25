package Day1;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before Swapping" +a+" "+b);
		
		/*int t=a;
		 a=b;
		b=t;*/
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
	/*	a=a*b;
		b=a/b;
		a=a/b;*/
		
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		b=a+b-(a=b);
		System.out.println("After Swapping"+a+" "+b);

	}

}
