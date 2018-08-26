//package myJava.ch03;
import java.lang.*;
import java.util.Scanner;

public class ch3_01
{
	public static void main(String args[])
	{
		Scanner keyboardInput = new Scanner(System.in);
		String str1,str2;
		
		System.out.println("請輸入第一字串");
		str1 = keyboardInput.nextLine();
		System.out.println("請輸入第二字串");
		str2 = keyboardInput.nextLine();
		System.out.println("輸入的字串如下");
		System.out.println(str1);
		System.out.println(str2);
			
	}
}