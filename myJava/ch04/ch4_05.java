import java.lang.*;
import java.util.Scanner;

public class ch4_05{
	public static void main(String args[]){
		Scanner keyboardInput = new Scanner(System.in);
		//String str1 = "Bingo";
		String str1 = new String("Bingo");
		int answer = 38;
		int guess;
		
		System.out.print(" 請猜0~99的數字");
		guess = Integer.parseInt(keyboardInput.nextLine());
		if(guess!=answer)
			str1 = (guess>answer)? "猜太大" : "猜太小";
		System.out.println(str1);
	}

}