import java.lang.*;
import java.util.Scanner;

public class ch6_04{
	public static void main(String args[]){
	int m, n;
	Scanner ki = new Scanner(System.in);	
	long temp[] = new long[3];
	long ans;	

	System.out.println("求排列組合 C(m,n) ");
	System.out.println("m = ? ");
	m = Integer.parseInt(ki.nextLine());
	System.out.println("n = ? ");
	n = Integer.parseInt(ki.nextLine());

	temp[0] = f(m);
	temp[1] = f(n);
	temp[2] = f(m-n);
	ans = (temp[0])/(temp[1]*temp[2]);
	System.out.println("答案是：" +ans);
	}

	public static long f(int c){
		int i;
		long fAns = 1L; 
		
		for(i=1; i<=c; i++)
			fAns = fAns * i;
		return fAns;
	}
}