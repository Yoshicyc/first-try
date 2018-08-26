import java.lang.*;

public class ch7_14{
	public static void main(String args[]){
		CMyClass X[] = new CMyClass[3];
		for(int i=0; i<X.length; i++){
			X[i] = new CMyClass();
		}
		CMyClass Y[] = new CMyClass[3];
		for(int i=0; i<Y.length; i++){
			Y[i] = new CMyClass(i);
		}
	}
}

class CMyClass{
	public int VarA;
	private int VarB;
	public CMyClass(){System.out.println("no");}
	public CMyClass(int i){
		System.out.println("Yes,Value="+i);
	}
}