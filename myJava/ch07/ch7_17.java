import java.lang.*;
public class ch7_17{
	public static void main(String args[]){
		CMyClass.show("修改前");
		CMyClass.Var = 20;
		CMyClass.show("修改後");
		CMyClass X = new CMyClass();
		X.show("使用物件呼叫時");
	}
}

class CMyClass{
	public static int Var = 10;
	public static void show(String str){
		System.out.println(str+"Var="+Var);
	}
}