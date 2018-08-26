import java.lang.*;
import java.util.Scanner;

public class ch4_01{
	public static void main(String args[]){
		Scanner keyboardInput = new Scanner(System.in);
		int x;
		String str1 = new String("正數 or 0");
		System.out.println("請輸入整數");
		x = Integer.parseInt(keyboardInput.nextLine());
		if(x<0)
			str1 = "負數";
		System.out.println(str1);
	}
}