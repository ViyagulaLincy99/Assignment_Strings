//write a program to print long and short word
public class LongShort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="Welcome";
		System.out.println(capsStart(s1,s2));
	}
	
	public static String capsStart(String s1,String s2)
	{
		StringBuffer s3=new StringBuffer();
		int q=s1.length();
		int w=s2.length();
		if(q>w)
		{
			s3.append(s1).append(s2).append(s1);
		}
		else
		{
			s3.append(s2).append(s1).append(s2);
		}
		return s3.toString();
	}
}

