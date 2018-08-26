import java.lang.*;
import java.util.Scanner;

public class ch6_02{
	public static void main(String args[]){
		int k;
		double Ans;
		Scanner ki = new Scanner(System.in);
		System.out.println("計算3.5的K次方,請輸入K= ");
		k = Integer.parseInt(ki.nextLine());

		Ans = power(3.5, k);
		System.out.println("答案是：" + Ans);
	}
	public static double power(double x, int n){
		double powerXn = 1;
		for(int i=1; i<=n; i++)
			powerXn = powerXn * x;
		return powerXn;
	}
}