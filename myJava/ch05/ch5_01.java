import java.lang.*;
import java.util.Scanner;
public class ch5_01{
	public static void main(String args[]){
		int sum = 0;
		double averageQ, averageM;
		Scanner ki = new Scanner(System.in);

		int trades[] = new int[4];
		for(int i=0; i<trades.length; i++){
			System.out.println("請輸入第"+(i+1)+"季的營業額：");
			trades[i] = Integer.parseInt(ki.nextLine());
			sum = sum+trades[i];
		}
		averageQ = (double)sum/trades.length;
		averageM = (double)sum/(double)12;
		System.out.println("=====================");
		System.out.println("月平均＝"+ averageM);
		System.out.println("季平均＝"+ averageQ);
	}	
}