import java.lang.*;
import java.util.Scanner;
public class ch4_19
{
	public static void main(String args[])
	{
		Scanner ki = new Scanner(System.in);
		int sum=0, i, n;

		System.out.println("求1~n的總和,請輸入n值");
		n = Integer.parseInt(ki.nextLine());
		for(i=1; i<=n; i++)
		{
			if(sum>Integer.MAX_VALUE-100)
				break;
			sum=sum+i;
		}System.out.println(sum);
	}
}