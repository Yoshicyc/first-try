import java.lang.*;
import java.util.Scanner;

public class ch4_06{
	public static void main(String args[]){
		Scanner keyboardInput = new Scanner(System.in);
		int credit, status;
		double year;

		System.out.print("請輸入信用額度");
		credit = Integer.parseInt(keyboardInput.nextLine());
		System.out.print("繳款是否正常：1正常;2不正常");
		status = Integer.parseInt(keyboardInput.nextLine());

		if(status == 1)
		{
			System.out.print("使用年限");
			year = Double.parseDouble(keyboardInput.nextLine());
			if(year >= 0.5)
			{
				if(year>1){
					System.out.println("可預借＄= "+credit*0.8);
				}
				else{
					System.out.println("可預借＄= "+credit*0.5);
				}
			}
			else
			{
				System.out.println("不外借現金");
			}
		}
		else
		{
			System.out.println("不外借現金");
		}
		
	}

}