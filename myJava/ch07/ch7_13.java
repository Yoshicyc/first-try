import java.lang.*;
import java.util.*;

public class ch7_13{
	public static void main(System args[]){
		CMyClass X = new CMyClass(5);
		CMyClass Y = new CMyClass(5);
		CMyClass Z = X;
		System.out.print("X & Y");
		X.compare2Obj(Y);
		System.out.print("X & Z");
		X.compare2Obj(Z);
	}
}

class CMyClass{
	private int Var;
	public CMyClass(){}
	public CMyClass(int i){
		Var = i;
	}
	public void compare2Obj(CMyClass Obj){
		if(this == Obj)
			System.out.println("同");
		else
			System.out.println("異");
	}
}