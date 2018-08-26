import java.util.Scanner;
import java.lang.*;
public class ch4_21
{
	public static void main(String args[])
	{
		char yesOrNo;
		Scanner ki = new Scanner(System.in);
		String str1 = new String();

		System.out.println("Game Over...");
		do
		{
			System.out.println("Play Again?");
			str1 = ki.nextLine();
			yesOrNo = str1.charAt(0);
		}while(yesOrNo!='y');
	}
}