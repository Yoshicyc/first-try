//package myJava.ch03;
import java.lang.*;
import java.io.Console;

public class ch3_02
{
	public static void main(String args[])
	{
		Console consoleTest = System.console();
		String str1;
		char[] PW;

		System.out.println("請輸入字串");
		str1 = consoleTest.readLine();
		PW = consoleTest.readPassword("請輸入密碼：");
		System.out.println("你輸入的字串＆密碼如下");
		System.out.println(str1);
		System.out.println(PW);
	}
}