import java.util.Scanner;

public class ch10_10{
	public static void main(String args[]){
		CmyClass2 obj2 = new CmyClass2();
		try{
			obj2.run();
		}
		catch(NumberFormatException e){
			System.out.println("Number?");
		}
		catch(ArithmeticException e){
			System.out.println("/0");
		}
		catch(Exception e){
			System.out.println("Something wrong");
		}
		finally{}
	}
}

class CmyClass1{
	private int numerator, denominator;
	public Scanner ki = new Scanner(System.in);
	public void setValue() throws NumberFormatException{
		System.out.print("numerator?");
		numerator = Integer.parseInt(ki.nextLine());
		System.out.print("denominator?");
		denominator = Integer.parseInt(ki.nextLine());
		System.out.println("Input job is done");
	}
	public void printValue() throws ArithmeticException{
		System.out.println("Division is "+numerator/denominator);
		System.out.println("Division done!");
	}
}

class CmyClass2{
	public CmyClass1 obj1 = new CmyClass1();
	public void run() throws NumberFormatException, ArithmeticException{
		obj1.setValue();
		obj1.printValue();
	}
}