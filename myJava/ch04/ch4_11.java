import java.lang.*;
import java.util.Scanner;
public class ch4_11{
	public static void main(String args[]){
		Scanner kI = new Scanner(System.in);
		int score;
	
		System.out.print("請輸入得分: ");
		score = Integer.parseInt(kI.nextLine());
		if(score>60)
		{
			if(score>=80) System.out.println("不錯");
			else System.out.println("還行");
		}
		else System.out.println("不及格！");
	}
}