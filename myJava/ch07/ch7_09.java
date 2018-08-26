import java.lang.*;

public class ch7_09{
	public static void main(String args[]){
		CMyClass X = new CMyClass();
		X.show();
	}
}

class CMyClass{
	public int var = 10;
	public void show(){
		int var = 20;
		System.out.println(var);
		System.out.println(this.var);
	}
}