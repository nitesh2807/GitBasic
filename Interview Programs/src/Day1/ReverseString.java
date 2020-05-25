package Day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABCD";
		String rev="";
	/*	int len=str.length();
		for (int i=len-1;i>=0;i--) {
			rev=rev + str.charAt(i);
		}*/
		StringBuffer sb = new StringBuffer(str);
//System.out.println("Reverse String is "+rev);
		System.out.println(sb.reverse());
	}

}
