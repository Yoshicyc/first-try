import java.lang.*;
import java.util.Scanner;
public class ch4_02
{
	public static void main(String args[]){
		Scanner inputboardInput = new Scanner(System.in);
		int OnePrice = 200, Qty;
		double TotalPrice;
		System.out.println("入場票價="+OnePrice+"元");
		System.out.print("您要買幾張?");
		Qty = Integer.parseInt(inputboardInput.nextLine());
		System.out.print("\n");
		
		TotalPrice = OnePrice * Qty;
		if(Qty>=10)
		{
			TotalPrice = TotalPrice * 0.9;
			System.out.println("10張以上打9折");
		}
		else
		{
			System.out.println("10張以內不打折");
		}
		System.out.println("總價 = "+TotalPrice+"元");
	
	}

}