import java.lang.*;
import java.util.Scanner;
public class ch5_02{
	public static void main(String args[]){
		int sum = 0;
		double averageM, averageQ;
		Scanner ki = new Scanner(System.in);
		int trades[] = new int[4];		

		for(int element: trades){
			System.out.println("第"+element+"季營業額=");
			element = Integer.parseInt(ki.nextLine());
			sum = sum+element;
		}
		averageM=(double)sum/(double)12;
		averageQ=(double)sum/(double)trades.length;
		System.out.println("季平均="+averageQ);
		System.out.println("月平均	="+averageM);
		System.out.println("trades[0]="+trades[0]);
	}
}