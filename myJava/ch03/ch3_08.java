import java.lang.*;
import java.util.Scanner;

public class ch3_08
{
	public static void main(String args[])
	{
		Scanner keyboardInput = new Scanner(System.in);
		String str1;
		double x;
	
		System.out.print("x的3次方");
		str1 = keyboardInput.nextLine();
		x = Double.parseDouble(str1);
		System.out.println("X的3次方=" + (x*x*x));	
	}
}