import java.lang.*;
import java.util.Scanner;

public class ch10_12{
	public static void main(String args[]){
		Scanner ki = new Scanner(System.in);
		int ary[] = new int[]{0,5,10,15};
		int x = 0, num = 0;
		try{
			try{
				System.out.print("元素？");
				x = Integer.parseInt(ki.nextLine());
				num = ary[x];
				System.out.println("ary["+x+"]="+num);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("超出Array大小");
			}
			catch(NumberFormatException e){
				System.out.println("不是數值");
	//			throw e;
			}
		}
		catch(NumberFormatException e){
			System.out.println("應該是數值");
		}
		System.out.println("Program closing");
	}
}