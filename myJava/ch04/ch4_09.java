import java.lang.*;
import java.util.Scanner;
public class ch4_09{
	public static void main(String args[]){
		Scanner kI = new Scanner(System.in);
		double k,tk=40.5f;
		
		System.out.println("40.5台斤 = ?公斤");
		k = Double.parseDouble(kI.nextLine());
		
		if(k==tk*0.6) {System.out.print("答對了！");}
		else {System.out.println("答錯了！");}
	}

}