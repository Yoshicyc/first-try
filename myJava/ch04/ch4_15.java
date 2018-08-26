import java.lang.*;
import java.util.Scanner;

public class ch4_15
{
	public static void main(String args[]){
		int sum=0, n;
		Scanner ki = new Scanner(System.in);

		System.out.println("請輸入連加次數");
		n = Integer.parseInt(ki.nextLine());
		for(int i=1; i<=n; i=i+2)
		{
			sum = sum + i;
		}
		System.out.print(sum);
		if(n%2==1) System.out.println(": 1+3+n");
		else System.out.println(": 1+3+n-1");
	}
}