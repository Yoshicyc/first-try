import java.lang.*;
import java.util.Scanner;


public class ch4_08{
	public static void main(String args[]){
		Scanner keyboardInput = new Scanner(System.in);
		int score;
	
		System.out.print("請輸入成績 ");
		score = Integer.parseInt(keyboardInput.nextLine());

		if(score>=90) {System.out.println("甲級分");}
		else if(score>=60) {System.out.println("乙級分");}
		else if(score>=20) {System.out.println("不及格");}
		else {System.out.println("低於20分");}
	}


}