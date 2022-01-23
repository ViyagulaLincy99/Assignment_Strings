//write a program to repeat the string
import java.util.Scanner;

public class StringReplication {
	public static String lengthiestString(String s1,int n)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			sb.append(s1);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string to replicate and number of times");
String str=sc.next();
int n=sc.nextInt();
System.out.println(lengthiestString(str,n));}

}
