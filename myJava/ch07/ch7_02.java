import java.util.Scanner;
import java.lang.*;

public class ch7_02{
	public static void main(String args[]){
		CMyClass X = new CMyClass();
		X.initVar();
		X.showVar();

		X.addVar(10);
		X.showVar();

		System.out.print("列印物件X \t");
		X.showVar();
	}
}

class CMyClass{
	public void initVar(){
		Var = 1;
	}
	public void addVar(int a){
		Var = Var + a;
	}
	public void showVar(){
		realShow();
	}
	
	private int Var;
	private void realShow(){
		System.out.println("Var="+Var);
	}
	
}