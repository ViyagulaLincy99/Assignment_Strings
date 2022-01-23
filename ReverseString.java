/*write a program to get the index position from the user and display the
 word*/ 
import java.util.Scanner;

public class ReverseString {
	public static String reverseSubstring(String str,int index1,int length)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();//reverse the string
		str=sb.toString();
		return str.substring(index1,(index1+length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sd=new Scanner(System.in);
System.out.println("Enter the String");
String msg=sd.next();//getting the input from the user
System.out.println("Enter the starting  index");
int index=sd.nextInt();//getting the index value from the user
System.out.println("Enter the length of the selected string");
int len=sd.nextInt();//getting the length from the user
msg.length();
ReverseString a=new ReverseString();
System.out.println(a.reverseSubstring(msg, index, len));

	}

}
