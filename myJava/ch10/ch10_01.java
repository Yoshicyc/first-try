import java.util.Scanner;

public class ch10_01{
	public static void main(String args[]){
		fraction obj = new fraction();
		obj.set_value();
		obj.print_value();
	}
}

class fraction{
	private Scanner ki;
	private int nor;
	private int dor;
	public fraction(){
		ki = new Scanner(System.in);
	}
	public void set_value(){
		System.out.print("分子= ");
		nor = Integer.parseInt(ki.nextLine());
		System.out.print("分母= ");
		dor = Integer.parseInt(ki.nextLine());
	}
	public void print_value(){
		System.out.print(nor+" / "+dor+"= ");
		System.out.println(nor/dor);
	}
}