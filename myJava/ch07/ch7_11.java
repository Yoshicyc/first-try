import java.lang.*;

public class ch7_11{
	public static void main(String args[]){
		CMyClass X = new CMyClass();
		CMyClass Y = new CMyClass();
		System.out.print("X address\t");
		X.show_this();
		System.out.print("Y address\t");
		Y.show_this();
	}
}

class CMyClass{
	public int var = 10;
	public void show_this(){
		System.out.println(this);
	}
}