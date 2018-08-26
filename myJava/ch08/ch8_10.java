import java.lang.Object;

public class ch8_10{
	public static void main(String args[]){
		CMyClass X = new CMyClass(5);
		CMyClass Y = new CMyClass(5);
		CMyClass Z = X;
		System.out.println("ObjX & ObjY");
		if(X.equals(Y))
			System.out.println("ObjX = ObjY");
		else
			System.out.println("Different...");
		System.out.println("ObjX & ObjZ");
		if(X.equals(Z))
			System.out.println("ObjX = ObjZ");
		else 
			System.out.println("Different...");
	}
}

class CMyClass{
	private int Var;
	public CMyClass(){}
	public CMyClass(int i){
		Var = i;
	}
}