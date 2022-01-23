//write a program to find the middle character in the word
import java.util.Scanner;

public class SearchingMiddleChar {
	public static String getMiddleChar(String str)
	{
		StringBuffer sb=new StringBuffer();
		if(str.length()%2==0)
		{
			sb.append(str.substring((str.length()/2)-1,(str.length()/2+1)));
		}
	return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();//getting the input from the user
str=getMiddleChar(str);//passing the string to function
System.out.println(str);
	}

}
