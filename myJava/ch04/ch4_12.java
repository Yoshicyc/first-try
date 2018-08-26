import java.lang.*;
import java.util.Scanner;
public class ch4_12{
	public static void main(String args[]){
		Scanner kI = new Scanner(System.in);
		int score;
		System.out.print("輸入您的分數：");
		score = Integer.parseInt(kI.nextLine());
		
		if(score>=0 && score<=100)
		{
			switch(score/10){
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("B");
				break;
			case 8:
				System.out.println("C");
				break;
			default:
				System.out.println("OK");
				break;
			}
		}
		else 
			System.out.println("輸入的分數不合法");
	}
}