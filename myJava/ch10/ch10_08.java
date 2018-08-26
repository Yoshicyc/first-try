import java.util.Scanner;

public class ch10_08{
	public static void main(String args[]){
		Scanner ki = new Scanner(System.in);
		int lottoSize = 0;
		int lottoArray[] = new int[lottoSize];
		
		while(true){
			try{
				System.out.print("Lotto Size =? ");
				lottoSize = Integer.parseInt(ki.nextLine());
				lottoArray = new int[lottoSize];
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Not an Number!");
			}
			catch(Exception e){
				System.out.println("Something wrong here");
			}
			finally{
			}
		}
		System.out.println("All done good!");
	}
}