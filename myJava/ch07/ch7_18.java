public class ch7_18{
	public static void main(String args[]){
		CMyClass.show("Before");
		CMyClass.Var = 20;
		CMyClass.show("After");
		CMyClass X = new CMyClass();
		X.show("物件呼叫後");
	}
}

class CMyClass{
	public static int Var;
	public static void show(String str){
		System.out.println(str+" Var="+Var);
	}
	static{
		Var = 100;
		System.out.println("類別變數初始化完畢："+Var);
		show("初始化之後");
	}
}