package Day1;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "Nitesh";
//String rev="";
/*int length = str.length();
for(int i=length-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}*/


StringBuilder sb =new StringBuilder(str);
StringBuilder rev =sb.reverse();

System.out.println("reverse of string is" +rev);
	}
}
