public class ch9_04{
	public static void main(String args[]){
		CCircle1 obj1 = new CCircle1();
		CCircle2 obj2 = new CCircle2();
		obj1.show();
		ICircle.show();
		CCircle2.show();
	}
}

interface ICircle{
	public static void show(){
		System.out.println("Static Interface method");
	}
}

class CCircle1 implements ICircle{
	public void show(){
		System.out.println("Show實體方法");
	}
}

class CCircle2 implements ICircle{
	public static void show(){
		System.out.println("CCircle2的show");
	}
}