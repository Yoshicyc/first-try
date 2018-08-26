import java.lang.*;

public class ch3_09
{
	public static void main(String args[])
	{
		short a=100;
		int b=200;
		float d=3.5f;
		double e=4.8d;
		String s1,s2,s3,s4;
		
		s1=String.valueOf(a+b)+String.valueOf(a)+String.valueOf(b);
		s2=Float.toString(d)+Double.toString(e);
		s3=String.valueOf(d)+String.valueOf(e);
		s4=Integer.toString(a+b)+Short.toString(a)+Integer.toString(b);
		System.out.println("s1 =" +s1);
		System.out.println("s2 =" +s2);
		System.out.println("s3 =" +s3);
		System.out.println("s4 =" +s4);
	}
}