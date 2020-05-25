package Day1;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		int a=10; 
		int b=20;
		System.out.println("Before Swapping values are" +a+"  "+b);
		/*int t=a;
		a=b;
		b=t;*/
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		b=a+b-(a=b);
	 
		
		System.out.println("After Swapping values are"+a+" "+b);

	}

}
