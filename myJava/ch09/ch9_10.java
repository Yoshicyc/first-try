import java.lang.*;

public class ch9_10{
	public static void main(String args[]){
		int i;
		IA obj = new CA();
		obj.show1();
		i = obj.varA;
		System.out.println(i);
	//	obj.varB = 10;
	//	obj.show2();
	}
}

interface IA{
	public static final int varA = 5;
	public abstract void show1();
}

class CA implements IA{
	public int varB;
	@Override public void show1(){
		System.out.println("show1");
	//	System.out.println();
	}
	public void show2(){
		System.out.println("show2");
	}
}