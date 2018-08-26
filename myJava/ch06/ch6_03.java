import java.lang.*;
import java.util.Scanner;

public class ch6_03{
	public static void main(String args[]){
		int n, sum;
		char addChoice;
		Scanner ki = new Scanner(System.in);

		System.out.println("1+2+...+n = ? 請輸入n");
		n = Integer.parseInt(ki.nextLine());
		System.out.println("Odd or Eve or All?");
		addChoice = ki.nextLine().charAt(0);
	
		switch(addChoice){
			case 'O':
				sum = Odd(n);
				break;
			case 'E':
				sum = Eve(n);
				break;
			case 'A': 
				sum = All(n);
				break;
			default:
				System.out.println("選擇錯誤");
				return;
		}
		System.out.println("總合為：" + sum);
	}
	
	public static int Odd(int U){
		int i, total = 0;
		for(i=1; i<=U; i++)
			if(i%2 == 1) total = total + i;
		return total;
	}
	public static int Eve(int U){
		int i, total = 0;
		for(i=1; i<= U; i++)
			if(i%2 == 0) total = total +i;
		return total;	
	}
	public static int All(int U){
		return Odd(U) + Eve(U);
	}
}