import java.lang.*;
import java.lang.Math;
public class ch6_01{
	public static void main(String args[]){
		double i = 7.0, j = 4.0;
		double powNum, logNum;

		powNum = Math.pow(i,j);
		System.out.println(i+"的"+j+"次方＝"+powNum);
		logNum = Math.log(powNum);
		System.out.println(powNum+"取10的對數="+logNum);
	}
}