import java.util.Scanner;

public class ch10_09{
	public static void main(String args[]){
		CmyClass obj = new CmyClass();
		try{
			obj.setValue();
			obj.printValue();
		}
		catch(NumberFormatException e){
			System.out.println("Exception! Input number");
		}
		catch(ArithmeticException e){
			System.out.println("Exception! 分母=0");
		}
		catch(Exception e){
			System.out.println("Something wrong here");
		}
		finally{}
	}
}

class CmyClass{
	private int numerator, denominator;
	public Scanner ki = new Scanner(System.in);
	public void setValue() throws NumberFormatException{
		System.out.print("numerator =? ");
		numerator = Integer.parseInt(ki.nextLine());
		System.out.print("denominator =? ");
		denominator = Integer.parseInt(ki.nextLine());
		System.out.println("All input is done");
	}
	public void printValue() throws ArithmeticException{
		System.out.println("除法結果為"+numerator/denominator);
		System.out.println("All done");
	}
}