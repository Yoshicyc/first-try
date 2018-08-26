import java.util.Scanner;

public class ch10_11{
	public static void main(String args[]){
		Scanner ki = new Scanner(System.in);
		int ary[] = new int[]{0,5,10,15,20,25,30,35,40,45};
		int x = 0, num = 0;
		try{
			System.out.print("元素幾？");
			x = Integer.parseInt(ki.nextLine());
			try{
				num = ary[x];
				System.out.println("ary["+x+"]="+num);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("超過陣列大小");
			}
		}
		catch(NumberFormatException e){
			System.out.println("不是數值");
		}
		System.out.println("Program closing");
	}
}