import java.lang.*;
import java.util.*;

public class ch7_15{
	public static void main(String args[]){
		CMyClass X[] = new CMyClass[5];
		for(int i=0; i<X.length; i++){
			X[i] = new CMyC
lass();
		}
		COtherClass Obj = new COtherClass();
		Obj.show(X);
	}
}

class CMyClass{
	public int VarA;
	private int VarB;
}

class COtherClass{
	public void show(CMyClass X[]){
		for(int i=0; i<X.length; i++){
			System.out.println("object["+i+"]位置在\t"+X[i]);
		}
	}
}